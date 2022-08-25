package com.cydeo.java10.yt_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CopyOfDemo {

    public static void main(String[] args) {

        //Java 10 has added a copyOf method to all the Collection interfaces. You can
        //use this to create an unmodifiable Collection.

        List<Integer> numberList = Arrays.asList(2,4,6,8);

        List<Integer> unmodifiableList = List.of(2,4,6,8); // takes values

        List<Integer> unmodifiableList2 =List.copyOf(numberList); // takes list




    }


}
