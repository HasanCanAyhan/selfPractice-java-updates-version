package com.cydeo.yt_practice4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements_Stream {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,28,87,10,20,76,28,80,80,80);

        //Solution 1

        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        System.out.println("collect = " + collect);

        collect.keySet().stream().filter(key -> collect.get(key) > 1).forEach(System.out::println);

        System.out.println("-----------------------------------------");

        //Solution2

        Set<Integer> set = new HashSet<>();

        list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(System.out::println);


    }


}
