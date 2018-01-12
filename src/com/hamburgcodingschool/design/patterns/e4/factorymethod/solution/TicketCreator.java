package com.hamburgcodingschool.design.patterns.e4.factorymethod.solution;

import com.hamburgcodingschool.design.patterns.e4.factorymethod.Ticket;

public abstract class TicketCreator {

    public abstract Ticket createTicket();

    public abstract String getTicketDescription();

    public abstract double getTicketPrice();
}
