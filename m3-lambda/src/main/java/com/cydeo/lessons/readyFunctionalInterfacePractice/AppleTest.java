package com.cydeo.lessons.readyFunctionalInterfacePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        printApple(inventory, apple -> apple.getWeight() > 200);

        System.out.println("----------");

        printApple(inventory,apple -> apple.getColor().equals(Color.GREEN));

    }

    // Task
    //convert to ready functional interface

    private static void printApple(List<Apple> appleList, Predicate<Apple> pr){

        for (Apple apple : appleList) {

            if (pr.test(apple)){
                System.out.println(apple);
            }

        }


    }



}
