package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specifies the status of the direct debit in code form.
 */
public enum OBExternalDirectDebitStatus1Code {
  ACTIVE("Active"),
    INACTIVE("Inactive");

  private String value;

  OBExternalDirectDebitStatus1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalDirectDebitStatus1Code fromValue(String text) {
    for (OBExternalDirectDebitStatus1Code b : OBExternalDirectDebitStatus1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
