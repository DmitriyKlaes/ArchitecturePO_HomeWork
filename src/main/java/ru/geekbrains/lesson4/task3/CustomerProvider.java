package ru.geekbrains.lesson4.task3;

public class CustomerProvider{

    private Database database;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    public Customer getCustomer(String name, String login, String password){
        if (!isFreeLogin(login)) {
            throw new RuntimeException("Логин уже существует");
        }
        if (!isCorrectPassword(password)) {
            throw new RuntimeException("Короткий пароль");
        }

        Customer newCustomer = new Customer(name, login, password);
        this.database.getCustomers().add(newCustomer);
        System.out.printf("Новый клиент с именем %s добавлен%n", name);
        return newCustomer;
    }

    private boolean isFreeLogin (String login) {
        for (Customer customer : database.getCustomers()) {
            if (customer.getName().equals(login)) {
                System.out.printf("Логин %s уже существует%n", login);
                return false;
            }
        }
        System.out.printf("Логин %s прошел проверку на уникальность%n", login);
        return true;
    }

    private boolean isCorrectPassword (String password) {
        return password.length() >= 8;
    }
}
