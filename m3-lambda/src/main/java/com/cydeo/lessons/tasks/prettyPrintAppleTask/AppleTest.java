package com.cydeo.lessons.tasks.prettyPrintAppleTask;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        //implementation1
        AppleFilter appleLambda = apple -> "An apple of " + apple.getWeight() + "g";

        prettyApple(inventory,appleLambda);

        //or: you can write :
        //prettyApple(inventory,apple -> "An apple of " + apple.getWeight() + "g");

        System.out.println("-----------------");

        //implementation2
        AppleFilter appleLambda2 = apple -> {

            String str = (apple.getWeight() > 155 )?"Heavy" :"Light";
            return "A " + str + " " + apple.getColor() + " apple";
        };

        prettyApple(inventory,appleLambda2);

    }

    private static void prettyApple(List<Apple> appleList , AppleFilter ap){
        //                                                  Interface : accept many actions/behaviours

        for (Apple apple : appleList) {
           String output = ap.accept(apple);
           // we did not implement inside the method yet, with Lambda we can put inside the method different implementations
            System.out.println(output);
        }


    }


}
/*
Write a prettyPrintApple method that takes aList of Apples and that can be
parameterized with multiple ways to generate a String output from an apple
public static void prettyPrintApple(List<Apple> inventory, ???){
for(Apple apple : inventory){
String output = ???.???(apple);
System.out.println(output);
}
}

Sample Output :
A Light GREEN apple
A Heavy RED apple
A Light GREEN apple

Sample Output :
An apple of 80g
An apple of 155g
An apple of 120g
 */
