package com.hamburgcodingschool.design.patterns.e2.factorymethod;

public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new TicketVendingMachine();
        vendingMachine.go();
    }
}
