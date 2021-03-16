package com.example.accessingdatamysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user_login")
public class Userlogin{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
   
    private Integer id;
    private String password;
    private String username;
    private Integer ID_key;
    
    
    public Integer getId() {
        return id;
      }
    
      public void setId(Integer id) {
        this.id = id;
      }
    
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

    public Integer getID_key() {
        return ID_key;
    }
        
    public void setID_key(Integer ID_key) {
        this.ID_key = ID_key;
    }

  
}
