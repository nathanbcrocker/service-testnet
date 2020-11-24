package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specifies the sub type of account (product family group).
 */
public enum OBExternalAccountSubType1Code {
  CHARGECARD("ChargeCard"),
    CREDITCARD("CreditCard"),
    CURRENTACCOUNT("CurrentAccount"),
    EMONEY("EMoney"),
    LOAN("Loan"),
    MORTGAGE("Mortgage"),
    PREPAIDCARD("PrePaidCard"),
    SAVINGS("Savings");

  private String value;

  OBExternalAccountSubType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalAccountSubType1Code fromValue(String text) {
    for (OBExternalAccountSubType1Code b : OBExternalAccountSubType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
