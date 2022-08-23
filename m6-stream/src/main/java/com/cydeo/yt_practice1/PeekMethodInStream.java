package com.cydeo.yt_practice1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekMethodInStream {

    public static void main(String[] args) {

        List<String> stringList = Stream.of("One", "Two", "Three")
                .filter(obj -> !obj.equals("One"))
                .peek(obj -> System.out.println("Peeked : " + obj))
                .collect(Collectors.toList());

        System.out.println(stringList);

        System.out.println("-----------------------------------");


        IntStream.of(10,20,3,4,5,6,7)
                .skip(2)
                .filter(i -> i > 5)
                .peek(i -> System.out.println("Peeked : " + i))
                .forEach(System.out::println);


    }

}
