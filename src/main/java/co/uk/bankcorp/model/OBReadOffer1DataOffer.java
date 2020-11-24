package co.uk.bankcorp.model;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBReadOffer1DataOffer
 */
@Validated



public class OBReadOffer1DataOffer   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("OfferId")
  private String offerId = null;

  /**
   * Offer type, in a coded form.
   */
  public enum OfferTypeEnum {
    BALANCETRANSFER("BalanceTransfer"),
    
    LIMITINCREASE("LimitIncrease"),
    
    MONEYTRANSFER("MoneyTransfer"),
    
    OTHER("Other"),
    
    PROMOTIONALRATE("PromotionalRate");

    private String value;

    OfferTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OfferTypeEnum fromValue(String text) {
      for (OfferTypeEnum b : OfferTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("OfferType")
  private OfferTypeEnum offerType = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("StartDateTime")
  private OffsetDateTime startDateTime = null;

  @JsonProperty("EndDateTime")
  private OffsetDateTime endDateTime = null;

  @JsonProperty("Rate")
  private String rate = null;

  @JsonProperty("Value")
  private Integer value = null;

  @JsonProperty("Term")
  private String term = null;

  @JsonProperty("URL")
  private String URL = null;

  @JsonProperty("Amount")
  private OBReadOffer1DataAmount amount = null;

  @JsonProperty("Fee")
  private OBReadOffer1DataFee fee = null;

  public OBReadOffer1DataOffer accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Size(min=1,max=40)   public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadOffer1DataOffer offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner.
   * @return offerId
  **/
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner.")
  
  @Size(min=1,max=40)   public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OBReadOffer1DataOffer offerType(OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
  }

  /**
   * Offer type, in a coded form.
   * @return offerType
  **/
  @ApiModelProperty(value = "Offer type, in a coded form.")
  
    public OfferTypeEnum getOfferType() {
    return offerType;
  }

  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  public OBReadOffer1DataOffer description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Further details of the offer.
   * @return description
  **/
  @ApiModelProperty(value = "Further details of the offer.")
  
  @Size(min=1,max=500)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBReadOffer1DataOffer startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Date and time at which the offer starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return startDateTime
  **/
  @ApiModelProperty(value = "Date and time at which the offer starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBReadOffer1DataOffer endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Date and time at which the offer ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return endDateTime
  **/
  @ApiModelProperty(value = "Date and time at which the offer ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBReadOffer1DataOffer rate(String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate associated with the offer type.
   * @return rate
  **/
  @ApiModelProperty(value = "Rate associated with the offer type.")
  
  @Pattern(regexp="^(-?\\d{1,3}){1}(\\.\\d{1,4}){0,1}$")   public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public OBReadOffer1DataOffer value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * Value associated with the offer type.
   * @return value
  **/
  @ApiModelProperty(value = "Value associated with the offer type.")
  
    public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public OBReadOffer1DataOffer term(String term) {
    this.term = term;
    return this;
  }

  /**
   * Further details of the term of the offer.
   * @return term
  **/
  @ApiModelProperty(value = "Further details of the term of the offer.")
  
  @Size(min=1,max=500)   public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public OBReadOffer1DataOffer URL(String URL) {
    this.URL = URL;
    return this;
  }

  /**
   * URL (Uniform Resource Locator) where documentation on the offer can be found
   * @return URL
  **/
  @ApiModelProperty(value = "URL (Uniform Resource Locator) where documentation on the offer can be found")
  
  @Size(min=1,max=256)   public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public OBReadOffer1DataOffer amount(OBReadOffer1DataAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBReadOffer1DataAmount getAmount() {
    return amount;
  }

  public void setAmount(OBReadOffer1DataAmount amount) {
    this.amount = amount;
  }

  public OBReadOffer1DataOffer fee(OBReadOffer1DataFee fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBReadOffer1DataFee getFee() {
    return fee;
  }

  public void setFee(OBReadOffer1DataFee fee) {
    this.fee = fee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadOffer1DataOffer obReadOffer1DataOffer = (OBReadOffer1DataOffer) o;
    return Objects.equals(this.accountId, obReadOffer1DataOffer.accountId) &&
        Objects.equals(this.offerId, obReadOffer1DataOffer.offerId) &&
        Objects.equals(this.offerType, obReadOffer1DataOffer.offerType) &&
        Objects.equals(this.description, obReadOffer1DataOffer.description) &&
        Objects.equals(this.startDateTime, obReadOffer1DataOffer.startDateTime) &&
        Objects.equals(this.endDateTime, obReadOffer1DataOffer.endDateTime) &&
        Objects.equals(this.rate, obReadOffer1DataOffer.rate) &&
        Objects.equals(this.value, obReadOffer1DataOffer.value) &&
        Objects.equals(this.term, obReadOffer1DataOffer.term) &&
        Objects.equals(this.URL, obReadOffer1DataOffer.URL) &&
        Objects.equals(this.amount, obReadOffer1DataOffer.amount) &&
        Objects.equals(this.fee, obReadOffer1DataOffer.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, offerId, offerType, description, startDateTime, endDateTime, rate, value, term, URL, amount, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadOffer1DataOffer {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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
