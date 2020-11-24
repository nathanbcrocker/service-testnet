package io.swagger.repository;

import io.swagger.model.*;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Repository
public class DynamicOBReadTransaction6Repository implements OBReadTransaction6Repository{
    @Override
    public OBReadTransaction6 findAllByAccountId(String accountId) {
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
        }

        return transaction;
    }

    private List<OBTransaction6> build(final int tCount, final String accountId) {
        var data = new ArrayList<OBTransaction6>();
        var transactionIdBase = new Random().nextInt(20000);
        for (int i = 0; i < tCount; i++) {
            double amount = new Random().nextDouble() * 1000;
            var t = transaction(accountId);
            t.setTransactionId(String.valueOf(transactionIdBase + i));
            t.setAmount(amount(amount));
            t.setCreditDebitIndicator(creditOrDebit());
            t.setCurrencyExchange(exchangeRate());
            t.setMerchantDetails(merchantDetails());
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

    private OBTransaction6 transaction(final String accountId) {
        var t = new OBTransaction6();
        t.setAccountId(accountId);
        return t;
    }

    private OBActiveOrHistoricCurrencyAndAmount9 amount(final double amount) {
        var a = new OBActiveOrHistoricCurrencyAndAmount9();
        a.setAmount(df.format(amount));
        a.setCurrency("USD");
        return a;
    }

    private OBCurrencyExchange5 exchangeRate() {
        var e = new OBCurrencyExchange5();
        e.setSourceCurrency("USD");
        e.setTargetCurrency("USD");
        e.setUnitCurrency("USD");
        e.setExchangeRate(BigDecimal.ONE);
        return e;
    }

    private OBCreditDebitCode1 creditOrDebit() {
        double dist = new Random().nextDouble();
        var type = dist >= .9 ? "Credit" : "Debit";
        return OBCreditDebitCode1.fromValue(type);
    }
    private OBMerchantDetails1 merchantDetails() {
        var m = new OBMerchantDetails1();
        int merchant = new Random().nextInt(merchantNames.length);
        m.setMerchantName(merchantNames[merchant]);
        m.setMerchantCategoryCode(merchants.get(m.getMerchantName()));
        return m;
    }

    private Map<String, String> merchants = Map.of("Acme", "5099", "Globex", "5169", "Morley", "5411", "Contoso", "5137");
    private String[] merchantNames = merchants.keySet().toArray(new String[merchants.keySet().size()]);
    private final DecimalFormat df = new DecimalFormat("###.##");
}
