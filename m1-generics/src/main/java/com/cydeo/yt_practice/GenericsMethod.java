package com.cydeo.yt_practice;

//https://youtu.be/jUcAyZ5OUm0

public class GenericsMethod {

    public static void main(String[] args) {

        // generics : enable types to be parameters when defining
        //classes, interfaces  and methods
        //benefit is to eliminate the need to create multiple version of methods or classes for various data types

        Integer[] intArr = {1,2,3,4,5};
        Double[] doubleArr = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArr = {'H','E','L','L','O'};
        String[] strArr = {"B","Y","E"};

        //displayArr(intArr);
        //displayArr(charArr);
        //displayArr(doubleArr);
        //displayArr(strArr);

        System.out.println( getFirst(intArr) );
        System.out.println( getFirst(strArr) );

    }

    public static <T> void displayArr(T[] arr  ){

        for (T each : arr) {
            System.out.println(each);
        }

    }

    public static <T> T getFirst(T[] arr  ){

        return arr[0];

    }

}
