package co.uk.bankcorp.port.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Min Max type
 */
public enum OBMinMaxType1Code {
  FMMN("FMMN"),
    FMMX("FMMX");

  private String value;

  OBMinMaxType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBMinMaxType1Code fromValue(String text) {
    for (OBMinMaxType1Code b : OBMinMaxType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
