package com.cydeo.java12.teeingPractice3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingPractice {

    public static void main(String[] args) {

        /*
        Returns a Collector that is a composite of two downstream collectors.
        Every element passed to the resulting collector is processed by both downstream collectors,
        then their results are merged using the specified merge function into the final result.
         */


        Long average = Stream.of(55, 62, 23, 88, 159, 9, 12)
                .collect(Collectors.teeing(

                        Collectors.summingInt(i -> i),
                        Collectors.counting(),

                        (sum, num) -> sum / num

                ));

        System.out.println("average = " + average);


    }

}
