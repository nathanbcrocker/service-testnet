package co.uk.bankcorp.port.repository;

import co.uk.bankcorp.core.adapters.TransactionAdapter;
import co.uk.bankcorp.core.utils.Constants;
import co.uk.bankcorp.port.model.*;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static co.uk.bankcorp.core.utils.Constants.MULTIPLIER;
import static java.util.stream.Collectors.toList;

@Repository
public class DynamicOBReadTransaction6Repository implements OBReadTransaction6Repository {

    @Override
    public Optional<OBReadTransaction6> findAllByAccountId(String accountId) {
        int accountIdAsInteger = accountIdAsInteger(accountId);
        int tCount = (accountIdAsInteger % 6) + 1;

        var transaction = new OBReadTransaction6();
        var data = new OBReadDataTransaction6();
        transaction.setData(data);
        var list = build(tCount, accountId);
        list.forEach(transaction.getData()::addTransactionItem);

        if (!list.isEmpty()) {
            list = build(1, String.valueOf(accountIdAsInteger + 1));
            list.forEach(transaction.getData()::addTransactionItem);
        } else {
            return Optional.empty();
        }

        return Optional.of(transaction);
    }

    private List<OBTransaction6> build(final int transactionCount, final String accountId) {
        var transactionIdBase = new Random().nextInt(20000);
        return IntStream.rangeClosed(0, transactionCount)
                .mapToObj(i -> {
                    double amount = new Random().nextDouble() * 500.00;
                    int merchant = new Random().nextInt(merchantNames.length);
                    return
                            TransactionAdapter
                                    .external()
                                    .transaction(accountId)
                                    .transactionId(String.valueOf(transactionIdBase + i))
                                    .amount(amount * MULTIPLIER)
                                    .creditOrDebit(creditOrDebit())
                                    .exchangeRate("USD", MULTIPLIER)
                                    .merchantDetails(merchantNames[merchant], merchants.get(merchantNames[merchant]))
                                    .date(new Date())
                                    .build();
                })
                .collect(toList());
    }

    private Integer accountIdAsInteger(final String accountId) {
        try {
            return Integer.parseInt(accountId);
        } catch (Exception ex) {
            return 0;
        }
    }

    private String creditOrDebit() {
        double dist = new Random().nextDouble();
        var type = dist >= .9 ? "Credit" : "Debit";
        return type == null ? "Credit" : type;
    }

    private Map<String, String> merchants = Map.of("Acme", "5099", "Globex", "5169", "Morley", "5411", "Contoso", "5137");
    private String[] merchantNames = merchants.keySet().toArray(new String[merchants.keySet().size()]);
}
