package ru.geekbrains.lesson6.notes.core.application.interfaces;

import java.util.Collection;
import java.util.Optional;

public interface Editor<T, TId> {

    boolean add(T item);

    T edit(T item);

    boolean remove(T item);

    Optional<T> getById(TId id);

    Collection<T> getAll();
}
