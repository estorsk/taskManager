package com.github.estorsk;

public class RandomGenerator {

    public Integer valueTasks;
    public Integer valueId;

    public void randomValueTasks(){
        valueTasks = 1;
        valueTasks = ((int) Math.round(Math.random() * 9));
    }

    public void randomValueId(){
        valueId = ((int) Math.round(Math.random() * 99));
    }

    public int setValueTasks() {
        randomValueTasks();
        return valueTasks;
    }

    public int setValueId(){
        randomValueId();
        return valueId;
    }
}
