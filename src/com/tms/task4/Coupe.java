package com.tms.task4;

import java.util.Objects;

public class Coupe extends Car {
    private final Integer numberOfCarSeats = 2;

    public Coupe(String carBrand, String carModel, Integer yearOfProduction, String colour) {
        super(carBrand, carModel, yearOfProduction, colour);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return carBrand.equals(car.carBrand) && carModel.equals(car.carModel) && yearOfProduction.equals(car.yearOfProduction) && colour.equals(car.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carModel, yearOfProduction, colour);
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", colour='" + colour + '\'' +
                ", numberOfCarSeats=" + numberOfCarSeats +
                '}';
    }


}
