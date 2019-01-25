package com.hamburgcodingschool.design.patterns.e1.composite;

public class Main {

    public static void main(String[] args) {
        ToDo exampleCode = new ToDo("Create example code");
        ToDo createSlide = new ToDo("Create slides");

        Task prepareComposite = new Task("Prepare Composite");
        prepareComposite.addDoable(exampleCode);
        prepareComposite.addDoable(createSlide);

        Task codeExample = new Task("Code Example");
        ToDo unfinishedExample = new ToDo("Unfinished example");
        ToDo folderForExercise = new ToDo("Folder for exercise");
        ToDo finishedExample = new ToDo("Finished example (on separate branch)");
        codeExample.addDoable(unfinishedExample);
        codeExample.addDoable(folderForExercise);
        codeExample.addDoable(finishedExample);
        prepareComposite.addDoable(codeExample);

        TaskList taskList = new TaskList("Course Preparation");
        taskList.addDoable(prepareComposite);
        taskList.printList();
    }
}
