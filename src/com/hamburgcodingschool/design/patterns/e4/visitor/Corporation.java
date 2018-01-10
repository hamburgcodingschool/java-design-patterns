package com.hamburgcodingschool.design.patterns.e4.visitor;

import java.util.ArrayList;
import java.util.List;

public class Corporation implements Corporate {

    private final List<Corporate> corporateList = new ArrayList<>();
    private final String name;

    public Corporation(String name) {
        this.name = name;
    }

    public void add(Corporate corporate) {
        corporateList.add(corporate);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(String.format("Corporation: %s", getName()));
        for (Corporate corporate : corporateList) {
            corporate.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        for (Corporate corporate : corporateList) {
            corporate.accept(visitor);
        }
    }
}
