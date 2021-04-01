package com.example.servingwebcontent;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Appointment") //This specifies the primary table for the annotated entity in MySQL. MAKE SURE YOUR NAMES MATCH IN YOUR SQL 

public class Appointment {
    @Id //Specifies the primary key of an entity.
    @Column(name = "id") //Specifies the mapped column for a persistent property or field.
    @GeneratedValue(strategy=GenerationType.AUTO) //The GeneratedValue annotation may be applied to a primary key property or field of an entity or mapped superclass in conjunction with the Id annotation
    private Long id;

    @Column(name = "appttime")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    public LocalDateTime appttime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LocalDateTime getApptTime(){
        return appttime;
    }

    public void setApptTime(LocalDateTime appttime){
        this.appttime = appttime;
    }

    public Appointment(){

    }

    public Appointment(Long id, LocalDateTime appttime){
        this.id = id;
        this.appttime = appttime;
    }
}
