package com.myclass;

import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private final Map<String, Appointment> appointments = new HashMap<>();

    public void addAppointment(Appointment appointment){
        if(appointment == null || appointments.containsKey(appointment.getAppointmentID())){
            throw new IllegalArgumentException("appointment exists or invalid");
        }
        appointments.put(appointment.getAppointmentID(), appointment);
    }

    public void deleteAppointment(String appointmentID){
        if(!appointments.containsKey(appointmentID)){
            throw new IllegalArgumentException("appointment doesn't exist or invalid");
        }
        appointments.remove(appointmentID);
    }


    public Appointment getAppointment(String appointmentID){
        return appointments.get(appointmentID);
    }
}


