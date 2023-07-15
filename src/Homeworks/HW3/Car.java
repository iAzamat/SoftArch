package Homeworks.HW3;

import java.awt.*;

/**
 * Абстрактный класс автомобиля
 */
abstract class Car {
    private String brand;
    private String model;
    private Color color;
    private BodyType bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TransmissonType transmissionType;
    private float engineVolume;


    /**
     * метод движения автомобиля
     */
    public abstract void carMovement();

    /**
     * метод обслуживания
     */
    public abstract void service();

    /**
     * метод переключения передач
     */
    public abstract void shiftGears(int gear);

    /**
     * метод включения фар
     * 0 - фары выключены
     */
    public abstract void headlightsStatus(int status);

    /**
     * метод включения дворников
     */
    public abstract void wipersStatus(boolean status);

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TransmissonType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissonType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }
}

