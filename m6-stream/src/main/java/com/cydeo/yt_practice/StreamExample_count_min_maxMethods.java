package com.cydeo.yt_practice;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample_count_min_maxMethods {

    public static void main(String[] args) {

        //count(), min() ,max()

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);

        System.out.println("count : " + stream.count()); //9

        System.out.println("------------");

        Integer minInteger = Stream.of(1,2,3,4,5,6,7,8,9).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("minInteger = " + minInteger);

        Integer maxInteger = Stream.of(1,2,3,4,5,6,7,8,9).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("maxInteger = " + maxInteger);

        System.out.println("-----");

        Stream<Integer> stream1 = Stream.of(9,10,25,22,66);

        Integer maxInt = stream1.max(Comparator.comparing(integer -> integer)).get();
        System.out.println("maxInt = " + maxInt);


    }

}
