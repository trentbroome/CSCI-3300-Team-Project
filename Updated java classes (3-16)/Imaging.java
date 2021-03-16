package com.example.accessingdatamysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "imaging") //This specifies the primary table for the annotated entity in MySQL. MAKE SURE YOUR NAMES MATCH IN YOUR SQL 

public class Imaging{ 
    
    @Id //Specifies the primary key of an entity.
    @Column(name = "id") //Specifies the mapped column for a persistent property or field.
    @GeneratedValue(strategy=GenerationType.AUTO) //The GeneratedValue annotation may be applied to a primary key property or field of an entity or mapped superclass in conjunction with the Id annotation.

    private Integer id;
    private Integer imagingID;
    private Integer timeStamp;
    private String user;
    private String imgPath;
    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getImagingID() {
        return imagingID;
    }
    public void setImagingID(Integer imagingID) {
        this.imagingID = imagingID;
    }
    public Integer getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Integer timeStamp) {
        this.timeStamp = timeStamp;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getimgPath() {
        return imgPath;
    }
    public void setimgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    
}
