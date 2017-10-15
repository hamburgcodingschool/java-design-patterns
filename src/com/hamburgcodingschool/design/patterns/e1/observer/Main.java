package com.hamburgcodingschool.design.patterns.e1.observer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ToDo compositeExampleCode = new ToDo("Create example code");
        ToDo createCompositeSlide = new ToDo("Create slides");

        Task prepareComposite = new Task("Prepare Composite");
        prepareComposite.addDoable(compositeExampleCode);
        prepareComposite.addDoable(createCompositeSlide);

        TaskList taskList = new TaskList("Course Preparation");
        taskList.addDoable(prepareComposite);

        ToDo singletonExampleCode = new ToDo("Create example code");
        ToDo createSingletonSlide = new ToDo("Create slides");

        Task prepareSingleton = new Task("Prepare singleton");
        prepareSingleton.addDoable(singletonExampleCode);
        prepareSingleton.addDoable(createSingletonSlide);

        taskList.addDoable(prepareSingleton);
        taskList.setIndices(0);
        taskList.printList();

        DoneSubject doneSubject = new DoneSubject();
        doneSubject.subscribe(compositeExampleCode);
        doneSubject.subscribe(createCompositeSlide);
        doneSubject.subscribe(prepareComposite);
        doneSubject.subscribe(singletonExampleCode);
        doneSubject.subscribe(createSingletonSlide);
        doneSubject.subscribe(prepareSingleton);

        System.out.print("> Type the index of the element to set to done: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        int index = Integer.valueOf(userInput);
        doneSubject.accept(index);
        taskList.printList();
    }
}
