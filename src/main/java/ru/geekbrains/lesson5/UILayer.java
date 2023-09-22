package ru.geekbrains.lesson5;

/**
 * Интерфейс UI
 */
public interface UILayer{

    void openProject(String fileName);
    void showProjectSettings();
    void saveProject();
    void printAllModels();
    void printAllTextures();
    void renderAll();
    void renderModel(int i);
    void addNewModel();
    void deleteModel(int modelId);
}