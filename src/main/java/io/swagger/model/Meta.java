package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Meta Data relevant to the payload
 */
@ApiModel(description = "Meta Data relevant to the payload")
@Validated



public class Meta   {
  @JsonProperty("TotalPages")
  private Integer totalPages = null;

  @JsonProperty("FirstAvailableDateTime")
  private OffsetDateTime firstAvailableDateTime = null;

  @JsonProperty("LastAvailableDateTime")
  private OffsetDateTime lastAvailableDateTime = null;

  public Meta totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public Meta firstAvailableDateTime(OffsetDateTime firstAvailableDateTime) {
    this.firstAvailableDateTime = firstAvailableDateTime;
    return this;
  }

  /**
   * Get firstAvailableDateTime
   * @return firstAvailableDateTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getFirstAvailableDateTime() {
    return firstAvailableDateTime;
  }

  public void setFirstAvailableDateTime(OffsetDateTime firstAvailableDateTime) {
    this.firstAvailableDateTime = firstAvailableDateTime;
  }

  public Meta lastAvailableDateTime(OffsetDateTime lastAvailableDateTime) {
    this.lastAvailableDateTime = lastAvailableDateTime;
    return this;
  }

  /**
   * Get lastAvailableDateTime
   * @return lastAvailableDateTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getLastAvailableDateTime() {
    return lastAvailableDateTime;
  }

  public void setLastAvailableDateTime(OffsetDateTime lastAvailableDateTime) {
    this.lastAvailableDateTime = lastAvailableDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.totalPages, meta.totalPages) &&
        Objects.equals(this.firstAvailableDateTime, meta.firstAvailableDateTime) &&
        Objects.equals(this.lastAvailableDateTime, meta.lastAvailableDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, firstAvailableDateTime, lastAvailableDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    firstAvailableDateTime: ").append(toIndentedString(firstAvailableDateTime)).append("\n");
    sb.append("    lastAvailableDateTime: ").append(toIndentedString(lastAvailableDateTime)).append("\n");
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
