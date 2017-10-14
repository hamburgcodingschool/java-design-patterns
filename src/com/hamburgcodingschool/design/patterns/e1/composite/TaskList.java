package com.hamburgcodingschool.design.patterns.e1.composite;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    final private List<Doable> doables = new ArrayList<>();

    final private String name;

    public TaskList(String name) {
        this.name = name;
    }

    public void addDoable(Doable doable) {
        doables.add(doable);
    }

    public void printName() {
        System.out.println(String.format("List \"%s\"", name));
    }

    public void printTaskList() {
        for (Doable doable : doables) {
            doable.print(0);
        }
    }
}
