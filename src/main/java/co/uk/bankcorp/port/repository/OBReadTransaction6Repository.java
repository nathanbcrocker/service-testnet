package co.uk.bankcorp.port.repository;

import co.uk.bankcorp.port.model.OBReadTransaction6;

import java.util.Optional;

public interface OBReadTransaction6Repository {
    Optional<OBReadTransaction6> findAllByAccountId(final String accountId);
}
