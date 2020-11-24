package co.uk.bankcorp.service;

import co.uk.bankcorp.repository.OBReadTransaction6Repository;
import co.uk.bankcorp.model.OBReadTransaction6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OBReadTransaction6Service {

    public OBReadTransaction6 findAllByAccountId(final String accountId) {
        return transactionRepository.findAllByAccountId(accountId);
    }

    @Autowired
    private OBReadTransaction6Repository transactionRepository;
}
