package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Userlogin{
	@Id
  @GeneratedValue(strategy=GenerationType.AUTO)	
    private Integer id;
    private String password;
    private String username;
    private Integer idkey;
    
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }


    public Integer getidkey() {
        return idkey;
    }

    public void setidkey(Integer idkey) {
        this.idkey = idkey;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}