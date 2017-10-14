package com.hamburgcodingschool.design.patterns.e1.singleton;

import com.hamburgcodingschool.design.patterns.e1.composite.TaskList;

import java.util.ArrayList;
import java.util.List;

public class TaskListPool {

    private final List<TaskList> taskLists = new ArrayList<>();

    private static TaskListPool instance;

    private TaskListPool() {
    }

    public static TaskListPool getInstance() {
        if (instance == null) {
            instance = new TaskListPool();
        }
        return instance;
    }

    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public int getNumberOfTaskLists() {
        return taskLists.size();
    }

    public TaskList getTaskListAt(int index) {
        if (taskLists.isEmpty()) {
            return null;
        }
        if (index < 0) {
            return taskLists.get(0);
        }
        if (index >= taskLists.size()) {
            return taskLists.get(taskLists.size() - 1);
        }
        return taskLists.get(index);
    }

    public void printLists() {
        for (int i = 0; i < taskLists.size(); i++) {
            TaskList taskList = taskLists.get(i);
            taskList.printName();
            taskList.printTaskList();
            System.out.println();
        }
    }
}
