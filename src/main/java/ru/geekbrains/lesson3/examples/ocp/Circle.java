package ru.geekbrains.lesson3.examples.ocp;

public class Circle implements Shape{

    private final int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}
