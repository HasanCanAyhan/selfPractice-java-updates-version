package com.cydeo.yt_practice3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
//https://youtu.be/n12tzFZW-Kk
public class BiConsumerExample  implements BiConsumer<Integer,Integer> {

    public static void main(String[] args) {

        BiConsumer<Integer,Integer>  biConsumer = new BiConsumerExample();
        biConsumer.accept(10,20);

        System.out.println("----------------------------------");

        //by using lambda

        BiConsumer<Integer,Integer>  biConsumer2 = (a,b) -> System.out.println(a + b);
        biConsumer2.accept(10,20);

        System.out.println("----------------------------------------");

        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Java");
        map.put(2,"Css");
        map.put(3,"Node");
        map.put(4,"JavaScript");
        map.put(5,"GO");

        map.forEach( (k,v) -> {
            System.out.println(k + " : " + v);
        } );


    }

    @Override
    public void accept(Integer a, Integer b) {

        System.out.println(a+b);

    }
}
