package com.cydeo.yt_practice1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InfiniteStreams {

    public static void main(String[] args) {

        //infinite streams used to generate infinite stream of data


        //1.iterate()
        // static (T seed, UnaryOperator<T> f)
        //return a stream --->>> Stream<T>


        List<Integer> integerList = IntStream.iterate(0, n -> n + 2)
                .mapToObj(Integer::valueOf)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(integerList);

        System.out.println("---------------------------------------------");

        long result = IntStream.iterate(1, n -> n <= 21, n -> n+1)
                .filter(number -> number % 7 == 0)
                .peek(number -> System.out.println("peeked : " + number))
                .count();

        System.out.println("result = " + result);



    }

}
