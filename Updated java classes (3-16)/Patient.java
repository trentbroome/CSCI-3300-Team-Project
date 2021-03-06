package com.example.accessingdatamysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// This tells Hibernate to make a table out of this class
@Table(name = "patient") //This specifies the primary table for the annotated entity in MySQL. MAKE SURE YOUR NAMES MATCH IN YOUR SQL 

public class Patient{

    @Id //Specifies the primary key of an entity.
    @Column(name = "id") //Specifies the mapped column for a persistent property or field.
    @GeneratedValue(strategy=GenerationType.AUTO) //The GeneratedValue annotation may be applied to a primary key property or field of an entity or mapped superclass in conjunction with the Id annotation.
			
    private Integer id;
    private String firstName;
    private String lastName;
    private char middleInitial;
    private Integer dOB;
    private Integer phoneNumber;
    private String email;
    private String notes;
    private Boolean asthmaAllergy;
    private Boolean xraydyeAllergy;
    private Boolean mridyeAllergy;
    private Boolean latexAllergy;
    private String otherAllergy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    
    public char getMiddleInitial() {
        return middleInitial;
    }
    
    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }
    
    public Integer getdOB() {
        return dOB;
    }
    
    public void setdOB(Integer dOB) {
        this.dOB = dOB;
    }
    
    public Integer getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getAsthmaAllergy() {
        return asthmaAllergy;
    }

    public void setAsthmaAllergy(Boolean asthmaAllergy) {
        this.asthmaAllergy = asthmaAllergy;
    }

    public Boolean getXraydyeAllergy() {
        return xraydyeAllergy;
    }

    public void setXraydyeAllergy(Boolean xraydyeAllergy) {
        this.xraydyeAllergy = xraydyeAllergy;
    }

    public Boolean getMridyeAllergy() {
        return mridyeAllergy;
    }

    public void setMridyeAllergy(Boolean mridyeAllergy) {
        this.mridyeAllergy = mridyeAllergy;
    }

    public Boolean getLatexAllergy() {
        return latexAllergy;
    }

    public void setLatexAllergy(Boolean latexAllergy) {
        this.latexAllergy = latexAllergy;
    }

    public String getOtherAllergy() {
        return otherAllergy;
    }

    public void setOtherAllergy(String otherAllergy) {
        this.otherAllergy = otherAllergy;
    }	
    
}