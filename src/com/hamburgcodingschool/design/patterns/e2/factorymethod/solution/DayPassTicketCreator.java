package com.hamburgcodingschool.design.patterns.e2.factorymethod.solution;

import com.hamburgcodingschool.design.patterns.e2.factorymethod.DayPassTicket;
import com.hamburgcodingschool.design.patterns.e2.factorymethod.Ticket;

public class DayPassTicketCreator extends TicketCreator {
    @Override
    public Ticket createTicket() {
        return new DayPassTicket();
    }

    @Override
    public String getTicketDescription() {
        return DayPassTicket.DESCRIPTION;
    }

    @Override
    public double getTicketPrice() {
        return DayPassTicket.PRICE;
    }
}
