package Homeworks.HW3;

import java.awt.*;

/**
 * Конкретный автомобиль
 */
public class ConcreteCar extends Car implements IGasStation {
    String brand;
    String model;
    Color color;
    BodyType bodyType;
    int numberWheels;
    TypeFuel fuelType;
    TransmissonType transmissionType;
    float engineVolume;

    /**
     * Конструтор конкретного автомобиля
     *
     * @param brand
     * @param model
     * @param color
     * @param bodyType
     * @param numberWheels
     * @param fuelType
     * @param transmissionType
     * @param engineVolume
     */
    public ConcreteCar(String brand,
                       String model,
                       Color color,
                       BodyType bodyType,
                       int numberWheels,
                       TypeFuel fuelType,
                       TransmissonType transmissionType,
                       float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineVolume = engineVolume;
    }

    /**
     * метод движения автомобиля
     */
    public void carMovement() {
        System.out.println("Автомобиль движется");
    }

    /**
     * метод обслуживания
     */
    public void service() {
        System.out.println("Автомобиль на обслуживании");
    }

    ;

    /**
     * метод переключения передач
     */
    public void shiftGears(int gear) {
        System.out.printf("Передача авто %s переключена на %d", this.getClass().getName(), gear);
    }

    ;

    /**
     * метод включения фар
     * 0 - фары выключены
     */
    public void headlightsStatus(int status) {
        if (status == 0) {
            System.out.println("Фары включены");
        } else {
            System.out.println("Фары выключены");
        }
    }

    ;

    /**
     * метод включения дворников
     */
    public void wipersStatus(boolean status) {
        if (status) {
            System.out.println("Дворники включены");
        } else {
            System.out.println("Дворники выключены");
        }
    }

    @Override
    public void fuelFilling(TypeFuel fuel, int volume) {
        if (this.fuelType == fuel) {
            System.out.printf("Машина заправлена на: %d л\n", volume);
        } else {
            throw new IllegalArgumentException("Ошибка. Вы пытаетесь залить неподходящий вид топлива");
        }
    }
}

