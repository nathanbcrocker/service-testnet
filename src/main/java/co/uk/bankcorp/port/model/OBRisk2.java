package co.uk.bankcorp.port.model;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.
 */
@ApiModel(description = "The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.")
@Validated



public class OBRisk2   {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBRisk2 {\n");
    
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
