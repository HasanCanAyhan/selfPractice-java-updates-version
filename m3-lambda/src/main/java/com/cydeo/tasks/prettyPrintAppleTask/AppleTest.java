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
