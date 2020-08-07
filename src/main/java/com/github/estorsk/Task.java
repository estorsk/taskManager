package com.github.estorsk;

import java.util.ArrayList;
import java.util.List;

public class Task {

    private static Integer taskId;
    private static String taskName;
    private static String taskDescription;
    private static Boolean taskStatus;
    private static List tasks = new ArrayList();

    public void addTask(){
        tasks.add(taskId);
        tasks.add(taskName);
        tasks.add(taskDescription);
        tasks.add(taskStatus);
    }

    public void setTask(Integer tempId, String tempName, String tempDescription, Boolean tempStatus){
        this.taskId = tempId;
        this.taskName = tempName;
        this.taskDescription = tempDescription;
        this.taskStatus = tempStatus;
    }

    public List getTask() {
        return tasks;
    }

    public Task() {
        this.tasks = getTask();
    }
}
