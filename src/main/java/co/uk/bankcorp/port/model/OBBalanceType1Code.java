package co.uk.bankcorp.port.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Balance type, in a coded form.
 */
public enum OBBalanceType1Code {
  CLOSINGAVAILABLE("ClosingAvailable"),
    CLOSINGBOOKED("ClosingBooked"),
    CLOSINGCLEARED("ClosingCleared"),
    EXPECTED("Expected"),
    FORWARDAVAILABLE("ForwardAvailable"),
    INFORMATION("Information"),
    INTERIMAVAILABLE("InterimAvailable"),
    INTERIMBOOKED("InterimBooked"),
    INTERIMCLEARED("InterimCleared"),
    OPENINGAVAILABLE("OpeningAvailable"),
    OPENINGBOOKED("OpeningBooked"),
    OPENINGCLEARED("OpeningCleared"),
    PREVIOUSLYCLOSEDBOOKED("PreviouslyClosedBooked");

  private String value;

  OBBalanceType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBBalanceType1Code fromValue(String text) {
    for (OBBalanceType1Code b : OBBalanceType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
