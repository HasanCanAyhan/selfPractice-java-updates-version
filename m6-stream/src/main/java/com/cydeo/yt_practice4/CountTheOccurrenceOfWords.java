package com.cydeo.yt_practice4;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


//https://youtu.be/oNdMigiwzlU

public class CountTheOccurrenceOfWords {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,5,6,8,23,35,36,77,78,99);

        //list.stream().limit(7).forEach(System.out::println);

        list.stream().skip(7).forEach(System.out::println);

        System.out.println("----------------------------------------------------------");

        //Count the no of occurrence of words in given string using Java 8

        String str = "welcome to code decode and code decode welcome you";

        //output = code=2,and=1,to=1,decode=2,welcome=2,you=1

        //Solution1

        LinkedHashMap<String, Long> collect = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

        System.out.println("------------------------------------");

        //Solution2

        //List<String> liststr = Arrays.asList(str.split(" "));



    }

}
