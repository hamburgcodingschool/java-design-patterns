package com.hamburgcodingschool.design.patterns.e4.factorymethod.solution;

import com.hamburgcodingschool.design.patterns.e4.factorymethod.VendingMachine;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new TicketVendingMachine();
        vendingMachine.go();
    }
}
