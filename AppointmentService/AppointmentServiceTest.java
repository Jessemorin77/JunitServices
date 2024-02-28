package com.myclass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {
    private AppointmentService service;
    //create new instance
    @BeforeEach
    void setUp() {
        service = new AppointmentService();
    }

    @Test
    void addAppointmentWithUniqueID(){
        LocalDate appointmentDate = LocalDate.of(2024, 2, 25);
        Appointment appointment = new Appointment("1", appointmentDate, "tastDescription");
        service.addAppointment(appointment);

        assertEquals(appointment, service.getAppointment("1"));
    }
    @Test
    void deleteAppointmentWithUniqueID(){
        LocalDate appointmentDate = LocalDate.of(2024, 2, 25);
        Appointment appointment = new Appointment("1", appointmentDate, "tastDescription");

        service.addAppointment(appointment);

        service.deleteAppointment("1");

        assertNull(service.getAppointment("1"));
    }
}



