package com.hamburgcodingschool.design.patterns.e2.factorymethod.solution;

import com.hamburgcodingschool.design.patterns.e2.factorymethod.BusTicket;
import com.hamburgcodingschool.design.patterns.e2.factorymethod.Ticket;

public class BusTicketCreator extends TicketCreator {
    @Override
    public Ticket createTicket() {
        return new BusTicket();
    }

    @Override
    public double getTicketPrice() {
        return BusTicket.PRICE;
    }

    @Override
    public String getTicketDescription() {
        return BusTicket.DESCRIPTION;
    }
}
