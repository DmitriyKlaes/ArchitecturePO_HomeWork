package ru.geekbrains.lesson4.task3;

/**
 * Автобусная станция
 */
public class BusStation {

    private final TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider) {
        this.ticketProvider = ticketProvider;
    }

    public boolean checkTicket(String qrCode) {
        if (ticketProvider.checkTicket(qrCode)) {
            System.out.println("Билет прошел проверку");
            return true;
        } else {
            System.out.println("Билет уже использован, купите новый");
            return false;
        }
    }
}
