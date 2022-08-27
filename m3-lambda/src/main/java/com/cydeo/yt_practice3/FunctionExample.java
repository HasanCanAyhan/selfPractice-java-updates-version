package com.cydeo.yt_practice3;

import java.util.*;
import java.util.function.Function;
//https://youtu.be/5K4eVKCpuHQ
public class FunctionExample {

    public static void main(String[] args) {

        System.out.println("--------example1-------------------------");

        //       parameter, returnType
        Function<String,Integer> function = ( s -> s.length());

        System.out.println( function.apply("Can") );

        System.out.println("--------example2-------------------------");

        Function<Integer,String> function1 = (number) -> {

            if (number % 2 == 0){
                return "Number " + number + " is even";
            }else {
                return "Number " + number + " is odd";
            }

        };

        System.out.println(function1.apply(11));

        System.out.println("--------example3-------------------------");

        //andThen method :

        Function<String,Integer> function2 = (t) -> t.length(); // 3
        Function<Integer,Integer> function3 = (number) -> number*2;

        Integer integer = function2.andThen(function3).apply("Can"); // 3*2 = 6

        System.out.println(integer);


        System.out.println("--------example4-------------------------");

        List<String> list = Arrays.asList("java","python","js","css");

        Map<String, Integer> stringIntegerMap = convertListToMap(list, x -> x.length());

        System.out.println(stringIntegerMap);


        System.out.println("--------example5-------------------------");

        List<String> namesList = Arrays.asList("Can","John","Lucy","Ermek");

        Function<String,String> function4 = x -> x.toUpperCase().charAt(0) + "." + x.toUpperCase().charAt(x.length()-1);

        System.out.println( convertListToMap2(namesList,function4) );


    }

    private static <T,R> Map<T,R> convertListToMap(List<T> list, Function<T,R> function){

        Map<T,R> result = new HashMap<>();
        for (T t : list) {
            result.put(t,function.apply(t));
        }
        return result;



    }


    private static<T,V> Map<T,V>  convertListToMap2(List<T> list , Function<T,V> function){

        Map<T,V> map = new LinkedHashMap<>();

        for (T t : list) {

            map.put(t,function.apply(t));

        }

        return map;

    }


}
