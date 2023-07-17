package Homeworks.HW4.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Модель перевозчика
 */
public class Carrier {
    private int id;
    private long cardNumber;
    private List<Integer> zones;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public Carrier(int id, long cardNumber, List<Integer> zones) {
        this.id = id;
        this.cardNumber = cardNumber;
        if (zones.size() < 2) {
            throw new RuntimeException("Количество остановок меньше 2");
        } else {
            this.zones = zones;
        }

    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}
