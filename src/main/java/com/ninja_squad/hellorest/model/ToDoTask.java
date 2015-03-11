package com.ninja_squad.hellorest.model;

public class ToDoTask {
    public String label;
    public String priority;

    public ToDoTask() {
        this.label = "Default";
        this.priority = "DEFAULT";
    }
    
    public ToDoTask(String label) {
        this.label = label;
        this.priority = "DEFAULT";
    }
}
