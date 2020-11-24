package co.uk.bankcorp.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specifies the Mutability of the Transaction record.
 */
public enum OBTransactionMutability1Code {
  MUTABLE("Mutable"),
    IMMUTABLE("Immutable");

  private String value;

  OBTransactionMutability1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBTransactionMutability1Code fromValue(String text) {
    for (OBTransactionMutability1Code b : OBTransactionMutability1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
