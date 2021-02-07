package co.uk.bankcorp.port.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * OBReadBeneficiary5Data
 */
@Validated



public class OBReadBeneficiary5Data   {
  @JsonProperty("Beneficiary")
  @Valid
  private List<OBBeneficiary5> beneficiary = null;

  public OBReadBeneficiary5Data beneficiary(List<OBBeneficiary5> beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  public OBReadBeneficiary5Data addBeneficiaryItem(OBBeneficiary5 beneficiaryItem) {
    if (this.beneficiary == null) {
      this.beneficiary = new ArrayList<OBBeneficiary5>();
    }
    this.beneficiary.add(beneficiaryItem);
    return this;
  }

  /**
   * Get beneficiary
   * @return beneficiary
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<OBBeneficiary5> getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(List<OBBeneficiary5> beneficiary) {
    this.beneficiary = beneficiary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBeneficiary5Data obReadBeneficiary5Data = (OBReadBeneficiary5Data) o;
    return Objects.equals(this.beneficiary, obReadBeneficiary5Data.beneficiary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBeneficiary5Data {\n");
    
    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
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
