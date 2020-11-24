package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.
 */
public enum OBCreditDebitCode0 {
  CREDIT("Credit"),
    DEBIT("Debit");

  private String value;

  OBCreditDebitCode0(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBCreditDebitCode0 fromValue(String text) {
    for (OBCreditDebitCode0 b : OBCreditDebitCode0.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
