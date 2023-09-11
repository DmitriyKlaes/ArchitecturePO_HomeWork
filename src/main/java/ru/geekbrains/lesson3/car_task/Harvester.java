package ru.geekbrains.lesson3.car_task;

import java.awt.*;

public class Harvester extends Car implements Fueleble, Wiping, Washible {

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
        setType(CarType.SERVICE);
        setFuelType(FuelType.DIESEL);

    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(getFuelType());
            System.out.printf("Уборщик заправлен! Тип топлива: %s%n", getFuelType());
        }
    }

    /**
     * Помыть автомобиль
     */
    @Override
    public void wash(WashType washType) {
        if (washing != null){
            washing.wash(washType);
            System.out.printf("Уборщик помыт! Тип пойки: %s%n", washType);
        }
    }

    @Override
    public void movement() {
        System.out.println("Уборщик едет, врум-врум");
    }

    @Override
    public void maintenance() {

    }
    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

    @Override
    public void wipMirrors() {
    }
    @Override
    public void wipWindshield() {
    }
    @Override
    public void wipHeadlights() {
    }
}
