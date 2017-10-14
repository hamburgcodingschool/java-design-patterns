package com.hamburgcodingschool.design.patterns.e1.flyweight;

import com.hamburgcodingschool.design.patterns.e1.composite.Doable;

public class ToDo implements Doable {

    private final String description;
    private boolean done;

    public ToDo(String description) {
        this.description = description;
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
        System.out.println(String.format("%s %s %s", indent, checkBox, description));
    }
}
