package com.hamburgcodingschool.design.patterns.e4.factorymethod;

import java.util.Calendar;

public class WeekPassTicket implements Ticket {

    private final long purchasedAt;

    public WeekPassTicket() {
        purchasedAt = System.currentTimeMillis();
    }

    @Override
    public boolean isValid() {
        Calendar now = Calendar.getInstance();
        Calendar validityEnds = Calendar.getInstance();
        validityEnds.setTimeInMillis(purchasedAt);
        validityEnds.add(Calendar.DATE, 7);
        return now.before(validityEnds);
    }

    @Override
    public double getPrice() {
        return 24.5;
    }
}
