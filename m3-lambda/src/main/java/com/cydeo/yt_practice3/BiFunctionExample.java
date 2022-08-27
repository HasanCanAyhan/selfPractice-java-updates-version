package com.cydeo.yt_practice3;

import java.util.function.BiFunction;
import java.util.function.Function;

//https://youtu.be/D5aS3otGjWg
public class BiFunctionExample implements BiFunction<Integer,Integer,Integer>{

    public static void main(String[] args) {

        // BiFunction takes 2 argument returns any object : R apply(T t, U u);

        BiFunction<Integer,Integer,Integer> biFunction = new BiFunctionExample();
        System.out.println(biFunction.apply(10,20));

        System.out.println("---------------------------------------------");
        //using Lambda

        BiFunction<Integer,Integer,Integer> biFunction2 = (a,b) -> a+b;
        System.out.println( biFunction2.apply(10,20) );

        //andThen method:

        Function<Integer,Integer> function = (number) -> number*number;

        Integer result = biFunction2.andThen(function).apply(10,20);

        System.out.println(result);

    }


    @Override
    public Integer apply(Integer t, Integer u) {
        return (t + u );
    }
}
