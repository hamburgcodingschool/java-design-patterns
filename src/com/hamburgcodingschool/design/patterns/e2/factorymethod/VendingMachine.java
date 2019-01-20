package com.hamburgcodingschool.design.patterns.e2.factorymethod;

public abstract class VendingMachine {

    public abstract void greet();

    public abstract void showSelection();

    protected abstract int getUserSelection();

    public abstract void showInfoForSelection(int selection);

    protected abstract double getUsersMoney();

    public abstract boolean bookTicket(int selection, double money);

    public abstract Ticket vendTicket();

    public abstract double giveBackMoney(int selection, double money, boolean bookingSuccess);

    public void go() {
        greet();
        showSelection();
        int selection = getUserSelection();
        showInfoForSelection(selection);
        double money = getUsersMoney();
        boolean bookingSuccess = bookTicket(selection, money);
        if (bookingSuccess) {
            vendTicket();
        }
        giveBackMoney(selection, money, bookingSuccess);
    }
}
