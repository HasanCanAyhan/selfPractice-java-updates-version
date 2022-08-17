package com.cydeo.lessons.readyFunctionalInterfacePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class OrangeTest { // QS-1 in the LMS Lambda Task

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();

        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));

        prettyPrintApple(inventory , orange -> "An orange of " + orange.getWeight() + "g");

        System.out.println("----------------------------");

        prettyPrintApple(inventory,orange ->
                { String str = orange.getWeight() > 200 ? "Heavy " : "Light ";

                    return "A " + str + orange.getColor() + " orange";

                }


                );

    }

    // Task
    //convert to ready functional interface

    private static void prettyPrintApple(List<Orange> orangeList , Function<Orange,String> function){

        for (Orange orange : orangeList) {

            String output = function.apply(orange);
            System.out.println(output);

        }

    }



}
