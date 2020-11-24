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
 * Other application frequencies that are not available in the standard code list
 */
@ApiModel(description = "Other application frequencies that are not available in the standard code list")
@Validated



public class OtherApplicationFrequency   {
  @JsonProperty("Code")
  private String code = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Description")
  private String description = null;

  public OtherApplicationFrequency code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
  **/
  @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")
  
  @Pattern(regexp="^\\w{0,4}$") @Size(max=4)   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OtherApplicationFrequency name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the code
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Long name associated with the code")
      @NotNull

  @Size(min=1,max=70)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OtherApplicationFrequency description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description to describe the purpose of the code
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
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
    OtherApplicationFrequency otherApplicationFrequency = (OtherApplicationFrequency) o;
    return Objects.equals(this.code, otherApplicationFrequency.code) &&
        Objects.equals(this.name, otherApplicationFrequency.name) &&
        Objects.equals(this.description, otherApplicationFrequency.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherApplicationFrequency {\n");
    
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
