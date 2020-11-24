package co.uk.bankcorp.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specifies the Beneficiary Type.
 */
public enum OBBeneficiaryType1Code {
  TRUSTED("Trusted"),
    ORDINARY("Ordinary");

  private String value;

  OBBeneficiaryType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBBeneficiaryType1Code fromValue(String text) {
    for (OBBeneficiaryType1Code b : OBBeneficiaryType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
