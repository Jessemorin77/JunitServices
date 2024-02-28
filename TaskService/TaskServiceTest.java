package com.myclass;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {
    /*Requirements
     *-Add tasks with uniqueID
     *-Delete Task per uniqueID
     *-Update Tasks per UniqueId
        -updateable fields: Name, Description
     */
    private TaskService service;
    //create new instance
    @BeforeEach
    void setUp() {
        service = new TaskService();
    }

    @Test
    void addTaskWithUniqueID(){
        Task task = new Task("1", "testName", "tastDescription");
        service.addTask(task);

        assertEquals(task, service.getTask("1"));
    }
    @Test
    void deleteTaskWithUniqueID(){
        Task task = new Task("1", "testName", "tastDescription");

        service.addTask(task);

        service.deleteTask("1");

        assertNull(service.getTask("1"));
    }
    @Test
    void updateTask(){
        Task task = new Task("1", "testName", "tastDescription");

        service.addTask(task);

        service.updateTask("1", "testName2", "testDescription2");

        Task updatedTask = service.getTask("1");

        assertAll(
            () -> assertEquals("testName2", updatedTask.getName()),
            () -> assertEquals("testDescription2", updatedTask.getDescription())
            );
    }
}


