package ru.geekbrains.lesson6.notes.tools;

import ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.Date;
import java.util.Random;

public class NoteMaker {

    public Note getNewNote() {
        Random rnd = new Random();
        int randomNumber = 15 + rnd.nextInt(1000);
        return new Note(randomNumber, randomNumber, "NEW NOTE #" + randomNumber, "NEW DETAILS#" + randomNumber, new Date());
    }

}
