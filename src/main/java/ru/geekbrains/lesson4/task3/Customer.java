package ru.geekbrains.lesson4.task3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Покупатель
 */
public class Customer{

    private static int counter = 0;

    private final int id;

    private final String name;

    private Collection<Ticket> tickets = new ArrayList<>();

    {
        id = ++counter;
    }
    public Customer(String name, String login, String password) {
        this.name = name;
    }


    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}