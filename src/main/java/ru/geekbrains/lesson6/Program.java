package ru.geekbrains.lesson6;


import ru.geekbrains.lesson6.database.NotesDatabase;
import ru.geekbrains.lesson6.notes.core.application.ConcreteNoteEditor;
import ru.geekbrains.lesson6.notes.core.domain.Note;
import ru.geekbrains.lesson6.notes.infrastructure.persistance.NotesDbContext;
import ru.geekbrains.lesson6.notes.presentation.queries.controllers.NotesController;
import ru.geekbrains.lesson6.notes.presentation.queries.views.NotesConsolePresenter;
import ru.geekbrains.lesson6.notes.tools.NoteMaker;

public class Program {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        NoteMaker noteMaker = new NoteMaker();

        Note newNote = noteMaker.getNewNote();

        controller.routeGetAll();
        System.out.println();
        controller.routeAddNote(newNote);
        controller.routeGetAll();
        System.out.printf("Запись %d добавлена%n%n", newNote.getId());

        Note note = controller.getNote(newNote.getId());
        note.setDetails("Изменил детали");
        note.setTitle("Изменил заголовок");
        controller.editNote(note);
        controller.routeGetAll();
        System.out.printf("Запись %d изменена%n%n", newNote.getId());

        controller.routeRemoveNote(newNote);
        controller.routeGetAll();
        System.out.printf("Запись %d удалена%n%n", newNote.getId());
    }
}
