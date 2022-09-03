package com.cydeo.lesson.constructor4Parameters;


import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {

    private String make;
    private Integer model;

    private BigDecimal price;

    private Double km;

    //1 argument
    public Car(int model) {
        this.model = model;
    }

    //2 argument
    public Car(String make, Integer model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make, Integer model, BigDecimal price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
}
