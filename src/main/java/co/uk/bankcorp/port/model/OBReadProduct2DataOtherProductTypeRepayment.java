package co.uk.bankcorp.port.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Repayment details of the Loan product
 */
@ApiModel(description = "Repayment details of the Loan product")
@Validated



public class OBReadProduct2DataOtherProductTypeRepayment   {
  /**
   * Repayment type
   */
  public enum RepaymentTypeEnum {
    USBA("USBA"),
    
    USBU("USBU"),
    
    USCI("USCI"),
    
    USCS("USCS"),
    
    USER("USER"),
    
    USFA("USFA"),
    
    USFB("USFB"),
    
    USFI("USFI"),
    
    USIO("USIO"),
    
    USOT("USOT"),
    
    USPF("USPF"),
    
    USRW("USRW"),
    
    USSL("USSL");

    private String value;

    RepaymentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RepaymentTypeEnum fromValue(String text) {
      for (RepaymentTypeEnum b : RepaymentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("RepaymentType")
  private RepaymentTypeEnum repaymentType = null;

  /**
   * Repayment frequency
   */
  public enum RepaymentFrequencyEnum {
    SMDA("SMDA"),
    
    SMFL("SMFL"),
    
    SMFO("SMFO"),
    
    SMHY("SMHY"),
    
    SMMO("SMMO"),
    
    SMOT("SMOT"),
    
    SMQU("SMQU"),
    
    SMWE("SMWE"),
    
    SMYE("SMYE");

    private String value;

    RepaymentFrequencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RepaymentFrequencyEnum fromValue(String text) {
      for (RepaymentFrequencyEnum b : RepaymentFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("RepaymentFrequency")
  private RepaymentFrequencyEnum repaymentFrequency = null;

  /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
   */
  public enum AmountTypeEnum {
    RABD("RABD"),
    
    RABL("RABL"),
    
    RACI("RACI"),
    
    RAFC("RAFC"),
    
    RAIO("RAIO"),
    
    RALT("RALT"),
    
    USOT("USOT");

    private String value;

    AmountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AmountTypeEnum fromValue(String text) {
      for (AmountTypeEnum b : AmountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("AmountType")
  private AmountTypeEnum amountType = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherRepaymentType")
  private OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType = null;

  @JsonProperty("OtherRepaymentFrequency")
  private OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency = null;

  @JsonProperty("OtherAmountType")
  private OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType otherAmountType = null;

  @JsonProperty("RepaymentFeeCharges")
  private OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges = null;

  @JsonProperty("RepaymentHoliday")
  @Valid
  private List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday> repaymentHoliday = null;

  public OBReadProduct2DataOtherProductTypeRepayment repaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
    return this;
  }

  /**
   * Repayment type
   * @return repaymentType
  **/
  @ApiModelProperty(value = "Repayment type")
  
    public RepaymentTypeEnum getRepaymentType() {
    return repaymentType;
  }

  public void setRepaymentType(RepaymentTypeEnum repaymentType) {
    this.repaymentType = repaymentType;
  }

  public OBReadProduct2DataOtherProductTypeRepayment repaymentFrequency(RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
    return this;
  }

  /**
   * Repayment frequency
   * @return repaymentFrequency
  **/
  @ApiModelProperty(value = "Repayment frequency")
  
    public RepaymentFrequencyEnum getRepaymentFrequency() {
    return repaymentFrequency;
  }

  public void setRepaymentFrequency(RepaymentFrequencyEnum repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
  }

  public OBReadProduct2DataOtherProductTypeRepayment amountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
    return this;
  }

  /**
   * The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc
   * @return amountType
  **/
  @ApiModelProperty(value = "The repayment is for paying just the interest only or both interest and capital or bullet amount or balance to date etc")
  
    public AmountTypeEnum getAmountType() {
    return amountType;
  }

  public void setAmountType(AmountTypeEnum amountType) {
    this.amountType = amountType;
  }

  public OBReadProduct2DataOtherProductTypeRepayment notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepayment addNotesItem(String notesItem) {
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

  public OBReadProduct2DataOtherProductTypeRepayment otherRepaymentType(OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
    return this;
  }

  /**
   * Get otherRepaymentType
   * @return otherRepaymentType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType getOtherRepaymentType() {
    return otherRepaymentType;
  }

  public void setOtherRepaymentType(OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentType otherRepaymentType) {
    this.otherRepaymentType = otherRepaymentType;
  }

  public OBReadProduct2DataOtherProductTypeRepayment otherRepaymentFrequency(OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
    return this;
  }

  /**
   * Get otherRepaymentFrequency
   * @return otherRepaymentFrequency
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency getOtherRepaymentFrequency() {
    return otherRepaymentFrequency;
  }

  public void setOtherRepaymentFrequency(OBReadProduct2DataOtherProductTypeRepaymentOtherRepaymentFrequency otherRepaymentFrequency) {
    this.otherRepaymentFrequency = otherRepaymentFrequency;
  }

  public OBReadProduct2DataOtherProductTypeRepayment otherAmountType(OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
    return this;
  }

  /**
   * Get otherAmountType
   * @return otherAmountType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType getOtherAmountType() {
    return otherAmountType;
  }

  public void setOtherAmountType(OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType otherAmountType) {
    this.otherAmountType = otherAmountType;
  }

  public OBReadProduct2DataOtherProductTypeRepayment repaymentFeeCharges(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
    return this;
  }

  /**
   * Get repaymentFeeCharges
   * @return repaymentFeeCharges
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges getRepaymentFeeCharges() {
    return repaymentFeeCharges;
  }

  public void setRepaymentFeeCharges(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeCharges) {
    this.repaymentFeeCharges = repaymentFeeCharges;
  }

  public OBReadProduct2DataOtherProductTypeRepayment repaymentHoliday(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepayment addRepaymentHolidayItem(OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday repaymentHolidayItem) {
    if (this.repaymentHoliday == null) {
      this.repaymentHoliday = new ArrayList<OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday>();
    }
    this.repaymentHoliday.add(repaymentHolidayItem);
    return this;
  }

  /**
   * Get repaymentHoliday
   * @return repaymentHoliday
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday> getRepaymentHoliday() {
    return repaymentHoliday;
  }

  public void setRepaymentHoliday(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentHoliday> repaymentHoliday) {
    this.repaymentHoliday = repaymentHoliday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeRepayment obReadProduct2DataOtherProductTypeRepayment = (OBReadProduct2DataOtherProductTypeRepayment) o;
    return Objects.equals(this.repaymentType, obReadProduct2DataOtherProductTypeRepayment.repaymentType) &&
        Objects.equals(this.repaymentFrequency, obReadProduct2DataOtherProductTypeRepayment.repaymentFrequency) &&
        Objects.equals(this.amountType, obReadProduct2DataOtherProductTypeRepayment.amountType) &&
        Objects.equals(this.notes, obReadProduct2DataOtherProductTypeRepayment.notes) &&
        Objects.equals(this.otherRepaymentType, obReadProduct2DataOtherProductTypeRepayment.otherRepaymentType) &&
        Objects.equals(this.otherRepaymentFrequency, obReadProduct2DataOtherProductTypeRepayment.otherRepaymentFrequency) &&
        Objects.equals(this.otherAmountType, obReadProduct2DataOtherProductTypeRepayment.otherAmountType) &&
        Objects.equals(this.repaymentFeeCharges, obReadProduct2DataOtherProductTypeRepayment.repaymentFeeCharges) &&
        Objects.equals(this.repaymentHoliday, obReadProduct2DataOtherProductTypeRepayment.repaymentHoliday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentType, repaymentFrequency, amountType, notes, otherRepaymentType, otherRepaymentFrequency, otherAmountType, repaymentFeeCharges, repaymentHoliday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeRepayment {\n");
    
    sb.append("    repaymentType: ").append(toIndentedString(repaymentType)).append("\n");
    sb.append("    repaymentFrequency: ").append(toIndentedString(repaymentFrequency)).append("\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherRepaymentType: ").append(toIndentedString(otherRepaymentType)).append("\n");
    sb.append("    otherRepaymentFrequency: ").append(toIndentedString(otherRepaymentFrequency)).append("\n");
    sb.append("    otherAmountType: ").append(toIndentedString(otherAmountType)).append("\n");
    sb.append("    repaymentFeeCharges: ").append(toIndentedString(repaymentFeeCharges)).append("\n");
    sb.append("    repaymentHoliday: ").append(toIndentedString(repaymentHoliday)).append("\n");
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
