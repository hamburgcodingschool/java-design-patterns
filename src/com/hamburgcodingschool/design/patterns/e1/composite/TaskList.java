package com.hamburgcodingschool.design.patterns.e1.composite;

import java.util.List;

public class TaskList {
    final private List<Task> tasks;

    public TaskList(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void printTaskList() {
        for (Task task : tasks) {
            task.print(0);
        }
    }
}
