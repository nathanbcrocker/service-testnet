package co.uk.bankcorp.port.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Fee/Charge Type
 */
public enum OBFeeType1Code {
  FEPF("FEPF"),
    FTOT("FTOT"),
    FYAF("FYAF"),
    FYAM("FYAM"),
    FYAQ("FYAQ"),
    FYCP("FYCP"),
    FYDB("FYDB"),
    FYMI("FYMI"),
    FYXX("FYXX");

  private String value;

  OBFeeType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBFeeType1Code fromValue(String text) {
    for (OBFeeType1Code b : OBFeeType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
