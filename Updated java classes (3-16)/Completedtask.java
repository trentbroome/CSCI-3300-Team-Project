package com.example.accessingdatamysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="completed_task")

public class Completedtask{

    @Id 
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO) 
		
    private Integer id;
    
    private Integer priority;
    
    private Integer incessant;
    
    private Integer runatdate;
    
    private String taskhash;
    
    private String taskname;

    private String taskparams;
    

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPriority() {
        return priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    
    public Integer getIncessant() {
        return incessant;
    }
    
    public void setIncessant(Integer incessant) {
        this.incessant = incessant;
    }
    
    public Integer getRunatdate() {
        return runatdate;
    }
    
    public void setRunatdate(Integer runatdate) {
        this.runatdate = runatdate;
    }
  
    public String getTaskhash() {
        return taskhash;
    }
    
    public void setTaskhash(String taskhash) {
        this.taskhash = taskhash;
    }
    
    public String getTaskname() {
        return taskname;
    }
    
    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }
    
    public String getTaskparams() {
        return taskparams;
    }
    
    public void setTaskParams(String taskparams) {
        this.taskparams = taskparams;
    }
    
}