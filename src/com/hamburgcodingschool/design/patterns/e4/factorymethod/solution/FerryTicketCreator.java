package com.hamburgcodingschool.design.patterns.e4.factorymethod.solution;

import com.hamburgcodingschool.design.patterns.e4.factorymethod.FerryTicket;
import com.hamburgcodingschool.design.patterns.e4.factorymethod.Ticket;

public class FerryTicketCreator extends TicketCreator {
    @Override
    public Ticket createTicket() {
        return new FerryTicket();
    }

    @Override
    public double getTicketPrice() {
        return FerryTicket.PRICE;
    }

    @Override
    public String getTicketDescription() {
        return FerryTicket.DESCRIPTION;
    }
}
