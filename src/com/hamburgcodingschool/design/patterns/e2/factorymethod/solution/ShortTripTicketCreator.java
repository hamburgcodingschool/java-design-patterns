package com.hamburgcodingschool.design.patterns.e2.factorymethod.solution;

import com.hamburgcodingschool.design.patterns.e2.factorymethod.ShortTripTicket;
import com.hamburgcodingschool.design.patterns.e2.factorymethod.Ticket;

public class ShortTripTicketCreator extends TicketCreator {
    @Override
    public Ticket createTicket() {
        return new ShortTripTicket();
    }

    @Override
    public String getTicketDescription() {
        return ShortTripTicket.DESCRIPTION;
    }

    @Override
    public double getTicketPrice() {
        return ShortTripTicket.PRICE;
    }
}
