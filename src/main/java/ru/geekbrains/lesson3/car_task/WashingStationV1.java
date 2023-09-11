package ru.geekbrains.lesson3.car_task;

public class WashingStationV1 implements Washing {

    @Override
    public void wash(WashType washType) {
        switch (washType){
            case ECONOMY -> System.out.println("Начинается экономная мойка");
            case REGULAR -> System.out.println("Обычная мойка выполняется");
            case LUXURY -> System.out.println("Мойка люкс стартовала");
        }
    }
}
