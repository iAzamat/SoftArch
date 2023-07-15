package Homeworks.HW3;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ConcreteCarPetrol car1 = new ConcreteCarPetrol(
                "Mazda",
                "CX-5",
                Color.BLUE,
                BodyType.CROSSOVER,
                4,
                TypeFuel.PETROL,
                TransmissonType.Automatic,
                2.5f);

        ConcreteCarDiesel car2 = new ConcreteCarDiesel(
                "BMW",
                "X6",
                Color.BLACK,
                BodyType.Coupe,
                4,
                TypeFuel.DIESEL,
                TransmissonType.Automatic,
                3.0f);

        car1.fuelFilling(TypeFuel.PETROL, 10);
        car2.fuelFilling(TypeFuel.DIESEL, 15);
    }
}
