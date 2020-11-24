package io.swagger.service;

import io.swagger.model.OBReadTransaction6;
import io.swagger.repository.OBReadTransaction6Repository;
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
