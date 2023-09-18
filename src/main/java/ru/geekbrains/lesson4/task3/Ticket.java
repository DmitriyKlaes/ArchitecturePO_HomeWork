package ru.geekbrains.lesson4.task3;

import java.time.LocalDateTime;

/**
 * Билет
 */
public class Ticket{

    private int id;

    private int customerId;

    private LocalDateTime date;

    private String qrcode;

    private boolean enable = true;

    public Ticket(int id, int customerId) {
        this.id = id;
        this.customerId = customerId;
        this.date = LocalDateTime.now();
        this.qrcode = String.valueOf(date.getNano());
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getQrcode() {
        return qrcode;
    }

    public boolean isEnable() {
        return enable;
    }
}
