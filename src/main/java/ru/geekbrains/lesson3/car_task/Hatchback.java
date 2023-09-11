package ru.geekbrains.lesson3.car_task;

import java.awt.*;

public class Hatchback extends Car implements Fueleble, Wiping, Washible {

    public Hatchback(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
        setType(CarType.HATCHBACK);
        setFuelType(FuelType.GASOLINE);
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(getFuelType());
            System.out.printf("Хетчбек заправлен! Тип топлива: %s%n", getFuelType());
        }
    }

    /**
     * Помыть автомобиль
     */
    @Override
    public void wash(WashType washType) {
        if (washing != null){
            washing.wash(washType);
            System.out.printf("Хетчбек помыт! Тип пойки: %s%n", washType);
        }
    }

    @Override
    public void movement() {
        System.out.println("Хетчбек едет, вжжжжжжрржжжж");
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
