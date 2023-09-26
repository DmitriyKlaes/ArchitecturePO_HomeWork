package ru.geekbrains.lesson6.database;

import ru.geekbrains.lesson6.notes.infrastructure.persistance.Database;

public class NotesDatabase implements Database<NotesRecord, Integer> {

    private NotesTable notesTable;

    public NotesTable getNotesTable() {
        if (notesTable == null)
            notesTable = new NotesTable();
        return notesTable;
    }

    public void addNote(NotesRecord note) {
        notesTable.getRecords().add(note);
    }

    public void removeNote(int id) {
        notesTable.getRecords().remove(findNote(id));
    }

    public NotesRecord editNote(NotesRecord notesRecord) {
        removeNote(notesRecord.getId());
        notesTable.getRecords().add(notesRecord);
        return notesRecord;
    }

    @Override
    public NotesRecord findNote(Integer id) {
        return notesTable.getRecords()
                         .stream()
                         .filter(record -> record.getId() == id)
                         .findFirst()
                         .orElseThrow();
    }
}
