package ru.geekbrains.lesson2.seminar.factorymethod;

import ru.geekbrains.lesson2.seminar.templatemethod.LogEntry;
import ru.geekbrains.lesson2.seminar.templatemethod.LogReader;

public class TextFileReader extends LogReader {
    @Override
    public Object getDataSource() {
        return null;
    }

    @Override
    public void setDataSource(Object data) {

    }

    @Override
    protected Iterable<String> readEntries(Integer position) {
        return null;
    }

    @Override
    protected LogEntry parseLogEntry(String stringEntry) {
        return null;
    }
}
