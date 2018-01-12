package com.hamburgcodingschool.design.patterns.e4.factorymethod.solution;

import com.hamburgcodingschool.design.patterns.e4.factorymethod.*;

import java.util.Scanner;

public class TicketVendingMachine extends VendingMachine {

    private final Scanner scanner = new Scanner(System.in);
    private TicketCreator ticketCreator;

    @Override
    public void greet() {
        System.out.println("Welcome to Hamburg! You can buy your tickets here for bus, train and ferry.");
    }

    @Override
    public void showSelection() {
        System.out.println("You can choose between these options:");
        System.out.println("[1] Short trip ticket (train, bus, or ferry): " + formatPrice(ShortTripTicket.PRICE));
        System.out.println("[2] Ticket for bus only: " + formatPrice(BusTicket.PRICE));
        System.out.println("[3] Ticket for ferry only: " + formatPrice(FerryTicket.PRICE));
        System.out.println("[4] Day pass: " + formatPrice(DayPassTicket.PRICE));
        System.out.println("[5] Week pass: " + formatPrice(WeekPassTicket.PRICE));
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
                ticketCreator = new ShortTripTicketCreator();
                break;
            case 2:
                ticketCreator = new BusTicketCreator();
                break;
            case 3:
                ticketCreator = new FerryTicketCreator();
                break;
            case 4:
                ticketCreator = new DayPassTicketCreator();
                break;
            case 5:
                ticketCreator = new WeekPassTicketCreator();
                break;
        }
        System.out.println(ticketCreator.getTicketDescription());
        System.out.println("Please pay " + formatPrice(ticketCreator.getTicketPrice()) + ".");
    }

    @Override
    protected double getUsersMoney() {
        System.out.println("Please insert coins here:");
        String userInput = scanner.nextLine();
        return Double.valueOf(userInput);
    }

    @Override
    public boolean bookTicket(int selection, double money) {
        System.out.println("You payed € " + formatPrice(money) + ".");
        if (money >= ticketCreator.getTicketPrice()) {
            System.out.println("Thank you! Please wait, your ticket will be printed now.");
            return true;
        } else {
            System.out.println("Sorry, this was not enough.");
            return false;
        }
    }

    @Override
    public Ticket vendTicket() {
        return ticketCreator.createTicket();
    }

    @Override
    public double giveBackMoney(int selection, double payed, boolean bookingSuccess) {
        double moneyBack;
        if (!bookingSuccess) {
            moneyBack = payed;
        } else {
            moneyBack = payed - ticketCreator.getTicketPrice();
        }
        scanner.close();
        System.out.println("Here is your money back: € " + formatPrice(moneyBack));
        return moneyBack;
    }

    private String formatPrice(double price) {
        return String.format("€ %.2f", price);
    }
}
