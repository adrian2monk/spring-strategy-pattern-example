package com.gp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Identification {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private Document documentType;

    private String documentNumber;
    
    private String personalId;
    
    private Date birthDate;
    
    private Country originCountry;

    private String documentCountry;
    
    private String urlSelfie;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Document getDocumentType() {
		return documentType;
	}

	public void setDocumentType(Document documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getPersonalId() {
		return personalId;
	}

	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Country getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(Country originCountry) {
		this.originCountry = originCountry;
	}

	public String getDocumentCountry() {
		return documentCountry;
	}

	public void setDocumentCountry(String documentCountry) {
		this.documentCountry = documentCountry;
	}

	public String getUrlSelfie() {
		return urlSelfie;
	}

	public void setUrlSelfie(String urlSelfie) {
		this.urlSelfie = urlSelfie;
	}
    
	
	
}
