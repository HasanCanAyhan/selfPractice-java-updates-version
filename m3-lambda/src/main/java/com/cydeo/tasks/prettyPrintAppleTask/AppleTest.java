package com.cydeo.tasks.prettyPrintAppleTask;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> appleList = new ArrayList<>();

        appleList.add(new Apple(80,Color.LIGHT_GREEN));
        appleList.add(new Apple(155,Color.HEAVY_RED));
        appleList.add(new Apple(120,Color.LIGHT_GREEN));


        // first without using Lambda

        AppleColor appleColor = new AppleColor();
        prettyPrintApple(appleList,appleColor);

        System.out.println("--------");

        AppleWeight appleWeight = new AppleWeight();
        prettyPrintApple(appleList,appleWeight);


        System.out.println("--------------------------------");
        System.out.println("with lambda");

        AppleFilter applesColor = apple -> ""+apple.getColor();
        prettyPrintApple(appleList,applesColor);

        System.out.println("--------");

        AppleFilter applesWeight = apple -> ""+ apple.getWeight();
        prettyPrintApple(appleList,applesWeight);




    }

    private static void prettyPrintApple(List<Apple> appleList , AppleFilter appleFilter){

        for (Apple apple : appleList) {

            String output = appleFilter.test(apple);

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
