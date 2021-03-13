package co.uk.bankcorp.port.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Set of elements used to provide details of a generic number value related to the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic number value related to the statement resource.")
@Validated



public class OBStatement2StatementValue   {
  @JsonProperty("Value")
  private String value = null;

  @JsonProperty("Type")
  private String type = null;

  public OBStatement2StatementValue value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Size(min=1,max=40)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OBStatement2StatementValue type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementValue obStatement2StatementValue = (OBStatement2StatementValue) o;
    return Objects.equals(this.value, obStatement2StatementValue.value) &&
        Objects.equals(this.type, obStatement2StatementValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
