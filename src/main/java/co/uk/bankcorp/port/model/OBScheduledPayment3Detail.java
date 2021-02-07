package co.uk.bankcorp.port.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBScheduledPayment3Detail
 */
@Validated



public class OBScheduledPayment3Detail   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("ScheduledPaymentId")
  private String scheduledPaymentId = null;

  @JsonProperty("ScheduledPaymentDateTime")
  private OffsetDateTime scheduledPaymentDateTime = null;

  @JsonProperty("ScheduledType")
  private OBExternalScheduleType1Code scheduledType = null;

  @JsonProperty("Reference")
  private String reference = null;

  @JsonProperty("DebtorReference")
  private String debtorReference = null;

  @JsonProperty("InstructedAmount")
  private OBActiveOrHistoricCurrencyAndAmount1 instructedAmount = null;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification51 creditorAgent = null;

  @JsonProperty("CreditorAccount")
  private OBCashAccount51 creditorAccount = null;

  public OBScheduledPayment3Detail accountId(String accountId) {
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

  public OBScheduledPayment3Detail scheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
    return this;
  }

  /**
   * Get scheduledPaymentId
   * @return scheduledPaymentId
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=40)   public String getScheduledPaymentId() {
    return scheduledPaymentId;
  }

  public void setScheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
  }

  public OBScheduledPayment3Detail scheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    return this;
  }

  /**
   * Get scheduledPaymentDateTime
   * @return scheduledPaymentDateTime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OffsetDateTime getScheduledPaymentDateTime() {
    return scheduledPaymentDateTime;
  }

  public void setScheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
  }

  public OBScheduledPayment3Detail scheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
    return this;
  }

  /**
   * Get scheduledType
   * @return scheduledType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBExternalScheduleType1Code getScheduledType() {
    return scheduledType;
  }

  public void setScheduledType(OBExternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
  }

  public OBScheduledPayment3Detail reference(String reference) {
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

  public OBScheduledPayment3Detail debtorReference(String debtorReference) {
    this.debtorReference = debtorReference;
    return this;
  }

  /**
   * Get debtorReference
   * @return debtorReference
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=35)   public String getDebtorReference() {
    return debtorReference;
  }

  public void setDebtorReference(String debtorReference) {
    this.debtorReference = debtorReference;
  }

  public OBScheduledPayment3Detail instructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBActiveOrHistoricCurrencyAndAmount1 getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBScheduledPayment3Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
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

  public OBScheduledPayment3Detail creditorAccount(OBCashAccount51 creditorAccount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBScheduledPayment3Detail obScheduledPayment3Detail = (OBScheduledPayment3Detail) o;
    return Objects.equals(this.accountId, obScheduledPayment3Detail.accountId) &&
        Objects.equals(this.scheduledPaymentId, obScheduledPayment3Detail.scheduledPaymentId) &&
        Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment3Detail.scheduledPaymentDateTime) &&
        Objects.equals(this.scheduledType, obScheduledPayment3Detail.scheduledType) &&
        Objects.equals(this.reference, obScheduledPayment3Detail.reference) &&
        Objects.equals(this.debtorReference, obScheduledPayment3Detail.debtorReference) &&
        Objects.equals(this.instructedAmount, obScheduledPayment3Detail.instructedAmount) &&
        Objects.equals(this.creditorAgent, obScheduledPayment3Detail.creditorAgent) &&
        Objects.equals(this.creditorAccount, obScheduledPayment3Detail.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, reference, debtorReference, instructedAmount, creditorAgent, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBScheduledPayment3Detail {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
    sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
    sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    debtorReference: ").append(toIndentedString(debtorReference)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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
