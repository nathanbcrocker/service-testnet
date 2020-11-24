package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Identifies the nature of the postal address.
 */
public enum OBAddressTypeCode {
  BUSINESS("Business"),
    CORRESPONDENCE("Correspondence"),
    DELIVERYTO("DeliveryTo"),
    MAILTO("MailTo"),
    POBOX("POBox"),
    POSTAL("Postal"),
    RESIDENTIAL("Residential"),
    STATEMENT("Statement");

  private String value;

  OBAddressTypeCode(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBAddressTypeCode fromValue(String text) {
    for (OBAddressTypeCode b : OBAddressTypeCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
