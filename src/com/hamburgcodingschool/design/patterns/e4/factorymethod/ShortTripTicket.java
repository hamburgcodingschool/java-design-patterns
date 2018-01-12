package com.hamburgcodingschool.design.patterns.e4.factorymethod;

import java.util.Calendar;

public class ShortTripTicket implements Ticket {

    private final long purchasedAt;

    public ShortTripTicket() {
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
        return 2.9;
    }
}
