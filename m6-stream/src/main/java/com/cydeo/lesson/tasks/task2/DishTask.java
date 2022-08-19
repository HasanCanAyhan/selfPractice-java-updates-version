package com.cydeo.lesson.tasks.task2;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {

        //Print all dish`s name that has less than 400 calories

        System.out.println("Print all dish`s name that has less than 400 calories");
        DishData.getAll().stream()
                .filter( each -> each.getCalories() < 400  )
                .forEach( (each) -> System.out.println(each.getName()) );

        System.out.println("--------------------------------");

        //Print the length of the name of each dish

        System.out.println("Print the length of the name of each dish");
        DishData.getAll().stream()
                .map(each -> each.getName().length())
                .forEach(System.out::println);

        System.out.println("----------------------------------");

        //print three high caloric dish name(> 300)

        System.out.println("print three high caloric dish name(> 300)");

        DishData.getAll().stream()
                .filter(each -> each.getCalories() > 300)
                .sorted(comparing( Dish::getCalories ).reversed())
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-----------------------------------");

        //print all dish name that are below 400 calories in sorted


        System.out.println("print all dish name that are below 400 calories in sorted");

        DishData.getAll().stream()
                .filter( dish -> dish.getCalories() < 400)
                .sorted(comparing( dish -> dish.getCalories() ))
                .map(dish -> dish.getName())
                .forEach(System.out::println);



    }

}
