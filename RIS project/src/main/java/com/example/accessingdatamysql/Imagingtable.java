package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Imagingtable{ 
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private String imgPath;
    private Integer imagingID;
    private Integer timeStamp;
    private String user;
    private Integer id;
    
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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
