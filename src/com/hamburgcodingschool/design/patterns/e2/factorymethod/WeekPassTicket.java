package com.hamburgcodingschool.design.patterns.e2.factorymethod;

import java.util.Calendar;

public class WeekPassTicket implements Ticket {

    public static final double PRICE = 24.5;
    public static final String DESCRIPTION = "Week pass";
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
        return PRICE;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
