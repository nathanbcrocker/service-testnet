package co.uk.bankcorp.port.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.
 */
public enum OBCreditDebitCode2 {
  CREDIT("Credit"),
    DEBIT("Debit");

  private String value;

  OBCreditDebitCode2(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBCreditDebitCode2 fromValue(String text) {
    for (OBCreditDebitCode2 b : OBCreditDebitCode2.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
