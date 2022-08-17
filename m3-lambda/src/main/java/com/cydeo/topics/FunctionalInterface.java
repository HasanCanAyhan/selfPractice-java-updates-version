package com.cydeo.topics;

import com.cydeo.behaviorParameterization.Apple;
import com.cydeo.behaviorParameterization.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {

        /* Anonismus class
        ApplePredicate ap = new ApplePredicate() {  // AppleHeavyPredicate class
            @Override
            public boolean test(Apple apple) {
               return apple.getWeight() > 200;
            }
        };


         */

        // we will choose interface according to Signature (parameter and return type)

        //ready interface
        System.out.println("************PREDICATE************");

        // boolean test(T t); accept argument T return true or false
        Predicate<Integer> lesserThan = i -> i < 18;// implementation of the method in the Predicate Interface
        System.out.println( lesserThan.test(20) ) ; //  false


        System.out.println("************CONSUMER************");

        //void accept(T t); accept Object return anything
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        System.out.println("************BI CONSUMER************");

        //void accept(T t, U u); take 2 parameters return anything
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(1,2);


        System.out.println("************FUNCTION************");

        // R apply(T t); it accepts 1 object return Object
        //       <parammeter, returnType>
        Function<String,String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));

        System.out.println("************BI FUNCTION************");

        // R apply(T t, U u); : take 2 parameters, R return any object
        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1+ x2;
        System.out.println(func.apply(2,3));


        System.out.println("************SUPPLIER************"); // In Stream

        //T get(); does not take any paramater , return something
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println( randomValue.get() );

        Supplier<String> supp = () -> "Hello Can";
        System.out.println( supp.get() );



    }

}
