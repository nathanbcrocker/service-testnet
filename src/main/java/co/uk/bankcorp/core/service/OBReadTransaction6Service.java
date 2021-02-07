package co.uk.bankcorp.core.service;

import co.uk.bankcorp.core.adapters.TransactionAdapter;
import co.uk.bankcorp.core.model.Transaction;
import co.uk.bankcorp.port.model.OBReadDataTransaction6;
import co.uk.bankcorp.port.repository.OBReadTransaction6Repository;
import co.uk.bankcorp.port.model.OBReadTransaction6;
import co.uk.bankcorp.core.repository.TransactionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service
@Slf4j
public class OBReadTransaction6Service {

    @Autowired
    public OBReadTransaction6Service(final OBReadTransaction6Repository obReadTransaction6Repository,
                                     final TransactionRepository transactionRepository) {
        this.obReadTransaction6Repository = obReadTransaction6Repository;
        this.transactionRepository = transactionRepository;
    }

    public Optional<OBReadTransaction6> findAllByAccountId(final String accountId) {
        return getFromRepository(accountId)
                .or(() -> generateAndStore(accountId));
    }

    @Transactional
    protected Optional<OBReadTransaction6> generateAndStore(final String accountId) {
        var t = obReadTransaction6Repository.findAllByAccountId(accountId);
        log.info("generating a transaction list for accountId {}", accountId);
        var list = t.get().getData().getTransaction();
        Collection<Transaction> transactions = new TransactionAdapter().adaptOBTransaction6List(list);
        log.info("storing the transaction list for accountId {}", accountId);
        transactionRepository.saveAll(transactions);
        return t;
    }

    private Optional<OBReadTransaction6> getFromRepository(final String accountId) {
        var list = transactionRepository.findAllByAccountId(accountId);
        if (list.isEmpty()) {
            log.info("unable to locate a transaction list for accountId {}", accountId);
            return Optional.empty();
        }

        var adapter = new TransactionAdapter();
        var transaction = new OBReadTransaction6();
        var data = new OBReadDataTransaction6();
        transaction.setData(data);
        list.forEach(t -> data.addTransactionItem(adapter.adapt(t)));
        return Optional.of(transaction);
    }

    private OBReadTransaction6Repository obReadTransaction6Repository;
    private TransactionRepository transactionRepository;
}
