package com.hamburgcodingschool.design.patterns.e2.factorymethod;

import java.util.Scanner;

public class TicketVendingMachine extends VendingMachine {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void greet() {
        System.out.println("Welcome to Hamburg! You can buy your tickets here for bus, train and ferry.");
    }

    @Override
    public void showSelection() {
        System.out.println("You can choose between these options:");
        System.out.println("[1] Short trip ticket (train, bus, or ferry): € 2.00");
        System.out.println("[2] Ticket for bus only: € 1.90");
        System.out.println("[3] Ticket for ferry only: € 2.00");
        System.out.println("[4] Day pass: € 6.90");
        System.out.println("[5] Week pass: € 24.50");
    }

    @Override
    protected int getUserSelection() {
        System.out.println("Please specify your choice and type a number (1-5):");
        String userInput = scanner.nextLine();
        return Integer.valueOf(userInput);
    }

    @Override
    public void showInfoForSelection(int selection) {
        System.out.print("Your selection was: [" + selection + "] ");
        switch (selection) {
            case 1:
                System.out.println("Short trip ticket");
                System.out.println("Please pay € 2.00.");
                break;
            case 2:
                System.out.println("Ticket for bus only");
                System.out.println("Please pay € 1.90.");
                break;
            case 3:
                System.out.println("Ticket for ferry only");
                System.out.println("Please pay € 2.00.");
                break;
            case 4:
                System.out.println("Day pass");
                System.out.println("Please pay € 6.90.");
                break;
            case 5:
                System.out.println("Week pass");
                System.out.println("Please pay € 24.50.");
                break;
        }
    }

    @Override
    protected double getUsersMoney() {
        System.out.println("Please insert coins here:");
        String userInput = scanner.nextLine();
        return Double.valueOf(userInput);
    }

    @Override
    public boolean bookTicket(int selection, double money) {
        System.out.println("You payed € " + money + ".");
        boolean isEnough = false;
        switch (selection) {
            case 1:
                isEnough = isEnough(money, ShortTripTicket.PRICE);
                break;
            case 2:
                isEnough = isEnough(money, BusTicket.PRICE);
                break;
            case 3:
                isEnough = isEnough(money, FerryTicket.PRICE);
                break;
            case 4:
                isEnough = isEnough(money, DayPassTicket.PRICE);
                break;
            case 5:
                isEnough = isEnough(money, WeekPassTicket.PRICE);
                break;
        }
        if (isEnough) {
            System.out.println("Thank you! Please wait, your ticket will be printed now.");
        } else {
            System.out.println("Sorry, this was not enough.");
        }
        return isEnough;
    }

    private boolean isEnough(double moneyPayed, double price) {
        return moneyPayed >= price;
    }

    @Override
    public Ticket vendTicket() {
        // TODO create your ticket here
        return null;
    }

    @Override
    public double giveBackMoney(int selection, double payed, boolean bookingSuccess) {
        double moneyBack;
        if (!bookingSuccess) {
            moneyBack = payed;
        } else {
            switch (selection) {
                case 1:
                    moneyBack = payed - ShortTripTicket.PRICE;
                    break;
                case 2:
                    moneyBack = payed - BusTicket.PRICE;
                    break;
                case 3:
                    moneyBack = payed - FerryTicket.PRICE;
                    break;
                case 4:
                    moneyBack = payed - DayPassTicket.PRICE;
                    break;
                case 5:
                    moneyBack = payed - WeekPassTicket.PRICE;
                    break;
                default:
                    System.err.println("Something went wrong... Please contact technical support.");
                    moneyBack = 0.0;
                    break;
            }
        }
        scanner.close();
        System.out.println("Here is your money back: € " + moneyBack);
        return moneyBack;
    }
}
