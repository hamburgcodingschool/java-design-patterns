package com.hamburgcodingschool.design.patterns.e4.factorymethod.solution;

import com.hamburgcodingschool.design.patterns.e4.factorymethod.BusTicket;
import com.hamburgcodingschool.design.patterns.e4.factorymethod.Ticket;

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
