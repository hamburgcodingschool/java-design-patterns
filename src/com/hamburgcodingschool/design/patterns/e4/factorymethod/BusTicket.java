package com.hamburgcodingschool.design.patterns.e4.factorymethod;

import java.util.Calendar;

public class BusTicket implements Ticket {

    private final long purchasedAt;

    public BusTicket() {
        purchasedAt = System.currentTimeMillis();
    }

    @Override
    public boolean isValid() {
        Calendar now = Calendar.getInstance();
        Calendar validityEnds = Calendar.getInstance();
        validityEnds.setTimeInMillis(purchasedAt);
        validityEnds.add(Calendar.HOUR, 2);
        return now.before(validityEnds);
    }

    @Override
    public double getPrice() {
        return 1.9;
    }
}
