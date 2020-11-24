package co.uk.bankcorp.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Statement type, in a coded form.
 */
public enum OBExternalStatementType1Code {
  ACCOUNTCLOSURE("AccountClosure"),
    ACCOUNTOPENING("AccountOpening"),
    ANNUAL("Annual"),
    INTERIM("Interim"),
    REGULARPERIODIC("RegularPeriodic");

  private String value;

  OBExternalStatementType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalStatementType1Code fromValue(String text) {
    for (OBExternalStatementType1Code b : OBExternalStatementType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
