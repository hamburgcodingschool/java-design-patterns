package com.hamburgcodingschool.design.patterns.e4.visitor;

import java.util.ArrayList;
import java.util.List;

public class FireableVisitor implements Visitor {

    private final List<Employee> fireableEmployees = new ArrayList<>();

    @Override
    public void visit(Employee employee) {
        if (employee.getMonthsEmployed() < 12) {
            fireableEmployees.add(employee);
        }
    }

    public List<Employee> getFireableEmployees() {
        return fireableEmployees;
    }
}
