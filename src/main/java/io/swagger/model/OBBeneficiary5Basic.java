package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OBBeneficiaryType1Code;
import io.swagger.model.OBSupplementaryData1;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBBeneficiary5Basic
 */
@Validated



public class OBBeneficiary5Basic   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("BeneficiaryId")
  private String beneficiaryId = null;

  @JsonProperty("BeneficiaryType")
  private OBBeneficiaryType1Code beneficiaryType = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  public OBBeneficiary5Basic accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=40)   public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBBeneficiary5Basic beneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
    return this;
  }

  /**
   * Get beneficiaryId
   * @return beneficiaryId
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=40)   public String getBeneficiaryId() {
    return beneficiaryId;
  }

  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }

  public OBBeneficiary5Basic beneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
    return this;
  }

  /**
   * Get beneficiaryType
   * @return beneficiaryType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBBeneficiaryType1Code getBeneficiaryType() {
    return beneficiaryType;
  }

  public void setBeneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
  }

  public OBBeneficiary5Basic reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=35)   public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBBeneficiary5Basic supplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBSupplementaryData1 getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
    this.supplementaryData = supplementaryData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBeneficiary5Basic obBeneficiary5Basic = (OBBeneficiary5Basic) o;
    return Objects.equals(this.accountId, obBeneficiary5Basic.accountId) &&
        Objects.equals(this.beneficiaryId, obBeneficiary5Basic.beneficiaryId) &&
        Objects.equals(this.beneficiaryType, obBeneficiary5Basic.beneficiaryType) &&
        Objects.equals(this.reference, obBeneficiary5Basic.reference) &&
        Objects.equals(this.supplementaryData, obBeneficiary5Basic.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, beneficiaryId, beneficiaryType, reference, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBeneficiary5Basic {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    beneficiaryType: ").append(toIndentedString(beneficiaryType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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
