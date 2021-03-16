package com.example.accessingdatamysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// This tells Hibernate to make a table out of this class
@Table(name = "session") //This specifies the primary table for the annotated entity in MySQL. MAKE SURE YOUR NAMES MATCH IN YOUR SQL 

public class Session{

    @Id //Specifies the primary key of an entity.
    @Column(name = "id") //Specifies the mapped column for a persistent property or field.
    @GeneratedValue(strategy=GenerationType.AUTO) //The GeneratedValue annotation may be applied to a primary key property or field of an entity or mapped superclass in conjunction with the Id annotation.
	
    private Integer id;
    private String sessionKey;
    private Integer expireDate;
    private Integer sessionDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getSessionKey() {
        return sessionKey;
    }
    
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }
    
    public Integer getExpireDate() {
        return expireDate;
    }
    
    public void setExpireDate(Integer expireDate) {
        this.expireDate = expireDate;
    }
    
    public Integer getSessionDate() {
        return sessionDate;
    }
    
    public void setSessionDate(Integer sessionDate) {
        this.sessionDate = sessionDate;
    }

    
}
