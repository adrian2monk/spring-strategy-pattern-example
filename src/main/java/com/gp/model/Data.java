package com.gp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    private DocumentType document;

    private double limitCredit;

    public Long getId() {
        return id;
    }

    public void setId(long userId) {
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

    public DocumentType getDocument() {
        return document;
    }

    public void setDocument(DocumentType document) {
        this.document = document;
    }

    public double getLimitCredit() {
        return limitCredit;
    }

    public void setLimitCredit(double limitCredit) {
        this.limitCredit = limitCredit;
    }
}
