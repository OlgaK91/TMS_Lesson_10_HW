package com.tms.task4;

import lombok.Getter;

import java.util.HashMap;
@Getter
public class Garage {
    private HashMap<Car, Integer> garage = new HashMap<>();

    public Garage(HashMap<Car, Integer> garage) {
        this.garage = garage;
    }

    public HashMap<Car, Integer> carParking(Car newCar) {
        if (garage.containsKey(newCar)) {
            garage.computeIfPresent(newCar, (k, v) -> v + 1);
        } else {
            garage.putIfAbsent(newCar, 1);
        }
        return garage;

    }

    public HashMap<Car, Integer> carLeaving(Car newCar) {
        if (garage.containsKey(newCar)) {
            garage.computeIfPresent(newCar, (k, v) -> v - 1);
        }
        return garage;

    }

    public Integer getCarNumber(Car newCar) {
        if (garage.containsKey(newCar)) {
            return garage.get(newCar);
        } else {
            return 0;
        }
    }
}
