package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Orderinfo{ 

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    private String imgPath;
    private Integer orderID;
    private String visitReason;
    private String modality;
    private String orderNotes;
    private Integer id;
    
    public Integer getOrderID() {
        return orderID;
    }
    
    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }
    
    public String getVisitReason() {
        return visitReason;
    }
    
    public void setVisitReason(String visitReason) {
        this.visitReason = visitReason;
    }
    
    public String getmodality() {
        return modality;
    }
    
    public void setmodality(String modality) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}