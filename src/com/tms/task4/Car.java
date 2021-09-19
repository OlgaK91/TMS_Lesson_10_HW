package com.tms.task4;
import lombok.*;

import java.util.Objects;

@Getter
public abstract class Car {

    protected String carBrand;
    protected String carModel;
    protected Integer yearOfProduction;
    protected String colour;

    public Car(String carBrand, String carModel, Integer yearOfProduction, String colour) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;

    }


}
