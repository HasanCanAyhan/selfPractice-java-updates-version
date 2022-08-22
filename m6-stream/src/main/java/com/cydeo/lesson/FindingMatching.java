package com.cydeo.lesson;

import com.cydeo.lesson.tasks.task2.Dish;
import com.cydeo.lesson.tasks.task2.DishData;

import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

        //Terminal Operations

        //All Match --- accept Predicate
        System.out.println("All Match :");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy); //true, all the data 's  calories is < 1000

        System.out.println("-------------------------------------------");

        System.out.println("Any Match : ");//--->> Predicate , one of them
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("-------------------------------------------");

        System.out.println("None Match :");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2); // true none of them is not match.

        System.out.println("-------------------------------------------");

        // can find anything randomly
        System.out.println("Find Any : "); // randomly // it returns Optional, to prevents NullPointerException
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        // can find the first one
        System.out.println("Find First : ");
        Optional<Dish> dish2 =  DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());


        System.out.println("-----------------------------------------------------------");

        //Parallel Stream (Async)
        System.out.println("Parallel Stream");
        System.out.println(IntStream.range(0,100).parallel().findAny()); // can find anything randomly
        System.out.println(IntStream.range(0,100).parallel().findFirst());// can find the first one , it can be used for finding max-min salary etc..






    }
}
