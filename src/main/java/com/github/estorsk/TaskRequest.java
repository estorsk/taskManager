package com.github.estorsk;

import java.util.ArrayList;
import java.util.List;

public class TaskRequest {

    private Integer taskId;
    private String taskName;
    private String taskDescription;
    private Boolean taskStatus;
    private static List tasks = new ArrayList();

    public TaskRequest() {
        this.tasks = getTasks();
    }

    public List getTasks() {
        return tasks;
    }

    public TaskRequest(Integer taskId, String taskName, String taskDescription, Boolean taskStatus) {
        tasks.add(taskId);
        tasks.add(taskName);
        tasks.add(taskDescription);
        tasks.add(taskStatus);
    }

    public Integer getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Boolean getTaskStatus() {
        return taskStatus;
    }


    public void setTask(Integer tempId, String tempName, String tempDescription, Boolean tempStatus){
        this.taskId = tempId;
        this.taskName = tempName;
        this.taskDescription = tempDescription;
        this.taskStatus = tempStatus;
    }

}
