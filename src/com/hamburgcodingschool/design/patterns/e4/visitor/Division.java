package com.hamburgcodingschool.design.patterns.e4.visitor;

import java.util.ArrayList;
import java.util.List;

public class Division implements Corporate {

    private final List<Corporate> corporateList = new ArrayList<>();
    private final String name;

    public Division(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(String.format("Division: %s", getName()));
        for (Corporate corporate : corporateList) {
            corporate.print();
        }
    }

    public void addCorporate(Corporate corporate) {
        corporateList.add(corporate);
    }

    @Override
    public void accept(Visitor visitor) {
        for (Corporate corporate : corporateList) {
            corporate.accept(visitor);
        }
    }
}
