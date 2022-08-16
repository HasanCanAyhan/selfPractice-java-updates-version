package com.cydeo.behaviorParameterization;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // interface
        // class which implement interface
        // method-action
        // call it

        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));


        HeavyApplePredicate heavyApplePredicate = new HeavyApplePredicate();
        GreenApplePredicate greenApplePredicate = new GreenApplePredicate();


       filterApple(inventory,heavyApplePredicate);
       filterApple(inventory,greenApplePredicate);



    }

    private static void filterApple( List<Apple> inventory, ApplePredicate applePredicate){
        //                                                   // interface in order to take different actions

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {

            if (applePredicate.test(apple)){
                result.add(apple);
            }


        }

        System.out.println(result);

    }


}
