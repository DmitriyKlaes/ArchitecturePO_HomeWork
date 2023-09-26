package ru.geekbrains.lesson6.notes.core.application;

import ru.geekbrains.lesson6.notes.core.application.interfaces.NoteEditor;
import ru.geekbrains.lesson6.notes.core.application.interfaces.NotesDatabaseContext;
import ru.geekbrains.lesson6.notes.core.application.interfaces.NotesPresenter;
import ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NotesDatabaseContext dbContext;
    private final NotesPresenter notesPresenter;

    public ConcreteNoteEditor(NotesDatabaseContext dbContext,
                              NotesPresenter notesPresenter) {
        this.dbContext = dbContext;
        this.notesPresenter = notesPresenter;
    }

    @Override
    public boolean add(Note item) {
<<<<<<< HEAD
        dbContext.add(item);
>>>>>>> origin/lesson6
        return dbContext.saveChanges();
    }

    @Override
    public Note edit(Note item) {
        if (item == null)
            throw new RuntimeException("Ссылка отсутствует");
        Optional<Note> note = getById(item.getId());
        if (note.isEmpty())
            throw new RuntimeException("Заметка пустая");
        note.get().setTitle(item.getTitle());
        note.get().setDetails(item.getDetails());
        note.get().setEditDate(new Date());
        dbContext.saveChanges();
        return dbContext.edit(note.get());
    }

    @Override
    public boolean remove(Note item) {
<<<<<<< HEAD
        dbContext.remove(item);
=======
        dbContext.getAll().remove(item);
>>>>>>> origin/lesson6
        return dbContext.saveChanges();
    }

    @Override
    public Optional<Note> getById(Integer id) {
        return dbContext.getAll().stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }

    @Override
    public void printAll() {
        notesPresenter.printAll(getAll());
    }
}
