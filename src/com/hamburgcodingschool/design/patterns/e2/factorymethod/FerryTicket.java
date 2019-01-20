package com.hamburgcodingschool.design.patterns.e2.factorymethod;

import java.util.Calendar;

public class FerryTicket implements Ticket {

    public static final double PRICE = 2.0;
    public static final String DESCRIPTION = "Ticket for ferry only";
    private final long purchasedAt;

    public FerryTicket() {
        purchasedAt = System.currentTimeMillis();
    }

    @Override
    public boolean isValid() {
        Calendar now = Calendar.getInstance();
        Calendar validityEnds = Calendar.getInstance();
        validityEnds.setTimeInMillis(purchasedAt);
        validityEnds.add(Calendar.HOUR, 4);
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
