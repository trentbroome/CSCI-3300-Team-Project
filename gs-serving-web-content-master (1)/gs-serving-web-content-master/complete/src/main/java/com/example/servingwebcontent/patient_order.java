package com.example.servingwebcontent;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity// This tells Hibernate to make a table out of this class
@Table(name = "patient_order") //This specifies the primary table for the annotated entity in MySQL. MAKE SURE YOUR NAMES MATCH IN YOUR SQL 
public class patient_order {
    @Id //Specifies the primary key of an entity.
    @Column(name = "id") //Specifies the mapped column for a persistent property or field.
    @GeneratedValue(strategy=GenerationType.AUTO) //The GeneratedValue annotation may be applied to a primary key property or field of an entity or mapped superclass in conjunction with the Id annotation.

    private Integer ID;
    private String notes;
    private String Modality;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public String getModality() {
        return Modality;
    }
    
    public void setModality(String Modality) {
        this.Modality = Modality;
    }

    @Override
	public String toString() {
		return "patient_order [=ID" + ID + ", Notes=" + notes + ", Modality=" + Modality +"]";
}
}
