package com.hamburgcodingschool.design.patterns.e2.factorymethod;

import java.util.Calendar;

public class DayPassTicket implements Ticket {

    public static final double PRICE = 6.9;
    public static final String DESCRIPTION = "Day pass";
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
        return PRICE;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
