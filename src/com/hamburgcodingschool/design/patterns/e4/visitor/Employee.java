package com.hamburgcodingschool.design.patterns.e4.visitor;

public class Employee implements Corporate {

    private final String name;
    private final String job;
    private final int monthsEmployed;

    public Employee(String name, String job, int monthsEmployed) {
        this.name = name;
        this.job = job;
        this.monthsEmployed = monthsEmployed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(String.format("Employee: %s, %s", getName(), getJob()));
    }

    public String getJob() {
        return job;
    }

    public int getMonthsEmployed() {
        return monthsEmployed;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
