package com.cydeo.lesson;

import com.cydeo.lesson.tasks.task2.Dish;
import com.cydeo.lesson.tasks.task2.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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

        System.out.println("----------------------------------------------------------------");

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        list1.parallelStream().filter(s -> s.startsWith("D")).findAny();

        System.out.println("with parallel");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        System.out.println("findFirst = " + findFirst.get()); // David
        System.out.println("findAny = " + findAny.get()); // it changes!!!

        System.out.println("with stream");

        Optional<String> findFirst2 = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny2 = list2.stream().filter(s -> s.startsWith("J")).findAny();

        System.out.println("findAny2 = " + findAny2.get()); //Jonny
        System.out.println("findFirst2 = " + findFirst2.get()); //David

        System.out.println("-------------------------------------");


        System.out.println("MIN : ");

        //DishData.getAll().stream().sorted().findFirst();
        Optional<Dish> minDish = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println("minDish = " + minDish);

        System.out.println("MAX : ");
        Optional<Dish> maxDish = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println("maxDish = " + maxDish);




    }
}
