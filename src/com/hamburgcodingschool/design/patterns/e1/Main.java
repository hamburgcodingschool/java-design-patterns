package com.hamburgcodingschool.design.patterns.e1;

import com.hamburgcodingschool.design.patterns.e1.composite.Task;
import com.hamburgcodingschool.design.patterns.e1.composite.TaskList;
import com.hamburgcodingschool.design.patterns.e1.composite.ToDo;


public class Main {

    public static void main(String[] args) {
        ToDo exampleCode = new ToDo("Create example code");
        ToDo createSlide = new ToDo("Create slides");

        Task prepareComposite = new Task("Prepare Composite");
        prepareComposite.addDoable(exampleCode);
        prepareComposite.addDoable(createSlide);

        TaskList taskList = new TaskList();
        taskList.addDoable(prepareComposite);
        taskList.printTaskList();
    }
}
