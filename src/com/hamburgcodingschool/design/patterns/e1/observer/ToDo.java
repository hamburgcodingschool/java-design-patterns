package com.hamburgcodingschool.design.patterns.e1.observer;

import com.hamburgcodingschool.design.patterns.e1.flyweight.PrefixPool;

public class ToDo implements Doable, DoneObserver {

    private final String description;
    private boolean done;
    private int index;

    public ToDo(String description) {
        this.description = description;
    }

    @Override
    public int setIndex(int index) {
        this.index = index;
        return index + 1;
    }

    @Override
    public void done() {
        done = true;
    }

    @Override
    public void undo() {
        done = false;
    }

    @Override
    public boolean isDone() {
        return done;
    }

    @Override
    public void print(int indentation) {
        String indent = PrefixPool.getIndent(indentation);
        String checkBox = PrefixPool.getCheckBox(isDone());
        System.out.println(String.format("%d%s %s %s", index, indent, checkBox, description));
    }

    @Override
    public void notifyDone(int index) {
        if (this.index == index) {
            done();
        }
    }
}
