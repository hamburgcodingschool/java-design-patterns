package com.hamburgcodingschool.design.patterns.e4.visitor;

public interface Corporate {

    String getName();

    void print();

    void accept(Visitor visitor);
}
