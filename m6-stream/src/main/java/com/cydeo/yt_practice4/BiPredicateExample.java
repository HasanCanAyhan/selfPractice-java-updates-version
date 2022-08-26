package com.cydeo.yt_practice4;

import java.util.function.BiPredicate;
//https://youtu.be/oCsFmHEXLME
public class BiPredicateExample implements BiPredicate<String,String>{

    public static void main(String[] args) {

        //BiPredicate :  boolean test(T t, U u);

        BiPredicate<String,String> biPredicate = new BiPredicateExample();
        boolean r1 = biPredicate.test("Can","can");
        System.out.println(r1);

        System.out.println("--------------------------------------");

        //using lambda

        BiPredicate<String,String> biPredicate2 = (s1,s2) -> s1.equals(s2);
        boolean b2 = biPredicate2.test("CAN","CAN");
        System.out.println(b2);

        System.out.println("-------------------------------");

        BiPredicate<Integer,Integer> biPredicate3 = (x,y) -> x > y;
        BiPredicate<Integer,Integer> biPredicate4 = (x,y) -> x == y;

        //and()
        boolean b3 =  biPredicate3.and(biPredicate4).test(20,10);
        System.out.println(b3);//false

        //or()
        boolean b4 =  biPredicate3.or(biPredicate4).test(20,10);
        System.out.println(b4);//true

    }


    @Override
    public boolean test(String s1, String s2) {
        return s1.equals(s2);
    }
}
