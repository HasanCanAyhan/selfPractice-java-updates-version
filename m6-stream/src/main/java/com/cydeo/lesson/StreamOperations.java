package com.cydeo.lesson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4);
        //list.forEach( x -> System.out.println(x));
        //list.forEach(System.out::println); // -->>> Method Reference

        //Filter -- Predicate(accept one parameter return boolean)
        //returns a stream including all elements that matches the redicate
        System.out.println("Filter: ");

        list.stream()
                .filter(each -> each % 2 == 0)
                .forEach(System.out::println); //2,4,2,4  stream is over

        System.out.println("Distinct: ");

        Stream<Integer> stream = list.stream()
                .filter( i -> i %2 == 0)
                .distinct();
        //intermediate operations return Stream object
        stream.forEach(System.out::println); // 2,4 Stream is closed

        System.out.println("Limit: ");
        // highest price, top product, employee has the highest salary ......
        list.stream()
                .filter( i -> i %2 == 0)
                .limit(1)
                .forEach(System.out::println); // 2

        System.out.println("Skip: ");

        list.stream()
                .filter( i -> i %2 == 0)
                .skip(1)
                .forEach(System.out::println); // 4 2 4

        System.out.println("Map");
        // we are changing object
        //takes a function as argument.The function is applied to each element, mapping it to a new element
        //Function Interface abstract method :  R apply(T t);
        list.stream()
                .map( each -> each*3)
                .filter(each -> each % 2 == 0)
                .forEach(System.out::println); // 6 12 6 12







    }

}
