package com.cydeo.lesson;

import com.cydeo.lesson.tasks.task2.Dish;
import com.cydeo.lesson.tasks.task2.DishData;
import com.cydeo.lesson.tasks.task2.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        //utility class means static methods called through ClassName

        //toCollection(Supplier Interface)
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("-------toCollection(Supplier) : is used to create a Collection using Collector-----");

        List<Integer> numberList = numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toCollection(ArrayList::new)); // it will be assigned to ArrayList

        System.out.println("numberList = " + numberList);


        System.out.println("---------------------------------------------------");

        Set<Integer> numberSetList = numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println("numberSetList = " + numberSetList);

        System.out.println("---------------------------------------------------");

        //toList() in the Application-World
        System.out.println("toList() : returns  a Collector interface that gathers the input data into a new List");

        List<Integer> integerList = numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toList());

        System.out.println("integerList = " + integerList);

        System.out.println("-------------------------------------------------");

        //toSet()

        System.out.println("toSet() : returns  a Collector interface that gathers the input data into a new Set");

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x %2 == 0)
                .collect(Collectors.toSet());

        System.out.println("numberSet = " + numberSet);

        System.out.println("---------------------------------------------");

        //toMap(Function,Function) returns Map

        System.out.println("toMap(Function,,Function) : returns a Collector interface that gathers the input data into a new Map");

        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println("dishMap = " + dishMap);
        //dishMap = {chicken=400, pizza=550, fruit=120, salmon=450, fries=530, beef=700, pork=800, rice=350, prawns=300}

        System.out.println("-------------------------------------------------");

        System.out.println("summingInt(ToIntFunction) : returns a Collector that produces the sum of an Integer -valued function");

        //like reduce()

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println("sum = " + sum);


        System.out.println("----------------------------------------------------");
        //counting()
        System.out.println("counting() : returns a Collector that counts the number of the elements");

        Long evenCount = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.counting());

        System.out.println("evenCount = " + evenCount);


        System.out.println("----------------------------------------------------");

        //averagingInt(toIntFunction) : returns the average of the integers passed value

        System.out.println("averagingInt(toIntFunction) : returns the average of the integers passed value");

        Double calorieAvarege = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println("calorieAvarege = " + calorieAvarege);

        System.out.println("-------------------------------------------------------");

        System.out.println("joining() : is used to join various elements of a character or String array into a single object");

        //like concat

        List<String> courses = Arrays.asList("Java","JS","TS");

        String str = courses.stream()
                .collect(Collectors.joining(","));

        System.out.println("str = " + str);

        System.out.println("------------------------------------------------------------------------");

        System.out.println("---------------partitioningBy()----------------------------------------");

        //not used so much
        //grouping based on the boolean (the given predicate)
        //always key is Boolean
        //partitioningBy() : is used to partition a stream of objects (or a set of elements(based on a given predicate))

        System.out.println("partitioningBy() : is used to partition a stream of objects (or a set of elements(based on a given predicate))");

        //return Map< Boolean , List<T>  >
        // key is Boolean , value is List of Object

        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println("veggieDish = " + veggieDish);


        System.out.println("----------------------------------------------------");

        System.out.println("---------------groupingBy()----------------------------------------");

        //returns Map
        //groupingBy() : is used for grouping objects by some property and storing results in a Map instance
        //but here key can be different
        //based on the Type we are grouping

        Map<Type,List<Dish>> dishType  = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println("dishType = " + dishType);




    }


}
