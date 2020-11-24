package io.swagger.repository;

import io.swagger.model.OBReadTransaction6;
public interface OBReadTransaction6Repository {
    OBReadTransaction6 findAllByAccountId(final String accountId);
}
