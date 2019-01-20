package com.hamburgcodingschool.design.patterns.e2.factorymethod;

import java.util.Calendar;

public class ShortTripTicket implements Ticket {

    public static final double PRICE = 2.9;
    public static final String DESCRIPTION = "Short trip ticket";
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
        return PRICE;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
