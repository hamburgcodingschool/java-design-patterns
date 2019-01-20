package com.hamburgcodingschool.design.patterns.e2.factorymethod.solution;

import com.hamburgcodingschool.design.patterns.e2.factorymethod.VendingMachine;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new TicketVendingMachine();
        vendingMachine.go();
    }
}
