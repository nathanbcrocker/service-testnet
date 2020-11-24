package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OBInterestCalculationMethod1Code;
import io.swagger.model.OBOtherCodeType10;
import io.swagger.model.OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges;
import io.swagger.model.OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The group of tiers or bands for which debit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which debit interest can be applied.")
@Validated



public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet   {
  /**
   * The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance
   */
  public enum TierBandMethodEnum {
    INBA("INBA"),
    
    INTI("INTI"),
    
    INWH("INWH");

    private String value;

    TierBandMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TierBandMethodEnum fromValue(String text) {
      for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("TierBandMethod")
  private TierBandMethodEnum tierBandMethod = null;

  @JsonProperty("Identification")
  private String identification = null;

  @JsonProperty("CalculationMethod")
  private OBInterestCalculationMethod1Code calculationMethod = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherCalculationMethod")
  private OBOtherCodeType10 otherCalculationMethod = null;

  @JsonProperty("LoanInterestTierBand")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> loanInterestTierBand = new ArrayList<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand>();

  @JsonProperty("LoanInterestFeesCharges")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges = null;

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance
   * @return tierBandMethod
  **/
  @ApiModelProperty(required = true, value = "The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance")
      @NotNull

    public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Loan interest tierbandset identification. Used by  loan providers for internal use purpose.
   * @return identification
  **/
  @ApiModelProperty(value = "Loan interest tierbandset identification. Used by  loan providers for internal use purpose.")
  
  @Size(min=1,max=35)   public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet calculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

  /**
   * Get calculationMethod
   * @return calculationMethod
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBInterestCalculationMethod1Code getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet otherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
    return this;
  }

  /**
   * Get otherCalculationMethod
   * @return otherCalculationMethod
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBOtherCodeType10 getOtherCalculationMethod() {
    return otherCalculationMethod;
  }

  public void setOtherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet loanInterestTierBand(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> loanInterestTierBand) {
    this.loanInterestTierBand = loanInterestTierBand;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet addLoanInterestTierBandItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand loanInterestTierBandItem) {
    this.loanInterestTierBand.add(loanInterestTierBandItem);
    return this;
  }

  /**
   * Get loanInterestTierBand
   * @return loanInterestTierBand
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> getLoanInterestTierBand() {
    return loanInterestTierBand;
  }

  public void setLoanInterestTierBand(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand> loanInterestTierBand) {
    this.loanInterestTierBand = loanInterestTierBand;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet loanInterestFeesCharges(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet addLoanInterestFeesChargesItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeesChargesItem) {
    if (this.loanInterestFeesCharges == null) {
      this.loanInterestFeesCharges = new ArrayList<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges>();
    }
    this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
    return this;
  }

  /**
   * Get loanInterestFeesCharges
   * @return loanInterestFeesCharges
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> getLoanInterestFeesCharges() {
    return loanInterestFeesCharges;
  }

  public void setLoanInterestFeesCharges(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet = (OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet) o;
    return Objects.equals(this.tierBandMethod, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.tierBandMethod) &&
        Objects.equals(this.identification, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.identification) &&
        Objects.equals(this.calculationMethod, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.calculationMethod) &&
        Objects.equals(this.notes, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.notes) &&
        Objects.equals(this.otherCalculationMethod, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.otherCalculationMethod) &&
        Objects.equals(this.loanInterestTierBand, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.loanInterestTierBand) &&
        Objects.equals(this.loanInterestFeesCharges, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet.loanInterestFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, identification, calculationMethod, notes, otherCalculationMethod, loanInterestTierBand, loanInterestFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet {\n");
    
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
    sb.append("    loanInterestTierBand: ").append(toIndentedString(loanInterestTierBand)).append("\n");
    sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
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
