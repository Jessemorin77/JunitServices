package com.myclass;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private final Map<String, Task> tasks = new HashMap<>();

    public void addTask(Task task){
        if(task == null || tasks.containsKey(task.getTaskID())){
            throw new IllegalArgumentException("task exists or invalid");
        }
        tasks.put(task.getTaskID(), task);
    }

    public void deleteTask(String taskID){
        if(!tasks.containsKey(taskID)){
            throw new IllegalArgumentException("task doesn't exist or invalid");
        }
        tasks.remove(taskID);
    }

    public void updateTask(String taskID, String name, String description){
        Task task = tasks.get(taskID);

        if(task == null){
            throw new IllegalArgumentException("task doesn't exist or invalid");
        }
        if(name != null){
            task.setName(name);
        }
        if(description != null){
            task.setDescription(description);
        }
    }

    public Task getTask(String taskID){
        return tasks.get(taskID);
    }
}

