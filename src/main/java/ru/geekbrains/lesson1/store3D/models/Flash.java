package ru.geekbrains.lesson1.store3D.models;

public class Flash extends Tool {

    //TODO: Доработать в рамках ДР
    private Color color;
    private float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        super(location, angle);
        this.color = color;
        this.power = power;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    @Override
    public void rotate(Angle3D angle) {

    }

    @Override
    public void move(Point3D angle) {

    }
}
