package co.uk.bankcorp.core.adapters;

import co.uk.bankcorp.core.model.Transaction;
import co.uk.bankcorp.core.utils.Constants;
import co.uk.bankcorp.port.model.*;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.lang.Math;

import static java.util.stream.Collectors.toList;

public class TransactionAdapter {

    public List<OBTransaction6> adaptTransactionList(final List<Transaction> transactionList) {
        return transactionList
                .stream()
                .map(this::adapt)
                .collect(toList());
    }

    public Optional<OBTransaction6> adapt(final Optional<Transaction> transactionOptional) {
        return transactionOptional
                .map(this::map);
    }

    public OBTransaction6 adapt(Transaction transaction) {
        if (transaction == null) {
            return null;
        }

        return map(transaction);
    }

    public List<Transaction> adaptOBTransaction6List(final List<OBTransaction6> transaction6List) {
        return transaction6List
                .stream()
                .map(this::adapt)
                .collect(toList());
    }

    public Transaction adapt(final OBTransaction6 transaction6) {
        if (transaction6 == null) {
            return null;
        }

        return map(transaction6);
    }

    private Transaction map(final OBTransaction6 t) {
        return internal()
                .transaction(t.getAccountId())
                .transactionId(t.getTransactionId())
                .amount(Double.parseDouble(t.getAmount().getAmount()))
                .creditOrDebit(t.getCreditDebitIndicator().name())
                .exchangeRate(t.getCurrencyExchange().getUnitCurrency(),
                        t.getCurrencyExchange().getExchangeRate().doubleValue())
                .merchantDetails(t.getMerchantDetails().getMerchantName(),
                        t.getMerchantDetails().getMerchantCategoryCode())
                .date(t.getBookingDateTime() == null ? new Date() : new Date(t.getBookingDateTime().toLocalDate().toEpochDay()))
                .build();
    }

    private OBTransaction6 map(final Transaction t) {
        return external()
                .transaction(t.getAccountId())
                .transactionId(t.getId())
                .amount(t.getAmount())
                .creditOrDebit(t.getType())
                .exchangeRate(t.getCurrency(), t.getExchangeRate())
                .merchantDetails(t.getMerchantName(), t.getMerchantCategoryCode())
                .date(t.getDate())
                .build();
    }

    public static class internal {
        public internal() {
            transaction = new Transaction();
        }

        public internal transaction(final String accountId) {
            transaction.setAccountId(accountId);
            return this;
        }

        public internal transactionId(final Long transactionId) {
            if (transactionId != null) {
                transaction.setId(transactionId);
            }

            return this;
        }

        public internal transactionId(final String transactionId) {
            if (transactionId != null) {
                transaction.setId(Long.getLong(transactionId));
            }

            return this;
        }

        public internal amount(final double amount) {
            transaction.setAmount((long)Math.round(amount * Constants.MULTIPLIER));
            return this;
        }

        public internal creditOrDebit(final String type) {
            transaction.setType(type);
            return this;
        }

        public internal exchangeRate(final String currency, final double rate) {
            transaction.setCurrency(currency);
            transaction.setExchangeRate((long)Math.round(rate * Constants.MULTIPLIER));
            return this;
        }

        public internal merchantDetails(final String merchantName, final String merchantCategoryCode) {
            transaction.setMerchantName(merchantName);
            transaction.setMerchantCategoryCode(merchantCategoryCode);
            return this;
        }

        public internal date(final Date date) {
            transaction.setDate(date);
            return this;
        }

        public Transaction build() {
            return transaction;
        }

        private Transaction transaction;
    }

    public static external external() {
        return new external();
    }

    public static internal internal() {
        return new internal();
    }

    public static class external {
        protected external() {
            transaction = new OBTransaction6();
        }

        public external transaction(final String accountId) {
            var builder = new external();
            builder.transaction.setAccountId(accountId);
            return builder;
        }

        public external transactionId(final long transactionId) {
            return transactionId(String.valueOf(transactionId));
        }

        public external transactionId(final String transactionId) {
            transaction.setTransactionId(transactionId);
            return this;
        }

        public external amount(final double amount) {
            var a = new OBActiveOrHistoricCurrencyAndAmount9();
            a.setAmount(df.format(amount / Constants.MULTIPLIER));
            this.transaction.setAmount(a);
            return this;
        }

        public external exchangeRate(final String currency, final long rate) {
            if (this.transaction.getAmount() != null) {
                this.transaction.getAmount().setCurrency(currency);
            }

            var e = new OBCurrencyExchange5();
            e.setSourceCurrency(currency);
            e.setTargetCurrency(currency);
            e.setUnitCurrency(currency);
            e.setExchangeRate(BigDecimal.valueOf(rate / Constants.MULTIPLIER));
            this.transaction.setCurrencyExchange(e);
            return this;
        }

        public external creditOrDebit(final String type) {
            var c = OBCreditDebitCode1.fromValue(type);
            this.transaction.setCreditDebitIndicator(c);
            return this;
        }

        public external merchantDetails(final String merchantName, final String merchantCategoryCode) {
            var m = new OBMerchantDetails1();
            m.setMerchantName(merchantName);
            m.setMerchantCategoryCode(merchantCategoryCode);
            this.transaction.setMerchantDetails(m);
            return this;
        }

        public external date(final Date date) {
            transaction.setBookingDateTime(OffsetDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault()));
            return this;
        }

        public OBTransaction6 build() {
            return transaction;
        }

        private final DecimalFormat df = new DecimalFormat("###.##");
        private OBTransaction6 transaction;
    }
}
