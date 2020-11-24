package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Other interest rate types which are not available in the standard code list
 */
@ApiModel(description = "Other interest rate types which are not available in the standard code list")
@Validated



public class OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType   {
  @JsonProperty("Code")
  private String code = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Description")
  private String description = null;

  public OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^\\w{0,4}$")   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Size(min=1,max=70)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Size(min=1,max=350)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType obReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType = (OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType) o;
    return Objects.equals(this.code, obReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType.code) &&
        Objects.equals(this.name, obReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType.name) &&
        Objects.equals(this.description, obReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
