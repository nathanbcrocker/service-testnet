package co.uk.bankcorp.port.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specifies the status of the standing order in code form.
 */
public enum OBExternalStandingOrderStatus1Code {
  ACTIVE("Active"),
    INACTIVE("Inactive");

  private String value;

  OBExternalStandingOrderStatus1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalStandingOrderStatus1Code fromValue(String text) {
    for (OBExternalStandingOrderStatus1Code b : OBExternalStandingOrderStatus1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
