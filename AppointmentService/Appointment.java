package com.myclass;

import java.time.LocalDate;

public class Appointment {
    private final String appointmentID;
    private LocalDate appointmentDate;     
    private String description;

    public Appointment(String appointmentID, LocalDate appointmentDate, String description){
        if(appointmentID == null || appointmentID.length() > 10){
            throw new IllegalArgumentException("invalid appointmentID");  
        };
        if(appointmentDate == null || appointmentDate.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("invalid Date"); 
        }
        if(description == null || description.length() > 50){
            throw new IllegalArgumentException("invalid Description");  
        }
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }

    //getters
    public String getAppointmentID(){
        return appointmentID;
    }
    public LocalDate getAppointmentDate(){
        return appointmentDate;
    }
    public String getDescription(){
        return description;
    }
    //setters

    public void setDate(LocalDate appointmentDate){
        if(appointmentDate == null || appointmentDate.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("invalid Date"); 
        }
        this.appointmentDate = appointmentDate; 
    }

    public void setDescription(String description){
        if(description == null || description.length() > 50){
            throw new IllegalArgumentException("invalid Description");  
        }
        this.description = description;
    }
}

