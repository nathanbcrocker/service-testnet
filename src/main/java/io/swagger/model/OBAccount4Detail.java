package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OBAccount4Account;
import io.swagger.model.OBAccountStatus1Code;
import io.swagger.model.OBBranchAndFinancialInstitutionIdentification50;
import io.swagger.model.OBExternalAccountSubType1Code;
import io.swagger.model.OBExternalAccountType1Code;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Unambiguous identification of the account to which credit and debit entries are made.
 */
@ApiModel(description = "Unambiguous identification of the account to which credit and debit entries are made.")
@Validated



public class OBAccount4Detail   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("Status")
  private OBAccountStatus1Code status = null;

  @JsonProperty("StatusUpdateDateTime")
  private OffsetDateTime statusUpdateDateTime = null;

  @JsonProperty("Currency")
  private String currency = null;

  @JsonProperty("AccountType")
  private OBExternalAccountType1Code accountType = null;

  @JsonProperty("AccountSubType")
  private OBExternalAccountSubType1Code accountSubType = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Nickname")
  private String nickname = null;

  @JsonProperty("Account")
  @Valid
  private List<OBAccount4Account> account = new ArrayList<OBAccount4Account>();

  @JsonProperty("Servicer")
  private OBBranchAndFinancialInstitutionIdentification50 servicer = null;

  public OBAccount4Detail accountId(String accountId) {
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

  public OBAccount4Detail status(OBAccountStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBAccountStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBAccountStatus1Code status) {
    this.status = status;
  }

  public OBAccount4Detail statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Get statusUpdateDateTime
   * @return statusUpdateDateTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBAccount4Detail currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="^[A-Z]{3,3}$")   public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBAccount4Detail accountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBExternalAccountType1Code getAccountType() {
    return accountType;
  }

  public void setAccountType(OBExternalAccountType1Code accountType) {
    this.accountType = accountType;
  }

  public OBAccount4Detail accountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

  /**
   * Get accountSubType
   * @return accountSubType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBExternalAccountSubType1Code getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
    this.accountSubType = accountSubType;
  }

  public OBAccount4Detail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=35)   public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBAccount4Detail nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * Get nickname
   * @return nickname
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=70)   public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public OBAccount4Detail account(List<OBAccount4Account> account) {
    this.account = account;
    return this;
  }

  public OBAccount4Detail addAccountItem(OBAccount4Account accountItem) {
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<OBAccount4Account> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount4Account> account) {
    this.account = account;
  }

  public OBAccount4Detail servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
    return this;
  }

  /**
   * Get servicer
   * @return servicer
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
    return servicer;
  }

  public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount4Detail obAccount4Detail = (OBAccount4Detail) o;
    return Objects.equals(this.accountId, obAccount4Detail.accountId) &&
        Objects.equals(this.status, obAccount4Detail.status) &&
        Objects.equals(this.statusUpdateDateTime, obAccount4Detail.statusUpdateDateTime) &&
        Objects.equals(this.currency, obAccount4Detail.currency) &&
        Objects.equals(this.accountType, obAccount4Detail.accountType) &&
        Objects.equals(this.accountSubType, obAccount4Detail.accountSubType) &&
        Objects.equals(this.description, obAccount4Detail.description) &&
        Objects.equals(this.nickname, obAccount4Detail.nickname) &&
        Objects.equals(this.account, obAccount4Detail.account) &&
        Objects.equals(this.servicer, obAccount4Detail.servicer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountType, accountSubType, description, nickname, account, servicer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount4Detail {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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
