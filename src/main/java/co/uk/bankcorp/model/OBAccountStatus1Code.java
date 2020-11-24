package co.uk.bankcorp.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the status of account resource in code form.
 */
public enum OBAccountStatus1Code {
  DELETED("Deleted"),
    DISABLED("Disabled"),
    ENABLED("Enabled"),
    PENDING("Pending"),
    PROFORMA("ProForma");

  private String value;

  OBAccountStatus1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBAccountStatus1Code fromValue(String text) {
    for (OBAccountStatus1Code b : OBAccountStatus1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
