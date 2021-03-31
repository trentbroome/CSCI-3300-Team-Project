package com.example.servingwebcontent;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "diagnosticReport") //This specifies the primary table for the annotated entity in MySQL. MAKE SURE YOUR NAMES MATCH IN YOUR SQL 

public class DiagnosticReport {
    @Id //Specifies the primary key of an entity.
    @Column(name = "id") //Specifies the mapped column for a persistent property or field.
    @GeneratedValue(strategy=GenerationType.AUTO) //The GeneratedValue annotation may be applied to a primary key property or field of an entity or mapped superclass in conjunction with the Id annotation
    private Integer id;
    private String report;
    private Integer patient_id;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getReport() {
        return report;
    }
    public void setReport(String report) {
        this.report = report;
    }

    public Integer getPatient_id(){
        return this.patient_id;
    }

    public void setPatient_id(Integer patient_id){
        this.patient_id = patient_id;
    }

    @Override
	public String toString() {
		return "DiagnosticReport [id=" + id + ", report=" + report +", patient_id=" + patient_id +"]";
	}
}