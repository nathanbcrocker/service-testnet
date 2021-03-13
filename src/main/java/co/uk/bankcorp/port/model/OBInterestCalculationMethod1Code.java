package co.uk.bankcorp.port.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Methods of calculating interest
 */
public enum OBInterestCalculationMethod1Code {
  ITCO("ITCO"),
    ITOT("ITOT"),
    ITSI("ITSI");

  private String value;

  OBInterestCalculationMethod1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBInterestCalculationMethod1Code fromValue(String text) {
    for (OBInterestCalculationMethod1Code b : OBInterestCalculationMethod1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
