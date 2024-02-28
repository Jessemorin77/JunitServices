package com.myclass;

public class Task {
   private final String taskID;
   private String name;
   private String description;

    public Task(String taskID, String name, String description){
        if(taskID == null || taskID.length() > 10){
            throw new IllegalArgumentException("invalid taskID");
        }
        if(name == null || name.length() > 20){
            throw new IllegalArgumentException("invalid name");
        }
        if(description == null || description.length() > 50){
            throw new IllegalArgumentException("invalid description");
        }
        
        this.taskID = taskID;
        this.name = name;
        this.description = description;
    }

    //getters
    public String getTaskID(){
        return taskID;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    //setters
    public void setName(String name){
        if(name == null || name.length() > 20){
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name; 
    }
    public void setDescription(String description){
        if(description == null || description.length() > 50){
            throw new IllegalArgumentException("invalid description");
        }
        this.description = description; 
    }
}
