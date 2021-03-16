package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)


    private Integer id;
    private Integer priority;
    private Long repeat;
    private Integer runAtDate;
    private String taskHash;
    private String taskName;
    private String taskParams;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Long getRepeat() {
        return repeat;
    }
    
    public void setRepeat(Long repeat) {
        this.repeat = repeat;
    }
    
    public Integer getPriority() {
        return priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    
    public Integer getRunAtDate() {
        return runAtDate;
    }
    
    public void setRunAtDate(Integer runAtDate) {
        this.runAtDate = runAtDate;
    }
    
    public String getTaskHash() {
        return taskHash;
    }
    
    public void setTaskHash(String taskHash) {
        this.taskHash = taskHash;
    }
    
    public String getTaskName() {
        return taskName;
    }
    
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    
    public String getTaskParams() {
        return taskParams;
    }
    
    public void setTaskParams(String taskParams) {
        this.taskParams = taskParams;
    }
}
