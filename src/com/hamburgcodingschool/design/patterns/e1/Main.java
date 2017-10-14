package com.hamburgcodingschool.design.patterns.e1;

import com.hamburgcodingschool.design.patterns.e1.composite.Doable;
import com.hamburgcodingschool.design.patterns.e1.composite.Task;
import com.hamburgcodingschool.design.patterns.e1.composite.TaskList;
import com.hamburgcodingschool.design.patterns.e1.composite.ToDo;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        ToDo exampleCode = new ToDo("Create example code");
        ToDo createSlide = new ToDo("Create slides");
        List<Doable> doableList = new ArrayList<>();
        doableList.add(exampleCode);
        doableList.add(createSlide);

        Task prepareComposite = new Task("Prepare Composite", doableList);
        List<Task> tasks = new ArrayList<>();
        tasks.add(prepareComposite);

        TaskList taskList = new TaskList(tasks);
        taskList.printTaskList();
    }
}
