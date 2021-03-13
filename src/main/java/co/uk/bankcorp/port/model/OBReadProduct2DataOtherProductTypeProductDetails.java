package co.uk.bankcorp.port.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadProduct2DataOtherProductTypeProductDetails
 */
@Validated



public class OBReadProduct2DataOtherProductTypeProductDetails   {
  /**
   * Market segmentation is a marketing term referring to the aggregating of prospective buyers into groups, or segments, that have common needs and respond similarly to a marketing action. Market segmentation enables companies to target different categories of consumers who perceive the full value of certain products and services differently from one another. Read more: Market Segmentation http://www.investopedia.com/terms/m/marketsegmentation.asp#ixzz4gfEEalTd 
   */
  public enum SegmentEnum {
    GEAS("GEAS"),
    
    GEBA("GEBA"),
    
    GEBR("GEBR"),
    
    GEBU("GEBU"),
    
    GECI("GECI"),
    
    GECS("GECS"),
    
    GEFB("GEFB"),
    
    GEFG("GEFG"),
    
    GEG("GEG"),
    
    GEGR("GEGR"),
    
    GEGS("GEGS"),
    
    GEOT("GEOT"),
    
    GEOV("GEOV"),
    
    GEPA("GEPA"),
    
    GEPR("GEPR"),
    
    GERE("GERE"),
    
    GEST("GEST"),
    
    GEYA("GEYA"),
    
    GEYO("GEYO"),
    
    PSCA("PSCA"),
    
    PSES("PSES"),
    
    PSNC("PSNC"),
    
    PSNP("PSNP"),
    
    PSRG("PSRG"),
    
    PSSS("PSSS"),
    
    PSST("PSST"),
    
    PSSW("PSSW");

    private String value;

    SegmentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SegmentEnum fromValue(String text) {
      for (SegmentEnum b : SegmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Segment")
  @Valid
  private List<SegmentEnum> segment = null;

  @JsonProperty("FeeFreeLength")
  private Integer feeFreeLength = null;

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   */
  public enum FeeFreeLengthPeriodEnum {
    PACT("PACT"),
    
    PDAY("PDAY"),
    
    PHYR("PHYR"),
    
    PMTH("PMTH"),
    
    PQTR("PQTR"),
    
    PWEK("PWEK"),
    
    PYER("PYER");

    private String value;

    FeeFreeLengthPeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeFreeLengthPeriodEnum fromValue(String text) {
      for (FeeFreeLengthPeriodEnum b : FeeFreeLengthPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("FeeFreeLengthPeriod")
  private FeeFreeLengthPeriodEnum feeFreeLengthPeriod = null;

  @JsonProperty("MonthlyMaximumCharge")
  private String monthlyMaximumCharge = null;

  @JsonProperty("Notes")
  @Valid
  private List<String> notes = null;

  @JsonProperty("OtherSegment")
  private OBOtherCodeType10 otherSegment = null;

  public OBReadProduct2DataOtherProductTypeProductDetails segment(List<SegmentEnum> segment) {
    this.segment = segment;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails addSegmentItem(SegmentEnum segmentItem) {
    if (this.segment == null) {
      this.segment = new ArrayList<SegmentEnum>();
    }
    this.segment.add(segmentItem);
    return this;
  }

  /**
   * Get segment
   * @return segment
  **/
  @ApiModelProperty(value = "")
  
    public List<SegmentEnum> getSegment() {
    return segment;
  }

  public void setSegment(List<SegmentEnum> segment) {
    this.segment = segment;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails feeFreeLength(Integer feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
    return this;
  }

  /**
   * The length/duration of the fee free period
   * @return feeFreeLength
  **/
  @ApiModelProperty(value = "The length/duration of the fee free period")
  
    public Integer getFeeFreeLength() {
    return feeFreeLength;
  }

  public void setFeeFreeLength(Integer feeFreeLength) {
    this.feeFreeLength = feeFreeLength;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails feeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
    return this;
  }

  /**
   * The unit of period (days, weeks, months etc.) of the promotional length
   * @return feeFreeLengthPeriod
  **/
  @ApiModelProperty(value = "The unit of period (days, weeks, months etc.) of the promotional length")
  
    public FeeFreeLengthPeriodEnum getFeeFreeLengthPeriod() {
    return feeFreeLengthPeriod;
  }

  public void setFeeFreeLengthPeriod(FeeFreeLengthPeriodEnum feeFreeLengthPeriod) {
    this.feeFreeLengthPeriod = feeFreeLengthPeriod;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails monthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
    return this;
  }

  /**
   * The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order
   * @return monthlyMaximumCharge
  **/
  @ApiModelProperty(value = "The maximum relevant charges that could accrue as defined fully in Part 7 of the CMA order")
  
  @Pattern(regexp="^(-?\\\\d{1,14}){1}(\\\\.\\\\d{1,4}){0,1}$")   public String getMonthlyMaximumCharge() {
    return monthlyMaximumCharge;
  }

  public void setMonthlyMaximumCharge(String monthlyMaximumCharge) {
    this.monthlyMaximumCharge = monthlyMaximumCharge;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeProductDetails addNotesItem(String notesItem) {
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

  public OBReadProduct2DataOtherProductTypeProductDetails otherSegment(OBOtherCodeType10 otherSegment) {
    this.otherSegment = otherSegment;
    return this;
  }

  /**
   * Get otherSegment
   * @return otherSegment
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBOtherCodeType10 getOtherSegment() {
    return otherSegment;
  }

  public void setOtherSegment(OBOtherCodeType10 otherSegment) {
    this.otherSegment = otherSegment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeProductDetails obReadProduct2DataOtherProductTypeProductDetails = (OBReadProduct2DataOtherProductTypeProductDetails) o;
    return Objects.equals(this.segment, obReadProduct2DataOtherProductTypeProductDetails.segment) &&
        Objects.equals(this.feeFreeLength, obReadProduct2DataOtherProductTypeProductDetails.feeFreeLength) &&
        Objects.equals(this.feeFreeLengthPeriod, obReadProduct2DataOtherProductTypeProductDetails.feeFreeLengthPeriod) &&
        Objects.equals(this.monthlyMaximumCharge, obReadProduct2DataOtherProductTypeProductDetails.monthlyMaximumCharge) &&
        Objects.equals(this.notes, obReadProduct2DataOtherProductTypeProductDetails.notes) &&
        Objects.equals(this.otherSegment, obReadProduct2DataOtherProductTypeProductDetails.otherSegment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segment, feeFreeLength, feeFreeLengthPeriod, monthlyMaximumCharge, notes, otherSegment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeProductDetails {\n");
    
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    feeFreeLength: ").append(toIndentedString(feeFreeLength)).append("\n");
    sb.append("    feeFreeLengthPeriod: ").append(toIndentedString(feeFreeLengthPeriod)).append("\n");
    sb.append("    monthlyMaximumCharge: ").append(toIndentedString(monthlyMaximumCharge)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherSegment: ").append(toIndentedString(otherSegment)).append("\n");
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
