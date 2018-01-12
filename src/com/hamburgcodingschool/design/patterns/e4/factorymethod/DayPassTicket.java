package com.hamburgcodingschool.design.patterns.e4.factorymethod;

import java.util.Calendar;

public class DayPassTicket implements Ticket {

    private final long purchasedAt;

    public DayPassTicket() {
        purchasedAt = System.currentTimeMillis();
    }

    @Override
    public boolean isValid() {
        Calendar now = Calendar.getInstance();
        Calendar validityEnds = Calendar.getInstance();
        validityEnds.setTimeInMillis(purchasedAt);
        validityEnds.add(Calendar.DATE, 1);
        return now.before(validityEnds);
    }

    @Override
    public double getPrice() {
        return 6.9;
    }
}
