package co.uk.bankcorp.port.repository;

import co.uk.bankcorp.core.adapters.TransactionAdapter;
import co.uk.bankcorp.core.utils.Constants;
import co.uk.bankcorp.port.model.*;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

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

    private List<OBTransaction6> build(final int tCount, final String accountId) {
        var data = new ArrayList<OBTransaction6>();
        var transactionIdBase = new Random().nextInt(20000);
        for (int i = 0; i < tCount; i++) {
            double amount = new Random().nextDouble() * 1000;
            int merchant = new Random().nextInt(merchantNames.length);
            var t =
                    TransactionAdapter
                            .OBTransaction6Builder
                            .transaction(accountId)
                            .transactionId(String.valueOf(transactionIdBase + i))
                            .amount(amount * Constants.MULTIPLIER)
                            .creditOrDebit(creditOrDebit())
                            .exchangeRate("USD", 1 * Constants.MULTIPLIER)
                            .merchantDetails(merchantNames[merchant], merchants.get(merchantNames[merchant]))
                            .build();
            data.add(t);
        }

        return data;
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
        return type;
    }

    private Map<String, String> merchants = Map.of("Acme", "5099", "Globex", "5169", "Morley", "5411", "Contoso", "5137");
    private String[] merchantNames = merchants.keySet().toArray(new String[merchants.keySet().size()]);
}
