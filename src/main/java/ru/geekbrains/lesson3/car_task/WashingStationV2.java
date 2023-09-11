package ru.geekbrains.lesson3.car_task;

public class WashingStationV2 implements Washing {
    @Override
    public void wash(WashType washType) {
        switch (washType){
            case ECONOMY -> System.out.println("Выполнена экономная мойка");
            case REGULAR -> System.out.println("Обычная мойка выполнена");
            case LUXURY -> System.out.println("Мойка люкс завершена. Ваша машина сверкает!");
        }
    }
}
