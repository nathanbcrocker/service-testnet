package co.uk.bankcorp.port.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
 */
public enum OBInterestRateType1Code1 {
  INBB("INBB"),
    INFR("INFR"),
    INGR("INGR"),
    INLR("INLR"),
    INNE("INNE"),
    INOT("INOT");

  private String value;

  OBInterestRateType1Code1(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBInterestRateType1Code1 fromValue(String text) {
    for (OBInterestRateType1Code1 b : OBInterestRateType1Code1.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
