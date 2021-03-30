package com.example.servingwebcontent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "order_info") //This specifies the primary table for the annotated entity in MySQL. MAKE SURE YOUR NAMES MATCH IN YOUR SQL 

public class OrderInfo{ 

    @Id //Specifies the primary key of an entity.
    @Column (name = "id") //Specifies the mapped column for a persistent property or field.
    @GeneratedValue(strategy=GenerationType.AUTO) //The GeneratedValue annotation may be applied to a primary key property or field of an entity or mapped superclass in conjunction with the Id annotation.
    
    private Integer id;
    private Integer orderID;
    private String appttime;
    private String visitReason;
    private String modality;
    private String orderNotes;
    private String imgPath;
    private String timeAdded;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderID() {
        return orderID;
    }
    
    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getApptTime(){
        return appttime;
    }

    public void setApptTime(String appttime){
        this.appttime = appttime;
    }
    
    public String getVisitReason() {
        return visitReason;
    }
    
    public void setVisitReason(String visitReason) {
        this.visitReason = visitReason;
    }
    
    public String getModality() {
        return modality;
    }
    
    public void setModality(String modality) {
        this.modality = modality;
    }
    
    public String getOrderNotes() {
        return orderNotes;
    }
    
    public void setOrderNotes(String orderNotes) {
        this.orderNotes = orderNotes;
    }

    public String getimgPath() {
        return imgPath;
    }

    public void setimgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    
    public String getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(String timeAdded) {
        this.timeAdded = timeAdded;
    }

    
}

    

