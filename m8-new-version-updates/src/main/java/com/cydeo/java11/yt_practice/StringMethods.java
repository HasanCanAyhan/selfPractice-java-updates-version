package com.cydeo.java11.yt_practice;

import java.util.stream.Stream;

public class StringMethods {

    public static void main(String[] args) {

        /*

            repeat(): It is accepts int count as parameter and returns String whose
                      value is the concatenation of given String repeated count times.

            isBlank(): It is used to check if the String is blank or not. If there is no
                       character inside the String it is returns true, otherwise it returns false.
                       • Blank and Null is not the same.

         */

        //lines(): It is used to get all the lines in a String as a Stream.

        var str = "Mike \n Ozzy \n Tom \n Emmy";

        str.lines().forEach(System.out::println);

        System.out.println("-----------------------------");

        String multilineStr = "This is \n a multiline \n string.";

        Stream<String> linesStream = multilineStr.lines();
        linesStream.forEach(System.out::println);

        long lineCount = multilineStr.lines().count();
        System.out.println(lineCount);



    }

}
