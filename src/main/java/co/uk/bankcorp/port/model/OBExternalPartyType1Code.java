package co.uk.bankcorp.port.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Party type, in a coded form.
 */
public enum OBExternalPartyType1Code {
  DELEGATE("Delegate"),
    JOINT("Joint"),
    SOLE("Sole");

  private String value;

  OBExternalPartyType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalPartyType1Code fromValue(String text) {
    for (OBExternalPartyType1Code b : OBExternalPartyType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
