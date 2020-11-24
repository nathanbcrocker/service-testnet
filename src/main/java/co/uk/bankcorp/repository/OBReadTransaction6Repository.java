package co.uk.bankcorp.repository;

import co.uk.bankcorp.model.OBReadTransaction6;
public interface OBReadTransaction6Repository {
    OBReadTransaction6 findAllByAccountId(final String accountId);
}
