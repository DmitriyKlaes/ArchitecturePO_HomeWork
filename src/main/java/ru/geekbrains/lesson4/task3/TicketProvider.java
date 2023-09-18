package ru.geekbrains.lesson4.task3;

import java.util.ArrayList;
import java.util.Collection;

public class TicketProvider{

    private final Database database;
    private final PaymentProvider paymentProvider;

    public TicketProvider(Database database, PaymentProvider paymentProvider){
        this.database = database;
        this.paymentProvider = paymentProvider;
    }

    public Collection<Ticket> searchTicket(int clientId){
        Collection<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket: database.getTickets()) {
            if (ticket.getCustomerId() == clientId && ticket.isEnable()) {
                tickets.add(ticket);
                System.out.printf("Билет №%d добавлен в базу%n", ticket.getId());
            }
        }
        return tickets;
    }

    public boolean buyTicket(int clientId, PaymentCard card){
        int orderId = database.createTicketOrder();
        double amount = database.getTicketAmount();
        if (paymentProvider.buyTicket(orderId, card, amount)) {
            Ticket newTicket = new Ticket(orderId, clientId);
            this.database.getTickets().add(newTicket);
            System.out.printf("Куплен билет №%d, дата покупки: %s%n", newTicket.getId(), newTicket.getDate());
            return true;
        }
        System.out.println("Покупка билета не удалась");
        return false;
    }

    public boolean checkTicket(String qrcode){
        for (Ticket ticket: database.getTickets()) {
            if (ticket.getQrcode().equals(qrcode)){
                ticket.setEnable(false);
                System.out.printf("Билет с кодом %s испльзован и больше не активен%n", ticket.getQrcode());
                // Save database ...
                return true;
            }
        }
        System.out.println("Билет не найден");
        return false;
    }
}
