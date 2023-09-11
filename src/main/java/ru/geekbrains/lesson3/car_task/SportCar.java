package ru.geekbrains.lesson3.car_task;

import java.awt.*;

public class SportCar extends Car implements Fueleble, Wiping, Washible {

    public SportCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
        setType(CarType.SPORT);
        setFuelType(FuelType.GASOLINE);
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(getFuelType());
            System.out.printf("Спорткар заправлен! Тип топлива: %s%n", getFuelType());
        }
    }

    /**
     * Помыть автомобиль
     */
    @Override
    public void wash(WashType washType) {
        if (washing != null){
            washing.wash(washType);
            System.out.printf("Спорткар помыт! Тип пойки: %s%n", washType);
        }
    }

    @Override
    public void movement() {
        System.out.println("Спорткар едет, виииаауууу");
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
