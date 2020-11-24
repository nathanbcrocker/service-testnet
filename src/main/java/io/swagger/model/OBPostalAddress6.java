package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OBAddressTypeCode;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information that locates and identifies a specific address, as defined by postal services.
 */
@ApiModel(description = "Information that locates and identifies a specific address, as defined by postal services.")
@Validated



public class OBPostalAddress6   {
  @JsonProperty("AddressType")
  private OBAddressTypeCode addressType = null;

  @JsonProperty("Department")
  private String department = null;

  @JsonProperty("SubDepartment")
  private String subDepartment = null;

  @JsonProperty("StreetName")
  private String streetName = null;

  @JsonProperty("BuildingNumber")
  private String buildingNumber = null;

  @JsonProperty("PostCode")
  private String postCode = null;

  @JsonProperty("TownName")
  private String townName = null;

  @JsonProperty("CountrySubDivision")
  private String countrySubDivision = null;

  @JsonProperty("Country")
  private String country = null;

  @JsonProperty("AddressLine")
  @Valid
  private List<String> addressLine = null;

  public OBPostalAddress6 addressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OBAddressTypeCode getAddressType() {
    return addressType;
  }

  public void setAddressType(OBAddressTypeCode addressType) {
    this.addressType = addressType;
  }

  public OBPostalAddress6 department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Identification of a division of a large organisation or building.
   * @return department
  **/
  @ApiModelProperty(value = "Identification of a division of a large organisation or building.")
  
  @Size(min=1,max=70)   public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public OBPostalAddress6 subDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
    return this;
  }

  /**
   * Identification of a sub-division of a large organisation or building.
   * @return subDepartment
  **/
  @ApiModelProperty(value = "Identification of a sub-division of a large organisation or building.")
  
  @Size(min=1,max=70)   public String getSubDepartment() {
    return subDepartment;
  }

  public void setSubDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
  }

  public OBPostalAddress6 streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Get streetName
   * @return streetName
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=70)   public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBPostalAddress6 buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Get buildingNumber
   * @return buildingNumber
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=16)   public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBPostalAddress6 postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Get postCode
   * @return postCode
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=16)   public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBPostalAddress6 townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Get townName
   * @return townName
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1,max=35)   public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBPostalAddress6 countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Identifies a subdivision of a country such as state, region, county.
   * @return countrySubDivision
  **/
  @ApiModelProperty(value = "Identifies a subdivision of a country such as state, region, county.")
  
  @Size(min=1,max=35)   public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBPostalAddress6 country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government.
   * @return country
  **/
  @ApiModelProperty(value = "Nation with its own government.")
  
  @Pattern(regexp="^[A-Z]{2,2}$")   public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OBPostalAddress6 addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBPostalAddress6 addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<String>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
  **/
  @ApiModelProperty(value = "")
  
  @Size(max=7)   public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPostalAddress6 obPostalAddress6 = (OBPostalAddress6) o;
    return Objects.equals(this.addressType, obPostalAddress6.addressType) &&
        Objects.equals(this.department, obPostalAddress6.department) &&
        Objects.equals(this.subDepartment, obPostalAddress6.subDepartment) &&
        Objects.equals(this.streetName, obPostalAddress6.streetName) &&
        Objects.equals(this.buildingNumber, obPostalAddress6.buildingNumber) &&
        Objects.equals(this.postCode, obPostalAddress6.postCode) &&
        Objects.equals(this.townName, obPostalAddress6.townName) &&
        Objects.equals(this.countrySubDivision, obPostalAddress6.countrySubDivision) &&
        Objects.equals(this.country, obPostalAddress6.country) &&
        Objects.equals(this.addressLine, obPostalAddress6.addressLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, department, subDepartment, streetName, buildingNumber, postCode, townName, countrySubDivision, country, addressLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPostalAddress6 {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
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
