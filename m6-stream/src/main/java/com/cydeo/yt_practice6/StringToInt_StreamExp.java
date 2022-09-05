package com.cydeo.yt_practice6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToInt_StreamExp {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("1","2","3","4","5");

        List<Integer> listOfIntegers = listOfStrings.stream().map(s -> Integer.valueOf(s)).collect(Collectors.toList());
        System.out.println(listOfIntegers);

        System.out.println("-----------------------------------------");

        String str = "1,2,3,4,5";

        int[] ints = Arrays.stream(str.split(",")).mapToInt(Integer::valueOf).toArray();
        System.out.println("ints = " + Arrays.toString(ints));

        System.out.println("------");


        int num = 490;

        int[] ints1 = Integer.toString(num).chars().map(c -> c - '0').toArray();
        System.out.println("ints1 = " + Arrays.toString(ints1));

    }

}
