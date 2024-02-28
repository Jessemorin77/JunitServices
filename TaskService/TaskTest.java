package com.myclass;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TaskTest {
    /*
     * TaskID not longer then 10 characters
     * TaskID null
     *
     * name null
     * name not longer then 20 characters
     * 
     * description null
     * description longer then 50 characters 
     */
    @Test
    void taskIDTooLong(){
        assertThrows(IllegalArgumentException. class, () -> {
            new Task("12345678910", "testName", "testDescription");
        });
    }
    @Test
    void taskIDNull(){
        assertThrows(IllegalArgumentException. class, () -> {
            new Task(null, "testName", "testDescription");
        });
    }
    @Test
    void nameNull(){
        assertThrows(IllegalArgumentException. class, () -> {
            new Task("12", null, "testDescription");
        });
    }
    @Test
    void NameTooLong(){
        assertThrows(IllegalArgumentException. class, () -> {
            new Task("12", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "testDescription");
        });
    }
    @Test
    void descriptionNull(){
        assertThrows(IllegalArgumentException. class, () -> {
            new Task("12", "testName", null);
        });
    }
    @Test
    void descriptionTooLong(){
        assertThrows(IllegalArgumentException. class, () -> {
            new Task("12", "testName", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        });
    }

}
