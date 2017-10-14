package com.hamburgcodingschool.design.patterns.e1.composite;

import java.util.ArrayList;
import java.util.List;

public class Task implements Doable {

    private final String description;
    private final List<Doable> doableList = new ArrayList<>();

    public Task(String description) {
        this.description = description;
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
        String indent = new String(new char[indentation]).replace("\0", "\t");
        String checkBox = "[" + (isDone() ? "x" : " ") + "]";
        System.out.println(String.format("%s %s %s", indent, checkBox, description));
        for (Doable doable : doableList) {
            doable.print(indentation + 1);
        }
    }
}
