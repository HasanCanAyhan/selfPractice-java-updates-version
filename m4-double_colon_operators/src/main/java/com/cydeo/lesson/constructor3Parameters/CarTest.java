package com.cydeo.lesson.constructor3Parameters;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class CarTest {

    public static void main(String[] args) {

        // 2 Argument Constructor

        BiFunction<String,Integer, Car> carBiFunction = (make, model) -> new Car(make,model);
        BiFunction<String,Integer, Car> carBiFunctionMethodRef = Car::new;
        Car carObj = carBiFunctionMethodRef.apply("Honda",2015);
        System.out.println(carObj.getMake() + " " + carObj.getModel());

        System.out.println("----------------------------------------------");

        //3 Argument Construcotr

        //CustomInterface we created, if the constructor of Car Clas have 3 parameters
        CarInterface3Parameters<String,Integer, BigDecimal,Car> carObjMetRef = Car::new;
        Car car = carObjMetRef.apply("Tesla",2022,BigDecimal.valueOf(45000.55));
        System.out.println(car);





    }

}
