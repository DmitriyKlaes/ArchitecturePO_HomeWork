package ru.geekbrains.lesson4.task3;

public class PaymentCard {
    private static int lastNo = 4444;
    private String cardNo;
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
        this.cardNo = "1111 2222 3333 " + lastNo++;
    }

    public String getCardNo() {
        return cardNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
