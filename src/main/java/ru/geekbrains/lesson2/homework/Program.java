package ru.geekbrains.lesson2.homework;

public class Program {
    public static void main(String[] args) {
        DatabaseHandler dh1 = DatabaseHandler.getInstance();
        dh1.setField("Доступ к базе только один!");
        System.out.println(dh1.getField());

        DatabaseHandler dh2 = DatabaseHandler.getInstance();
        System.out.println(dh2.getField());
    }
}
