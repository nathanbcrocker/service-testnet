package co.uk.bankcorp.port.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Period e.g. day, week, month etc. for which the fee/charge is capped
 */
public enum OBPeriod1Code {
  PACT("PACT"),
    PDAY("PDAY"),
    PHYR("PHYR"),
    PMTH("PMTH"),
    PQTR("PQTR"),
    PWEK("PWEK"),
    PYER("PYER");

  private String value;

  OBPeriod1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBPeriod1Code fromValue(String text) {
    for (OBPeriod1Code b : OBPeriod1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
