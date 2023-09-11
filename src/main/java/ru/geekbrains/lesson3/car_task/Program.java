package ru.geekbrains.lesson3.car_task;

import java.awt.*;

public class Program {

    /**
     * 1. Спроектировать абстрактный класс «Car» у которого должны
     *  быть свойства: марка, модель, цвет, тип кузова, число колёс, тип
     *  топлива, тип коробки передач, объём двигателя; методы:
     *  движение, обслуживание, переключение передач, включение
     *  фар, включение дворников.
     *
     * 2. Создать конкретный автомобиль путём наследования класса
     *  «Car».
     * 3. Расширить абстрактный класс «Car», добавить метод: подметать
     * улицу. Создать конкретный автомобиль путём наследования
     * класса «Car». Провести проверку принципа SRP.
     *
     * 4. Расширить абстрактный класс «Car», добавить метод:
     * включение противотуманных фар, перевозка груза. Провести
     * проверку принципа OCP.
     *
     * 5. Создать конкретный автомобиль путём наследования класса
     * «Car», определить число колёс = 3. Провести проверку принципа LSP.
     *
     * 6. Создать конкретный автомобиль путём наследования класса
     * «Car», определить метод «движение» - «полёт». Провести
     * проверку принципа LSP.
     *
     * 7. Создать интерфейс «Заправочная станция», создать метод:
     * заправка топливом.
     *
     *
     * 8. Имплементировать метод интерфейса «Заправочная станция» в
     * конкретный класс «Car».
     *
     * 9. Добавить в интерфейс «Заправочная станция» методы: протирка
     * лобового стекла, протирка фар, протирка зеркал.
     *
     * 10. Имплементировать все методы интерфейса «Заправочная
     * станция» в конкретный класс «Car». Провести проверку
     * принципа ISP. Создать дополнительный/е интерфейсы и
     * имплементировать их в конкретный класс «Car». Провести
     * проверку принципа ISP.
     *
     * 11. Создать путём наследования класса «Car» два
     * автомобиля: с бензиновым и дизельным двигателями,
     * имплементировать метод «Заправка топливом» интерфейса
     * «Заправочная станция». Реализовать заправку каждого
     * автомобиля подходящим топливом. Провести проверку принципа DIP.
     *
     * @param args
     */
    public static void main(String[] args) {

        Harvester harvester = new Harvester("Gazel", "12512", Color.BLACK);
        SportCar sportCar = new SportCar("Mersedes", "GLS", Color.BLUE);
        Hatchback hatchback = new Hatchback("Chevrolet", "Hatchback", Color.GREEN);

        RefuelingStationV1 refuelingStation1 = new RefuelingStationV1();
        RefuelingStationV2 refuelingStation2 = new RefuelingStationV2();

        WashingStationV1 washingStationV1 = new WashingStationV1();
        WashingStationV2 washingStationV2 = new WashingStationV2();

        harvester.movement();
        sportCar.movement();
        hatchback.movement();

        harvester.setRefuelingStation(refuelingStation2);
        harvester.fuel();
        sportCar.setRefuelingStation(refuelingStation1);
        sportCar.fuel();
        hatchback.setRefuelingStation(refuelingStation2);
        hatchback.fuel();

        harvester.movement();
        sportCar.movement();
        hatchback.movement();

        harvester.setWashing(washingStationV2);
        harvester.wash(WashType.ECONOMY);
        sportCar.setWashing(washingStationV1);
        sportCar.wash(WashType.LUXURY);
        hatchback.setWashing(washingStationV2);
        hatchback.wash(WashType.REGULAR);

        harvester.movement();
        sportCar.movement();
        hatchback.movement();

    }

    public static double calculateMaintenance(Car car){
        if (car.getWheelsCount() == 6){
            return 1500*6;
        }
        else {
            return 1000*4;
        }
    }

}
