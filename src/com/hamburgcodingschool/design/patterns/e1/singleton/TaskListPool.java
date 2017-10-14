package com.hamburgcodingschool.design.patterns.e1.singleton;

import com.hamburgcodingschool.design.patterns.e1.composite.DoableList;

import java.util.ArrayList;
import java.util.List;

public class TaskListPool {

    private final List<DoableList> doableLists = new ArrayList<>();

    private static TaskListPool instance;

    private TaskListPool() {
    }

    public static TaskListPool getInstance() {
        if (instance == null) {
            instance = new TaskListPool();
        }
        return instance;
    }

    public void addList(DoableList doableList) {
        doableLists.add(doableList);
    }

    public int getNumberOfLists() {
        return doableLists.size();
    }

    public DoableList getListAt(int index) {
        if (doableLists.isEmpty()) {
            return null;
        }
        if (index < 0) {
            return doableLists.get(0);
        }
        if (index >= doableLists.size()) {
            return doableLists.get(doableLists.size() - 1);
        }
        return doableLists.get(index);
    }

    public void printLists() {
        for (DoableList doableList : doableLists) {
            doableList.printName();
            doableList.printList();
            System.out.println();
        }
    }
}
