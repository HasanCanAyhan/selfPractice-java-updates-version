package com.cydeo.java11;

public class StringMethodDemo {

    public static void main(String[] args) {

        //lines() :
        //lines(): It is used to get all the lines in a String as a Stream.

        var str = "Mike \n Ozzy \n Tom \n Emmy";

        str.lines().forEach(System.out::println);

        Long count = str.lines().count();
        System.out.println("count = " + count);



    }

}
