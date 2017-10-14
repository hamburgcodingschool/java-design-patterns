package com.hamburgcodingschool.design.patterns.e1.composite;

public interface Doable {

    void done();

    void undo();

    boolean isDone();

    void print(int indentation);
}
