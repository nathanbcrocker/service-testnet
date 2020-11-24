package co.uk.bankcorp.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Categorisation of fees and charges into standard categories.
 */
public enum OBFeeCategory1Code {
  FCOT("FCOT"),
    FCRE("FCRE"),
    FCSV("FCSV");

  private String value;

  OBFeeCategory1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBFeeCategory1Code fromValue(String text) {
    for (OBFeeCategory1Code b : OBFeeCategory1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
