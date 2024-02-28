package com.myclass;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class AppointmentTest {

    @Test
    void appointmentIDTooLong(){
        assertThrows(IllegalArgumentException. class, () -> {
            LocalDate appointmentDate = LocalDate.of(2024, 2, 25);
            new Appointment("12345678910", appointmentDate, "testDescription");
        });
    }
     
     
    @Test
    void appointmentIDNull(){
        assertThrows(IllegalArgumentException. class, () -> {
            LocalDate appointmentDate = LocalDate.of(2024, 2, 25);
            new Appointment(null, appointmentDate, "testDescription");
        });
    }
     
    @Test
    void dateNull(){
        assertThrows(IllegalArgumentException. class, () -> {
            new Appointment("123456789", null, "testDescription");
        });
    }
    @Test
    void dateInPast(){
        assertThrows(IllegalArgumentException. class, () -> {
            LocalDate appointmentDate = LocalDate.of(2024, 1, 25);
            new Appointment("123456789", appointmentDate, "testDescription");
        });
    }
    @Test
    void descriptionNull(){
        assertThrows(IllegalArgumentException. class, () -> {
            LocalDate appointmentDate = LocalDate.of(2024, 2, 25);
            new Appointment("123456789", appointmentDate, null);
        });
    }
    @Test
    void descriptionTooLong(){
        assertThrows(IllegalArgumentException. class, () -> {
            LocalDate appointmentDate = LocalDate.of(2024, 2, 25);
            new Appointment("123456789", appointmentDate, "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        });
    }
}

