package com.example.accessingdatamysql;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class

public class Session{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
		
    private String sessionKey;
    private Integer expireDate;
    private Integer sessionDate;
    private Integer id;
    
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
