package com.cydeo.lesson.constructor4Parameters;

import java.math.BigDecimal;

public class CarTest {

    public static void main(String[] args) {


        CarConstructor<String,Integer, BigDecimal,Double,Car> car = Car::new;

        Car audi = car.createCar("Audi", 2022, BigDecimal.valueOf(89000), 120.000);

        System.out.println(audi);


    }


}
