package com.cydeo.topics;

import com.cydeo.behaviorParameterization.Apple;
import com.cydeo.behaviorParameterization.ApplePredicate;

import java.util.function.Consumer;
import java.util.function.Predicate;

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









    }

}
