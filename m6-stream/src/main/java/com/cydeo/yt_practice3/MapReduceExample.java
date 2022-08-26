package com.cydeo.yt_practice3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);

        int sum = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum);

        System.out.println("--------------------------");

        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        System.out.println("--------------------------");

        //sum
        Optional<Integer> reduceSumMethodRef = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumMethodRef.get());

        System.out.println("--------------------------");

        Integer multipleResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multipleResult);

        System.out.println("--------------------------");

        //max, min

        Integer reduceMaxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(reduceMaxValue);

        System.out.println("------------------");

        Optional<Integer> reduceMaxMethodRef = numbers.stream().reduce(Integer::max);
        System.out.println(reduceMaxMethodRef.get());


        System.out.println("----------------------------------------------------");

        List<String> words = Arrays.asList("corejava","spring","hibernate");

        String longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);

    }


}
