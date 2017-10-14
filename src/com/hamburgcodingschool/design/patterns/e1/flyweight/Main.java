package com.hamburgcodingschool.design.patterns.e1.flyweight;

import com.hamburgcodingschool.design.patterns.e1.singleton.TaskListPool;

public class Main {

    public static void main(String[] args) {
        ToDo compositeExampleCode = new ToDo("Create example code");
        ToDo createCompositeSlide = new ToDo("Create slides");

        Task prepareComposite = new Task("Prepare Composite");
        prepareComposite.addDoable(compositeExampleCode);
        prepareComposite.addDoable(createCompositeSlide);
        prepareComposite.done();

        TaskList taskList = new TaskList("Course Preparation");
        taskList.addDoable(prepareComposite);

        ToDo singletonExampleCode = new ToDo("Create example code");
        singletonExampleCode.done();
        ToDo createSingletonSlide = new ToDo("Create slides");
        Task prepareSingleton = new Task("Prepare singleton");
        prepareSingleton.addDoable(singletonExampleCode);
        prepareSingleton.addDoable(createSingletonSlide);

        taskList.addDoable(prepareSingleton);

        TaskListPool taskListPool = TaskListPool.getInstance();
        taskListPool.addList(taskList);
        taskListPool.printLists();
    }
}
