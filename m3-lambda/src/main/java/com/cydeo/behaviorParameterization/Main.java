package com.cydeo.behaviorParameterization;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Behavior Parameterization : the ability to tell a method to take multiple behaviors (strategies)

        // interface
        // class which implement interface
        // method-action
        // call it

        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));


        HeavyApplePredicate heavyApplePredicate = new HeavyApplePredicate();
        GreenApplePredicate greenApplePredicate = new GreenApplePredicate();

        filterApple(inventory, heavyApplePredicate);
        filterApple(inventory, greenApplePredicate);


        // or

        /*
        // Achtung! : return type of method should be List<Apple>
        ApplePredicate abc = new AppleHeavyPredicate();
        List<Apple> heavyApple = filterApples(inventory,abc);
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);
         */


    }


    //                  this method : get the all apples , based on the action give me result
    private static void filterApple(List<Apple> inventory, ApplePredicate applePredicate) {
        //                                                   // interface in order to take different actions
        //                                                   //  heavyApple behaviors or greenApple behaviors

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {

            if (applePredicate.test(apple)) {
                result.add(apple);
            }


        }

        System.out.println(result);

    }


}
