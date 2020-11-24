package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Links;
import io.swagger.model.Meta;
import io.swagger.model.OBReadConsentResponse1Data;
import io.swagger.model.OBRisk2;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OBReadConsentResponse1
 */
@Validated



public class OBReadConsentResponse1   {
  @JsonProperty("Data")
  private OBReadConsentResponse1Data data = null;

  @JsonProperty("Risk")
  private OBRisk2 risk = null;

  @JsonProperty("Links")
  private Links links = null;

  @JsonProperty("Meta")
  private Meta meta = null;

  public OBReadConsentResponse1 data(OBReadConsentResponse1Data data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBReadConsentResponse1Data getData() {
    return data;
  }

  public void setData(OBReadConsentResponse1Data data) {
    this.data = data;
  }

  public OBReadConsentResponse1 risk(OBRisk2 risk) {
    this.risk = risk;
    return this;
  }

  /**
   * Get risk
   * @return risk
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OBRisk2 getRisk() {
    return risk;
  }

  public void setRisk(OBRisk2 risk) {
    this.risk = risk;
  }

  public OBReadConsentResponse1 links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadConsentResponse1 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadConsentResponse1 obReadConsentResponse1 = (OBReadConsentResponse1) o;
    return Objects.equals(this.data, obReadConsentResponse1.data) &&
        Objects.equals(this.risk, obReadConsentResponse1.risk) &&
        Objects.equals(this.links, obReadConsentResponse1.links) &&
        Objects.equals(this.meta, obReadConsentResponse1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsentResponse1 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
