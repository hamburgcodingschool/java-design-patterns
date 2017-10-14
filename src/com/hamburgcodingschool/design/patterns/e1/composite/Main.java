package com.hamburgcodingschool.design.patterns.e1.composite;

public class Main {

    public static void main(String[] args) {
        ToDo exampleCode = new ToDo("Create example code");
        ToDo createSlide = new ToDo("Create slides");

        Task prepareComposite = new Task("Prepare Composite");
        prepareComposite.addDoable(exampleCode);
        prepareComposite.addDoable(createSlide);

        TaskList taskList = new TaskList("Course Preparation");
        taskList.addDoable(prepareComposite);
        taskList.printList();
    }
}
