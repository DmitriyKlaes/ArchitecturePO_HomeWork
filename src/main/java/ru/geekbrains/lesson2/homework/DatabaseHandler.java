package ru.geekbrains.lesson2.homework;

public class DatabaseHandler {
    private String field;
    private DatabaseHandler() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    private static class DatabaseHandlerHolder {
        public static DatabaseHandler databaseHandlerInstance = new DatabaseHandler();
    }

    public static DatabaseHandler getInstance() {
        return DatabaseHandlerHolder.databaseHandlerInstance;
    }
}
