package ru.geekbrains.lesson4.task3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * База данных
 */
public class Database{

    private static int counter = 0;
    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public Database() {
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    /**
     * Получить актуальную стоимость билета
     * @return int стоимость билета
     */
    public double getTicketAmount(){
        return 45;
    }

    /**
     * Получить идентификатор заявки на покупку билета
     * @return int возвращает номер заказа
     */
    public int createTicketOrder(){
        int orderNumber = ++counter;
        System.out.printf("Создан заказ №%d%n", orderNumber);
        return orderNumber;
    }
}
