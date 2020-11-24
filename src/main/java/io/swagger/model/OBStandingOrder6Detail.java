package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OBActiveOrHistoricCurrencyAndAmount11;
import io.swagger.model.OBActiveOrHistoricCurrencyAndAmount2;
import io.swagger.model.OBActiveOrHistoricCurrencyAndAmount3;
import io.swagger.model.OBActiveOrHistoricCurrencyAndAmount4;
import io.swagger.model.OBBranchAndFinancialInstitutionIdentification51;
import io.swagger.model.OBCashAccount51;
import io.swagger.model.OBExternalStandingOrderStatus1Code;
import io.swagger.model.OBSupplementaryData1;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBStandingOrder6Detail
 */
@Validated



public class OBStandingOrder6Detail   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("StandingOrderId")
  private String standingOrderId = null;

  @JsonProperty("Frequency")
  private String frequency = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("FirstPaymentDateTime")
  private OffsetDateTime firstPaymentDateTime = null;

  @JsonProperty("NextPaymentDateTime")
  private OffsetDateTime nextPaymentDateTime = null;

  @JsonProperty("LastPaymentDateTime")
  private OffsetDateTime lastPaymentDateTime = null;

  @JsonProperty("FinalPaymentDateTime")
  private OffsetDateTime finalPaymentDateTime = null;

  @JsonProperty("NumberOfPayments")
  private String numberOfPayments = null;

  @JsonProperty("StandingOrderStatusCode")
  private OBExternalStandingOrderStatus1Code standingOrderStatusCode = null;

  @JsonProperty("FirstPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount = null;

  @JsonProperty("NextPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount = null;

  @JsonProperty("LastPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount = null;

  @JsonProperty("FinalPaymentAmount")
  private OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount = null;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification51 creditorAgent = null;

  @JsonProperty("CreditorAccount")
  private OBCashAccount51 creditorAccount = null;

  @JsonProperty("SupplementaryData")
  private OBSupplementaryData1 supplementaryData = null;

  public OBStandingOrder6Detail accountId(String accountId) {
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

  public OBStandingOrder6Detail standingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
    return this;
  }

  /**
   * Get standingOrderId
   * @return standingOrderId
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=40)   public String getStandingOrderId() {
    return standingOrderId;
  }

  public void setStandingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
  }

  public OBStandingOrder6Detail frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="^(NotKnown)$|^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")   public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public OBStandingOrder6Detail reference(String reference) {
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

  public OBStandingOrder6Detail firstPaymentDateTime(OffsetDateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

  /**
   * Get firstPaymentDateTime
   * @return firstPaymentDateTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  public void setFirstPaymentDateTime(OffsetDateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public OBStandingOrder6Detail nextPaymentDateTime(OffsetDateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
    return this;
  }

  /**
   * Get nextPaymentDateTime
   * @return nextPaymentDateTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getNextPaymentDateTime() {
    return nextPaymentDateTime;
  }

  public void setNextPaymentDateTime(OffsetDateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
  }

  public OBStandingOrder6Detail lastPaymentDateTime(OffsetDateTime lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
    return this;
  }

  /**
   * Get lastPaymentDateTime
   * @return lastPaymentDateTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getLastPaymentDateTime() {
    return lastPaymentDateTime;
  }

  public void setLastPaymentDateTime(OffsetDateTime lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
  }

  public OBStandingOrder6Detail finalPaymentDateTime(OffsetDateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
    return this;
  }

  /**
   * Get finalPaymentDateTime
   * @return finalPaymentDateTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getFinalPaymentDateTime() {
    return finalPaymentDateTime;
  }

  public void setFinalPaymentDateTime(OffsetDateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
  }

  public OBStandingOrder6Detail numberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

  /**
   * Get numberOfPayments
   * @return numberOfPayments
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=35)   public String getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(String numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public OBStandingOrder6Detail standingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
    return this;
  }

  /**
   * Get standingOrderStatusCode
   * @return standingOrderStatusCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBExternalStandingOrderStatus1Code getStandingOrderStatusCode() {
    return standingOrderStatusCode;
  }

  public void setStandingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
  }

  public OBStandingOrder6Detail firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
    return this;
  }

  /**
   * Get firstPaymentAmount
   * @return firstPaymentAmount
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount2 getFirstPaymentAmount() {
    return firstPaymentAmount;
  }

  public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
  }

  public OBStandingOrder6Detail nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

  /**
   * Get nextPaymentAmount
   * @return nextPaymentAmount
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount3 getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public OBStandingOrder6Detail lastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

  /**
   * Get lastPaymentAmount
   * @return lastPaymentAmount
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount11 getLastPaymentAmount() {
    return lastPaymentAmount;
  }

  public void setLastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }

  public OBStandingOrder6Detail finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
    return this;
  }

  /**
   * Get finalPaymentAmount
   * @return finalPaymentAmount
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBActiveOrHistoricCurrencyAndAmount4 getFinalPaymentAmount() {
    return finalPaymentAmount;
  }

  public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
  }

  public OBStandingOrder6Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBBranchAndFinancialInstitutionIdentification51 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBStandingOrder6Detail creditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBCashAccount51 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBStandingOrder6Detail supplementaryData(OBSupplementaryData1 supplementaryData) {
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
    OBStandingOrder6Detail obStandingOrder6Detail = (OBStandingOrder6Detail) o;
    return Objects.equals(this.accountId, obStandingOrder6Detail.accountId) &&
        Objects.equals(this.standingOrderId, obStandingOrder6Detail.standingOrderId) &&
        Objects.equals(this.frequency, obStandingOrder6Detail.frequency) &&
        Objects.equals(this.reference, obStandingOrder6Detail.reference) &&
        Objects.equals(this.firstPaymentDateTime, obStandingOrder6Detail.firstPaymentDateTime) &&
        Objects.equals(this.nextPaymentDateTime, obStandingOrder6Detail.nextPaymentDateTime) &&
        Objects.equals(this.lastPaymentDateTime, obStandingOrder6Detail.lastPaymentDateTime) &&
        Objects.equals(this.finalPaymentDateTime, obStandingOrder6Detail.finalPaymentDateTime) &&
        Objects.equals(this.numberOfPayments, obStandingOrder6Detail.numberOfPayments) &&
        Objects.equals(this.standingOrderStatusCode, obStandingOrder6Detail.standingOrderStatusCode) &&
        Objects.equals(this.firstPaymentAmount, obStandingOrder6Detail.firstPaymentAmount) &&
        Objects.equals(this.nextPaymentAmount, obStandingOrder6Detail.nextPaymentAmount) &&
        Objects.equals(this.lastPaymentAmount, obStandingOrder6Detail.lastPaymentAmount) &&
        Objects.equals(this.finalPaymentAmount, obStandingOrder6Detail.finalPaymentAmount) &&
        Objects.equals(this.creditorAgent, obStandingOrder6Detail.creditorAgent) &&
        Objects.equals(this.creditorAccount, obStandingOrder6Detail.creditorAccount) &&
        Objects.equals(this.supplementaryData, obStandingOrder6Detail.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, standingOrderId, frequency, reference, firstPaymentDateTime, nextPaymentDateTime, lastPaymentDateTime, finalPaymentDateTime, numberOfPayments, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, lastPaymentAmount, finalPaymentAmount, creditorAgent, creditorAccount, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStandingOrder6Detail {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
    sb.append("    lastPaymentDateTime: ").append(toIndentedString(lastPaymentDateTime)).append("\n");
    sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
    sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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
