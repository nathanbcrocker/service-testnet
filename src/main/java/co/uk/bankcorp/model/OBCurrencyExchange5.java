package co.uk.bankcorp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Set of elements used to provide details on the currency exchange.
 */
@ApiModel(description = "Set of elements used to provide details on the currency exchange.")
@Validated



public class OBCurrencyExchange5   {
  @JsonProperty("SourceCurrency")
  private String sourceCurrency = null;

  @JsonProperty("TargetCurrency")
  private String targetCurrency = null;

  @JsonProperty("UnitCurrency")
  private String unitCurrency = null;

  @JsonProperty("ExchangeRate")
  private BigDecimal exchangeRate = null;

  @JsonProperty("ContractIdentification")
  private String contractIdentification = null;

  @JsonProperty("QuotationDate")
  private OffsetDateTime quotationDate = null;

  @JsonProperty("InstructedAmount")
  private OBCurrencyExchange5InstructedAmount instructedAmount = null;

  public OBCurrencyExchange5 sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

  /**
   * Currency from which an amount is to be converted in a currency conversion.
   * @return sourceCurrency
  **/
  @ApiModelProperty(required = true, value = "Currency from which an amount is to be converted in a currency conversion.")
      @NotNull

  @Pattern(regexp="^[A-Z]{3,3}$")   public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public OBCurrencyExchange5 targetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

  /**
   * Currency into which an amount is to be converted in a currency conversion.
   * @return targetCurrency
  **/
  @ApiModelProperty(value = "Currency into which an amount is to be converted in a currency conversion.")
  
  @Pattern(regexp="^[A-Z]{3,3}$")   public String getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  public OBCurrencyExchange5 unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }

  /**
   * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
   * @return unitCurrency
  **/
  @ApiModelProperty(value = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.")
  
  @Pattern(regexp="^[A-Z]{3,3}$")   public String getUnitCurrency() {
    return unitCurrency;
  }

  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }

  public OBCurrencyExchange5 exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).
   * @return exchangeRate
  **/
  @ApiModelProperty(required = true, value = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).")
      @NotNull

    @Valid
    public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public OBCurrencyExchange5 contractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
    return this;
  }

  /**
   * Unique identification to unambiguously identify the foreign exchange contract.
   * @return contractIdentification
  **/
  @ApiModelProperty(value = "Unique identification to unambiguously identify the foreign exchange contract.")
  
  @Size(min=1,max=35)   public String getContractIdentification() {
    return contractIdentification;
  }

  public void setContractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
  }

  public OBCurrencyExchange5 quotationDate(OffsetDateTime quotationDate) {
    this.quotationDate = quotationDate;
    return this;
  }

  /**
   * Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return quotationDate
  **/
  @ApiModelProperty(value = "Date and time at which an exchange rate is quoted.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  
    @Valid
    public OffsetDateTime getQuotationDate() {
    return quotationDate;
  }

  public void setQuotationDate(OffsetDateTime quotationDate) {
    this.quotationDate = quotationDate;
  }

  public OBCurrencyExchange5 instructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBCurrencyExchange5InstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCurrencyExchange5 obCurrencyExchange5 = (OBCurrencyExchange5) o;
    return Objects.equals(this.sourceCurrency, obCurrencyExchange5.sourceCurrency) &&
        Objects.equals(this.targetCurrency, obCurrencyExchange5.targetCurrency) &&
        Objects.equals(this.unitCurrency, obCurrencyExchange5.unitCurrency) &&
        Objects.equals(this.exchangeRate, obCurrencyExchange5.exchangeRate) &&
        Objects.equals(this.contractIdentification, obCurrencyExchange5.contractIdentification) &&
        Objects.equals(this.quotationDate, obCurrencyExchange5.quotationDate) &&
        Objects.equals(this.instructedAmount, obCurrencyExchange5.instructedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCurrency, targetCurrency, unitCurrency, exchangeRate, contractIdentification, quotationDate, instructedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCurrencyExchange5 {\n");
    
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
    sb.append("    quotationDate: ").append(toIndentedString(quotationDate)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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
