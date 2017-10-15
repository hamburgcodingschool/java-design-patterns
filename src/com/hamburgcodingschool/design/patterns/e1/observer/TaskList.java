package com.hamburgcodingschool.design.patterns.e1.observer;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements DoableList {

    final private List<Doable> doables = new ArrayList<>();

    final private String name;

    public TaskList(String name) {
        this.name = name;
    }

    @Override
    public int setIndices(int startIndex) {
        int index = startIndex;
        for (Doable doable : doables) {
            index = doable.setIndex(index);
        }
        return index;
    }

    @Override
    public void addDoable(Doable doable) {
        doables.add(doable);
    }

    @Override
    public void printName() {
        System.out.println(String.format("List \"%s\"", name));
    }

    @Override
    public void printList() {
        for (Doable doable : doables) {
            doable.print(0);
        }
    }
}
