package com.tms.task4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Car, Integer> cars = new HashMap<>();

        cars.put(new Coupe("Porshe", "TurboS", 2020, "Yellow"), 1);
        cars.put(new Coupe("Porshe", "TurboS", 2020, "Blue"), 1);
        cars.put(new Limo("Cadillac", "Exclusive", 2020, "Black"), 1);
        cars.put(new Sedan("Ford", "Escort", 2020, "White"), 1);
        cars.put(new Hatchback("Nissan", "Almera", 2020, "White"), 1);

        Garage garage = new Garage(cars);
        // parking
        garage.carParking(new Coupe("Porshe", "TurboS", 2020, "Yellow"));

        for (Car item : garage.getGarage().keySet()) {
            System.out.println(item);
            System.out.println(garage.getGarage().get(item));
        }
        System.out.println("-------------------------------------------");
        // leaving
        garage.carLeaving(new Coupe("Porshe", "TurboS", 2020, "Yellow"));

        for (Car item : garage.getGarage().keySet()) {
            System.out.println(item);
            System.out.println(garage.getGarage().get(item));
        }
        System.out.println("-------------------------------------------");
        // counting
        System.out.println(garage.getCarNumber(new Coupe("Porshe", "TurboS", 2020, "Yellow")));

    }
}
