package ru.geekbrains.lesson6.notes.infrastructure.persistance;

import ru.geekbrains.lesson6.database.NotesRecord;

public abstract class DbContext {

    protected NoteDatabase database;

    public DbContext(NoteDatabase database) {
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    public boolean saveChanges(){
        //TODO: Сохранение изменений в БД
        return true;
    }
}

class ModelBuilder {

    public ModelBuilder applyConfiguration(ModelConfiguration configuration){
        //TODO: добавление конфигурации маппинга объекта некоторого типа к структуре таблицы БД
        return this;
    }

}
