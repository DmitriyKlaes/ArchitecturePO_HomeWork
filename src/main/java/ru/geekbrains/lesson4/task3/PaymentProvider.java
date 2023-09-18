package ru.geekbrains.lesson4.task3;

public class PaymentProvider{

    /**
     * Проверка возможности оплаты
     * @param orderId Номер билета
     * @param card Карта для оплаты
     * @param amount Цена билета
     * @throws RuntimeException исключение при обработке платежной операции
     * @return результат проверки
     */
    public boolean buyTicket(int orderId, PaymentCard card, double amount){
        if (orderId < 1) {
            throw new RuntimeException("Некорректный номер билета");
        }
        if (card == null) {
            throw new RuntimeException("Карта не найдена");
        }
        if (card.getBalance() < amount) {
            throw new RuntimeException("На карте " + card.getCardNo() + " не достаточно денег на счету");
        }

        card.setBalance(card.getBalance() - amount);
        System.out.printf("С карты %s списано %.2f. Текущий баланс: %.2f%n", card.getCardNo(), amount, card.getBalance());

        return true;
    }
}
