package ru.geekbrains.lesson1.store3D.models;

import java.util.List;

public class Scene {

    //TODO: Доработать в рамках ДР

    private static int counter = 1;
    private int id;
    private PoligonalModel models;
    private List<Flash> flashes;
    private List<Camera> cameras;

    {
        id = ++counter;
    }

    public Scene(PoligonalModel models, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public int getId() {
        return id;
    }

    public PoligonalModel getModels() {
        return models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public List<Camera> getCameras() {
        return cameras;
    }

    public Object method1 (Object o) {
        return o;
    }
    public Object method2 (Object o, Object oo) {
        return oo;
    }
}
