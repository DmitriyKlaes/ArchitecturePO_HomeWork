package ru.geekbrains.lesson4.task3;

public class Core {

    private final Database database;
    private final CustomerProvider customerProvider;
    private final PaymentProvider paymentProvider;
    private final TicketProvider ticketProvider;

    public Core(){
        database = new Database();
        customerProvider = new CustomerProvider(database);
        paymentProvider = new PaymentProvider();
        ticketProvider = new TicketProvider(database, paymentProvider);
    }

    public Database getDatabase() {
        return database;
    }

    public CustomerProvider getCustomerProvider() {
        return customerProvider;
    }

    public PaymentProvider getPaymentProvider() {
        return paymentProvider;
    }

    public TicketProvider getTicketProvider() {
        return ticketProvider;
    }

}