package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadConsentResponse1Data
 */
@Validated



public class OBReadConsentResponse1Data   {
  @JsonProperty("ConsentId")
  private String consentId = null;

  @JsonProperty("CreationDateTime")
  private OffsetDateTime creationDateTime = null;

  /**
   * Specifies the status of consent resource in code form.
   */
  public enum StatusEnum {
    AUTHORISED("Authorised"),
    
    AWAITINGAUTHORISATION("AwaitingAuthorisation"),
    
    REJECTED("Rejected"),
    
    REVOKED("Revoked");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Status")
  private StatusEnum status = null;

  @JsonProperty("StatusUpdateDateTime")
  private OffsetDateTime statusUpdateDateTime = null;

  /**
   * Specifies the Open Banking account access data types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.
   */
  public enum PermissionsEnum {
    READACCOUNTSBASIC("ReadAccountsBasic"),
    
    READACCOUNTSDETAIL("ReadAccountsDetail"),
    
    READBALANCES("ReadBalances"),
    
    READBENEFICIARIESBASIC("ReadBeneficiariesBasic"),
    
    READBENEFICIARIESDETAIL("ReadBeneficiariesDetail"),
    
    READDIRECTDEBITS("ReadDirectDebits"),
    
    READOFFERS("ReadOffers"),
    
    READPAN("ReadPAN"),
    
    READPARTY("ReadParty"),
    
    READPARTYPSU("ReadPartyPSU"),
    
    READPRODUCTS("ReadProducts"),
    
    READSCHEDULEDPAYMENTSBASIC("ReadScheduledPaymentsBasic"),
    
    READSCHEDULEDPAYMENTSDETAIL("ReadScheduledPaymentsDetail"),
    
    READSTANDINGORDERSBASIC("ReadStandingOrdersBasic"),
    
    READSTANDINGORDERSDETAIL("ReadStandingOrdersDetail"),
    
    READSTATEMENTSBASIC("ReadStatementsBasic"),
    
    READSTATEMENTSDETAIL("ReadStatementsDetail"),
    
    READTRANSACTIONSBASIC("ReadTransactionsBasic"),
    
    READTRANSACTIONSCREDITS("ReadTransactionsCredits"),
    
    READTRANSACTIONSDEBITS("ReadTransactionsDebits"),
    
    READTRANSACTIONSDETAIL("ReadTransactionsDetail");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermissionsEnum fromValue(String text) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("Permissions")
  @Valid
  private List<PermissionsEnum> permissions = new ArrayList<PermissionsEnum>();

  @JsonProperty("ExpirationDateTime")
  private OffsetDateTime expirationDateTime = null;

  @JsonProperty("TransactionFromDateTime")
  private OffsetDateTime transactionFromDateTime = null;

  @JsonProperty("TransactionToDateTime")
  private OffsetDateTime transactionToDateTime = null;

  public OBReadConsentResponse1Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned to identify the account access consent resource.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "Unique identification as assigned to identify the account access consent resource.")
      @NotNull

  @Size(min=1,max=128)   public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBReadConsentResponse1Data creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Get creationDateTime
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBReadConsentResponse1Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the status of consent resource in code form.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Specifies the status of consent resource in code form.")
      @NotNull

    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBReadConsentResponse1Data statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Get statusUpdateDateTime
   * @return statusUpdateDateTime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OffsetDateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBReadConsentResponse1Data permissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public OBReadConsentResponse1Data addPermissionsItem(PermissionsEnum permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Size(min=1)   public List<PermissionsEnum> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  public OBReadConsentResponse1Data expirationDateTime(OffsetDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

  /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expirationDateTime
  **/
  @ApiModelProperty(value = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(OffsetDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public OBReadConsentResponse1Data transactionFromDateTime(OffsetDateTime transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
    return this;
  }

  /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionFromDateTime
  **/
  @ApiModelProperty(value = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getTransactionFromDateTime() {
    return transactionFromDateTime;
  }

  public void setTransactionFromDateTime(OffsetDateTime transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
  }

  public OBReadConsentResponse1Data transactionToDateTime(OffsetDateTime transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
    return this;
  }

  /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionToDateTime
  **/
  @ApiModelProperty(value = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getTransactionToDateTime() {
    return transactionToDateTime;
  }

  public void setTransactionToDateTime(OffsetDateTime transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadConsentResponse1Data obReadConsentResponse1Data = (OBReadConsentResponse1Data) o;
    return Objects.equals(this.consentId, obReadConsentResponse1Data.consentId) &&
        Objects.equals(this.creationDateTime, obReadConsentResponse1Data.creationDateTime) &&
        Objects.equals(this.status, obReadConsentResponse1Data.status) &&
        Objects.equals(this.statusUpdateDateTime, obReadConsentResponse1Data.statusUpdateDateTime) &&
        Objects.equals(this.permissions, obReadConsentResponse1Data.permissions) &&
        Objects.equals(this.expirationDateTime, obReadConsentResponse1Data.expirationDateTime) &&
        Objects.equals(this.transactionFromDateTime, obReadConsentResponse1Data.transactionFromDateTime) &&
        Objects.equals(this.transactionToDateTime, obReadConsentResponse1Data.transactionToDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDateTime, status, statusUpdateDateTime, permissions, expirationDateTime, transactionFromDateTime, transactionToDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsentResponse1Data {\n");
    
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
    sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
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
