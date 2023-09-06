package ru.geekbrains.lesson1.store3D.models;

public abstract class Tool implements Movable {
    private Point3D location;
    private Angle3D angle;

    public Tool(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }
}
