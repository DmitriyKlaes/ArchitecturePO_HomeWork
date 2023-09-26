package ru.geekbrains.lesson6.database;

import java.util.Date;

public class NotesRecord {

    public NotesRecord(int id, String title, String details) {
        this.id = id;
        this.title = title;
        this.details = details;
        creationDate = new Date();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    private int id;
    private int userId;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;

}
