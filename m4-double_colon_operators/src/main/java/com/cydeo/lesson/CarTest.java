package com.cydeo.lesson;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //Zero Argument Constructor

        Supplier<Car> carSupplier = () -> new Car(); // return type : car object
        System.out.println(carSupplier.get().getModel());

        Supplier<Car> carSupplierMethodRef = Car::new;
        System.out.println(carSupplierMethodRef.get().getModel());

        System.out.println("--------------------------------------------------");

        // 1 Argument Constructor

        Function<Integer,Car> carFunction = model -> new Car(model);

        Function<Integer,Car> carFunctionMethodRef = Car::new;

        // 2 Argument Constructor

        BiFunction<String,Integer,Car> carBiFunction = (make, model) -> new Car(make,model);
        BiFunction<String,Integer,Car> carBiFunctionMethodRef = Car ::new;
        Car carObj = carBiFunctionMethodRef.apply("Honda",2015);
        System.out.println(carObj.getMake() + " " + carObj.getModel());




    }

}
