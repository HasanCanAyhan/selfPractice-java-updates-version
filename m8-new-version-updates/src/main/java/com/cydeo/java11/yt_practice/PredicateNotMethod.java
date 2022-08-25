package com.cydeo.java11.yt_practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotMethod {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> even = integer -> integer %2 == 0;

        Predicate<Integer> odd = Predicate.not(even); //--->>>> odd

        List<Integer> evenNumbers = list.stream().filter(even).collect(Collectors.toList());

        List<Integer> oddNumbers = list.stream().filter(odd).collect(Collectors.toList());

        //or:

        List<Integer> oddNumbers2 = list.stream().filter(Predicate.not(even)).collect(Collectors.toList());


        System.out.println("-----------------------------------------------------");

        List<String> names = Arrays.asList("Tom", "Ron"," ", "Bob");

        Predicate<String> str = s -> s.isBlank();

        //List<String> stringList = names.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());

        List<String> stringList = names.stream().filter(Predicate.not(str)).collect(Collectors.toList());
        System.out.println(stringList);

    }

}
