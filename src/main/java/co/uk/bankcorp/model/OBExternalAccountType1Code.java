package co.uk.bankcorp.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specifies the type of account (personal or business).
 */
public enum OBExternalAccountType1Code {
  BUSINESS("Business"),
    PERSONAL("Personal");

  private String value;

  OBExternalAccountType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalAccountType1Code fromValue(String text) {
    for (OBExternalAccountType1Code b : OBExternalAccountType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
