package com.hamburgcodingschool.design.patterns.e4.factorymethod.solution;

import com.hamburgcodingschool.design.patterns.e4.factorymethod.Ticket;
import com.hamburgcodingschool.design.patterns.e4.factorymethod.WeekPassTicket;

public class WeekPassTicketCreator extends TicketCreator {
    @Override
    public Ticket createTicket() {
        return new WeekPassTicket();
    }

    @Override
    public double getTicketPrice() {
        return WeekPassTicket.PRICE;
    }

    @Override
    public String getTicketDescription() {
        return WeekPassTicket.DESCRIPTION;
    }
}
