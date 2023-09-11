package ru.geekbrains.lesson3.car_task;

import java.awt.*;

public abstract class Car {

    //region Constructors

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    //endregion

    //region Public Methods

    // Движение
    public abstract void movement();
    // Обслуживание
    public abstract void maintenance();
    // Переключение передач
    public abstract boolean gearShifting();
    // Включение фар
    public abstract boolean switchHeadlights();
    // Включение дворников
    public abstract boolean switchWipers();

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setWashing(Washing washingStation) {
        this.washing = washingStation;
    }


    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    protected void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    public CarType getType() {
        return type;
    }

    protected void setType(CarType type) {
        this.type = type;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    protected void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    //endregion

    //region Private Fields

    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Цвет
    private Color color;

    // Тип
    private CarType type;

    // Число колес
    private int wheelsCount;

    // Тип топлива
    private FuelType fuelType;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;

    // Состояние противотуманных фар
    private boolean fogLights = false;

    //endregion


    //region Protected Fields

    // Заправочная станция
    protected Refueling refueling;

    // Автомойка
    protected Washing washing;

    //endregion



}
