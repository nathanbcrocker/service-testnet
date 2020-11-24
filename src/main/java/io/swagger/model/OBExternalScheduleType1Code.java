package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specifies the scheduled payment date type requested
 */
public enum OBExternalScheduleType1Code {
  ARRIVAL("Arrival"),
    EXECUTION("Execution");

  private String value;

  OBExternalScheduleType1Code(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalScheduleType1Code fromValue(String text) {
    for (OBExternalScheduleType1Code b : OBExternalScheduleType1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
