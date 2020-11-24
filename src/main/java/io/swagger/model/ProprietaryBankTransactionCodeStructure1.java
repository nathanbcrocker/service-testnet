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
 * Set of elements to fully identify a proprietary bank transaction code.
 */
@ApiModel(description = "Set of elements to fully identify a proprietary bank transaction code.")
@Validated



public class ProprietaryBankTransactionCodeStructure1   {
  @JsonProperty("Code")
  private String code = null;

  @JsonProperty("Issuer")
  private String issuer = null;

  public ProprietaryBankTransactionCodeStructure1 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Proprietary bank transaction code to identify the underlying transaction.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Proprietary bank transaction code to identify the underlying transaction.")
      @NotNull

  @Size(min=1,max=35)   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ProprietaryBankTransactionCodeStructure1 issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Identification of the issuer of the proprietary bank transaction code.
   * @return issuer
  **/
  @ApiModelProperty(value = "Identification of the issuer of the proprietary bank transaction code.")
  
  @Size(min=1,max=35)   public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCodeStructure1 = (ProprietaryBankTransactionCodeStructure1) o;
    return Objects.equals(this.code, proprietaryBankTransactionCodeStructure1.code) &&
        Objects.equals(this.issuer, proprietaryBankTransactionCodeStructure1.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProprietaryBankTransactionCodeStructure1 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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
