package com.cydeo.lesson.tasks.task2_byOzzy;

import java.util.Comparator;

public class DiskTask {

    public static void main(String[] args) {

        System.out.println("Print all dish`s name that has less than 400 calories");

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                //.map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        System.out.println("Print the length of the name of each dish");

        DishData.getAll().stream()
                .map(Dish::getName)
                //.map(dish -> dish.length())
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("----------------------------------");

        System.out.println("print three high caloric dish name(> 300)");

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing( Dish::getCalories).reversed())
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-----------------------------------");

        System.out.println("print all dish name that are below 400 calories in sorted");

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()< 400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);

        



    }

}
