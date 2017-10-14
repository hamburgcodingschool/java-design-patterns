package com.hamburgcodingschool.design.patterns.e1.flyweight;

import com.hamburgcodingschool.design.patterns.e1.composite.Doable;
import com.hamburgcodingschool.design.patterns.e1.composite.DoableList;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements DoableList {

    final private List<Doable> doables = new ArrayList<>();

    final private String name;

    public TaskList(String name) {
        this.name = name;
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
