package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Patienttable{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)	

    private String firstName;
    private String lastName;
    private char middleInitial;
    private Integer dOB;
    private Integer phoneNumber;
    private String email;
    private String asthmaAllergy;
    private String notes;
    private Integer id;
    
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
    
    public String getAsthmaAllergy() {
        return asthmaAllergy;
    }
    
    public void setAsthmaAllergy(String asthmaAllergy) {
        this.asthmaAllergy = asthmaAllergy;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }	
    
}
