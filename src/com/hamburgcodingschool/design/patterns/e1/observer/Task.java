package com.hamburgcodingschool.design.patterns.e1.observer;

import com.hamburgcodingschool.design.patterns.e1.flyweight.PrefixPool;

import java.util.ArrayList;
import java.util.List;

public class Task implements Doable, DoneObserver {

    private final String description;
    private final List<Doable> doableList = new ArrayList<>();
    private int index;

    public Task(String description) {
        this.description = description;
    }

    public int setIndex(int index) {
        this.index = index;
        int childIndex = index + 1;
        for (Doable doable : doableList) {
            childIndex = doable.setIndex(childIndex);
        }
        return childIndex;
    }

    public void addDoable(Doable doable) {
        doableList.add(doable);
    }

    @Override
    public void done() {
        for (Doable doable : doableList) {
            doable.done();
        }
    }

    @Override
    public void undo() {
        for (Doable doable : doableList) {
            doable.undo();
        }
    }

    @Override
    public boolean isDone() {
        for (Doable doable : doableList) {
            if (!doable.isDone()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void print(int indentation) {
        String indent = PrefixPool.getIndent(indentation);
        String checkBox = PrefixPool.getCheckBox(isDone());
        System.out.println(String.format("%d%s %s %s", index, indent, checkBox, description));
        for (Doable doable : doableList) {
            doable.print(indentation + 1);
        }
    }

    @Override
    public void notifyDone(int index) {
        if (this.index == index) {
            done();
        }
    }
}
