package ru.geekbrains.lesson6.notes.infrastructure.persistance;

import ru.geekbrains.lesson6.database.NotesRecord;

public interface NoteDatabase extends Database<NotesRecord, Integer> {
    NotesRecord findNote(Integer id);
}
