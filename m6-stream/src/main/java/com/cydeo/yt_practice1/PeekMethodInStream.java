package com.cydeo.yt_practice1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekMethodInStream {

    public static void main(String[] args) {

        List<String> stringList = Stream.of("One", "Two", "Three")
                .filter(obj -> !obj.equals("One"))
                .peek(obj -> System.out.println("Peeked : " + obj))
                .collect(Collectors.toList());

        System.out.println(stringList);


    }

}
