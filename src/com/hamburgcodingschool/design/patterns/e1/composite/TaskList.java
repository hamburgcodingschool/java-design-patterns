package com.hamburgcodingschool.design.patterns.e1.composite;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    final private List<Doable> doables = new ArrayList<>();

    public void addDoable(Doable doable) {
        doables.add(doable);
    }

    public void printTaskList() {
        for (Doable doable : doables) {
            doable.print(0);
        }
    }
}
