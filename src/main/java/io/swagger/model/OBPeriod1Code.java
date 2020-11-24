package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Period e.g. day, week, month etc. for which the fee/charge is capped
 */
public enum OBPeriod1Code {
  PACT("PACT"),
    PDAY("PDAY"),
    PHYR("PHYR"),
    PMTH("PMTH"),
    PQTR("PQTR"),
    PWEK("PWEK"),
    PYER("PYER");

  private String value;

  OBPeriod1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBPeriod1Code fromValue(String text) {
    for (OBPeriod1Code b : OBPeriod1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
