package co.uk.bankcorp.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * How frequently the fee/charge is calculated
 */
public enum OBFeeFrequency1Code3 {
  FEAC("FEAC"),
    FEAO("FEAO"),
    FECP("FECP"),
    FEDA("FEDA"),
    FEHO("FEHO"),
    FEI("FEI"),
    FEMO("FEMO"),
    FEOA("FEOA"),
    FEOT("FEOT"),
    FEPC("FEPC"),
    FEPH("FEPH"),
    FEPO("FEPO"),
    FEPS("FEPS"),
    FEPT("FEPT"),
    FEPTA("FEPTA"),
    FEPTP("FEPTP"),
    FEQU("FEQU"),
    FESM("FESM"),
    FEST("FEST"),
    FEWE("FEWE"),
    FEYE("FEYE");

  private String value;

  OBFeeFrequency1Code3(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBFeeFrequency1Code3 fromValue(String text) {
    for (OBFeeFrequency1Code3 b : OBFeeFrequency1Code3.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
