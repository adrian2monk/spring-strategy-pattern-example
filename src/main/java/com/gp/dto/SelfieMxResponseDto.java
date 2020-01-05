package com.gp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
		 "rppUserId","scanReference","nationality","identification", 
		 "identificationType","curp","state","postalCode",
		 "addressCity","addressCountry","address","birthDate",
		 "name", "firstSurname","lastSurname", "gender", "status"})


public class SelfieMxResponseDto {

	private String rppUserId;
	private String scanReference;
	private String nationality;
	private String identification;
	private String identificationType;
	private String curp;
	private String state;
	private String postalCode;
	private String addressCity;
	private String addressCountry;
	private String address;
	private String birthDate;
	private String name;
	private String firstSurname;
	private String lastSurname;
	private String gender;
	private String status;

	@JsonProperty("rpp_user_id")
	public String getRppUserId() {
		return rppUserId;
	}

	public void setRppUserId(String rppUserId) {
		this.rppUserId = rppUserId;
	}

	@JsonProperty("scan_reference")
	public String getScanReference() {
		return scanReference;
	}

	public void setScanReference(String scanReference) {
		this.scanReference = scanReference;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	@JsonProperty("identification_type")
	public String getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("postal_code")
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@JsonProperty("address_city")
	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	@JsonProperty("address_country")
	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty("birthdate")
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("first_surname")
	public String getFirstSurname() {
		return firstSurname;
	}

	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	@JsonProperty("last_surname")
	public String getLastSurname() {
		return lastSurname;
	}

	public void setLastSurname(String lastSurname) {
		this.lastSurname = lastSurname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "JumioCurpResponse [rppUserId=" + rppUserId + ", scanReference=" + scanReference + ", nationality="
				+ nationality + ", identification=" + identification + ", identificationType=" + identificationType
				+ ", curp=" + curp + ", state=" + state + ", postalCode=" + postalCode + ", addressCity=" + addressCity
				+ ", addressCountry=" + addressCountry + ", address=" + address + ", birthDate=" + birthDate + ", name="
				+ name + ", firstSurname=" + firstSurname + ", lastSurname=" + lastSurname + ", gender=" + gender
				+ ", status=" + status + "]";
	}

}
