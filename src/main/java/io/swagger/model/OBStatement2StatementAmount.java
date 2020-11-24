package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OBActiveOrHistoricCurrencyAndAmount8;
import io.swagger.model.OBCreditDebitCode0;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Set of elements used to provide details of a generic amount for the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic amount for the statement resource.")
@Validated



public class OBStatement2StatementAmount   {
  @JsonProperty("CreditDebitIndicator")
  private OBCreditDebitCode0 creditDebitIndicator = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("Amount")
  private OBActiveOrHistoricCurrencyAndAmount8 amount = null;

  public OBStatement2StatementAmount creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBCreditDebitCode0 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBStatement2StatementAmount type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementAmount amount(OBActiveOrHistoricCurrencyAndAmount8 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBActiveOrHistoricCurrencyAndAmount8 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount8 amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementAmount obStatement2StatementAmount = (OBStatement2StatementAmount) o;
    return Objects.equals(this.creditDebitIndicator, obStatement2StatementAmount.creditDebitIndicator) &&
        Objects.equals(this.type, obStatement2StatementAmount.type) &&
        Objects.equals(this.amount, obStatement2StatementAmount.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditDebitIndicator, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementAmount {\n");
    
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
