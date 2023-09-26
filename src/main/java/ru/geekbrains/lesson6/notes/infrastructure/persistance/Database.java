package ru.geekbrains.lesson6.notes.infrastructure.persistance;

public interface Database<T, Tid> {
    T findNote(Tid id);
}
