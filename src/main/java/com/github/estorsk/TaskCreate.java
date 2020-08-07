package com.github.estorsk;

public class TaskCreate {

    public static void randomTask() {
        Task myTask = new Task();
        RandomGenerator rndValueId = new RandomGenerator();
        RandomGenerator rndValueTasks = new RandomGenerator();
        int random = rndValueTasks.setValueTasks();

        for (int i = 0; i < random; i++) {
            int tempId = rndValueId.setValueId();
            int rndStatus = (int) Math.round(Math.random() * 9);
            boolean tempStatus;
            if (rndStatus >= 5) {
                tempStatus = true;
            } else {
                tempStatus = false;
            }
            myTask.setTask(tempId, "NameTask_" + tempId, "Help me", tempStatus);
            myTask.addTask();
        }

//        System.out.println("Tasks = " + myTask.getTask());
//        System.out.println("Random = " + random);
    }

}
