package co.uk.bankcorp.port.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Other fees/charges details
 */
@ApiModel(description = "Other fees/charges details")
@Validated



public class OBReadProduct2DataOtherProductTypeFeeChargeDetail   {
  @JsonProperty("FeeCategory")
  private OBFeeCategory1Code feeCategory = null;

  @JsonProperty("FeeType")
  private OBFeeType1Code feeType = null;

  @JsonProperty("NegotiableIndicator")
  private Boolean negotiableIndicator = null;

  @JsonProperty("FeeAmount")
  private String feeAmount = null;

  @JsonProperty("FeeRate")
  private String feeRate = null;

  @JsonProperty("FeeRateType")
  private OBInterestRateType1Code1 feeRateType = null;

  @JsonProperty("ApplicationFrequency")
  private OBFeeFrequency1Code2 applicationFrequency = null;

  @JsonProperty("CalculationFrequency")
  private OBFeeFrequency1Code3 calculationFrequency = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("FeeChargeCap")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap = null;

  @JsonProperty("OtherFeeCategoryType")
  private OBOtherCodeType10 otherFeeCategoryType = null;

  @JsonProperty("OtherFeeType")
  private OBOtherFeeChargeDetailType otherFeeType = null;

  @JsonProperty("OtherFeeRateType")
  private OBOtherCodeType18 otherFeeRateType = null;

  @JsonProperty("OtherApplicationFrequency")
  private OBOtherCodeType16 otherApplicationFrequency = null;

  @JsonProperty("OtherCalculationFrequency")
  private OBOtherCodeType17 otherCalculationFrequency = null;

  @JsonProperty("FeeApplicableRange")
  private OBReadProduct2DataOtherProductTypeFeeApplicableRange feeApplicableRange = null;

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail feeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

  /**
   * Get feeCategory
   * @return feeCategory
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBFeeCategory1Code getFeeCategory() {
    return feeCategory;
  }

  public void setFeeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail feeType(OBFeeType1Code feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Get feeType
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBFeeType1Code getFeeType() {
    return feeType;
  }

  public void setFeeType(OBFeeType1Code feeType) {
    this.feeType = feeType;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

  /**
   * Fee/charge which is usually negotiable rather than a fixed amount
   * @return negotiableIndicator
  **/
  @ApiModelProperty(value = "Fee/charge which is usually negotiable rather than a fixed amount")
  
    public Boolean isNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Get feeAmount
   * @return feeAmount
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^(-?\\d{1,14}){1}(\\.\\d{1,4}){0,1}$")   public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  /**
   * Get feeRate
   * @return feeRate
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")   public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail feeRateType(OBInterestRateType1Code1 feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Get feeRateType
   * @return feeRateType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBInterestRateType1Code1 getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(OBInterestRateType1Code1 feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail applicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * Get applicationFrequency
   * @return applicationFrequency
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBFeeFrequency1Code2 getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail calculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * Get calculationFrequency
   * @return calculationFrequency
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBFeeFrequency1Code3 getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail addNotesItem(String notesItem) {
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

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail feeChargeCap(List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail addFeeChargeCapItem(OBReadProduct2DataOtherProductTypeFeeChargeCap feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<OBReadProduct2DataOtherProductTypeFeeChargeCap>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Get feeChargeCap
   * @return feeChargeCap
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<OBReadProduct2DataOtherProductTypeFeeChargeCap> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OBReadProduct2DataOtherProductTypeFeeChargeCap> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail otherFeeCategoryType(OBOtherCodeType10 otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
    return this;
  }

  /**
   * Get otherFeeCategoryType
   * @return otherFeeCategoryType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBOtherCodeType10 getOtherFeeCategoryType() {
    return otherFeeCategoryType;
  }

  public void setOtherFeeCategoryType(OBOtherCodeType10 otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail otherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBOtherFeeChargeDetailType getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail otherFeeRateType(OBOtherCodeType18 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

  /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBOtherCodeType18 getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OBOtherCodeType18 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail otherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBOtherCodeType16 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail otherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBOtherCodeType17 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public OBReadProduct2DataOtherProductTypeFeeChargeDetail feeApplicableRange(OBReadProduct2DataOtherProductTypeFeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
    return this;
  }

  /**
   * Get feeApplicableRange
   * @return feeApplicableRange
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBReadProduct2DataOtherProductTypeFeeApplicableRange getFeeApplicableRange() {
    return feeApplicableRange;
  }

  public void setFeeApplicableRange(OBReadProduct2DataOtherProductTypeFeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeFeeChargeDetail obReadProduct2DataOtherProductTypeFeeChargeDetail = (OBReadProduct2DataOtherProductTypeFeeChargeDetail) o;
    return Objects.equals(this.feeCategory, obReadProduct2DataOtherProductTypeFeeChargeDetail.feeCategory) &&
        Objects.equals(this.feeType, obReadProduct2DataOtherProductTypeFeeChargeDetail.feeType) &&
        Objects.equals(this.negotiableIndicator, obReadProduct2DataOtherProductTypeFeeChargeDetail.negotiableIndicator) &&
        Objects.equals(this.feeAmount, obReadProduct2DataOtherProductTypeFeeChargeDetail.feeAmount) &&
        Objects.equals(this.feeRate, obReadProduct2DataOtherProductTypeFeeChargeDetail.feeRate) &&
        Objects.equals(this.feeRateType, obReadProduct2DataOtherProductTypeFeeChargeDetail.feeRateType) &&
        Objects.equals(this.applicationFrequency, obReadProduct2DataOtherProductTypeFeeChargeDetail.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, obReadProduct2DataOtherProductTypeFeeChargeDetail.calculationFrequency) &&
        Objects.equals(this.notes, obReadProduct2DataOtherProductTypeFeeChargeDetail.notes) &&
        Objects.equals(this.feeChargeCap, obReadProduct2DataOtherProductTypeFeeChargeDetail.feeChargeCap) &&
        Objects.equals(this.otherFeeCategoryType, obReadProduct2DataOtherProductTypeFeeChargeDetail.otherFeeCategoryType) &&
        Objects.equals(this.otherFeeType, obReadProduct2DataOtherProductTypeFeeChargeDetail.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, obReadProduct2DataOtherProductTypeFeeChargeDetail.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, obReadProduct2DataOtherProductTypeFeeChargeDetail.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, obReadProduct2DataOtherProductTypeFeeChargeDetail.otherCalculationFrequency) &&
        Objects.equals(this.feeApplicableRange, obReadProduct2DataOtherProductTypeFeeChargeDetail.feeApplicableRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeCategory, feeType, negotiableIndicator, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, feeChargeCap, otherFeeCategoryType, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, feeApplicableRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeFeeChargeDetail {\n");
    
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
    sb.append("    otherFeeCategoryType: ").append(toIndentedString(otherFeeCategoryType)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    feeApplicableRange: ").append(toIndentedString(feeApplicableRange)).append("\n");
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
