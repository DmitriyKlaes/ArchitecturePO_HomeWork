package ru.geekbrains.lesson4.task3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Мобильное приложение
 */
public class MobileApp{

    private final Customer customer;
    private final Collection<PaymentCard> paymentCards = new ArrayList<>();
    private final TicketProvider ticketProvider;
    private final CustomerProvider customerProvider;

    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider) {
        this.ticketProvider = ticketProvider;
        this.customerProvider = customerProvider;
        customer = this.customerProvider.getCustomer("Dima", "<login>", "<password>");

    }

    public Collection<Ticket> getTickets(){
        return customer.getTickets();
    }

    public void searchTicket(){
        customer.setTickets(ticketProvider.searchTicket(customer.getId()));
    }

    public boolean buyTicket(PaymentCard card){
        return ticketProvider.buyTicket(customer.getId(), card);
    }

    public Collection<PaymentCard> getPaymentCards() {
        return paymentCards;
    }
}