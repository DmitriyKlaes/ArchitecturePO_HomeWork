package ru.geekbrains.lesson1.store3D;

import ru.geekbrains.lesson1.store3D.inmemory.ModelStore;
import ru.geekbrains.lesson1.store3D.inmemory.Observer1;
import ru.geekbrains.lesson1.store3D.inmemory.Observer2;
import ru.geekbrains.lesson1.store3D.models.*;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);
        store.RegisterModelChanger(observer2);

        Poligon p1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(p1);
        PoligonalModel poligonalModel = new PoligonalModel(poligons);
        store.addModel(poligonalModel);


        Point3D pointFlash = new Point3D(3.15, 4.12, 0.5);
        Angle3D angleFlash = new Angle3D(4.15, 5.12, 1.5);
        Point3D pointCamera = new Point3D(13.15, 2.12, 8.3);
        Angle3D angleCamera = new Angle3D(4.15, 5.12, 1.3);
        Color color = new Color(255, 255, 255);
        Flash flash = new Flash(pointFlash, angleFlash, color, 3.5f);
        store.addFlash(flash);

        Camera camera = new Camera(pointCamera, angleCamera);
        store.addCamera(camera);

        List<Flash> flashes = new ArrayList<>();
        flashes.add(flash);
        List<Camera> cameras = new ArrayList<>();
        cameras.add(camera);

        Scene scene = new Scene(poligonalModel, flashes, cameras);
        store.addScene(scene);
    }

}
