package com.cydeo.java10.yt_practice;

import java.util.ArrayList;
import java.util.List;

public class VarKeywordExample {

    // var i = 10; --->>> you can not use "var" as instance variable

    public static void main(String[] args) {

        //Local-Variable Type Inference

        /*
        It allows to define a variable using var and
        without specifying the type of it. The compiler infers the type of the variable
        using the value provided. This type inference is restricted to local variables.
         */

        //int i = 10;
        var n = 10;

        var str = "Hello world";

        var names = new ArrayList<String>();
        names.add("10");

        var first = "Can";
        var last = "Ay";
        var fullName = first + last;
        System.out.println(fullName);

        //var myLambda =  () -> System.out.println("Hello"); --->>> you can not use!

        var courses = List.of("Java", "Spring", "Agile", "Github");
        for (var course : courses) {
            System.out.println(course);
        }
        System.out.println("");


    }

    /* you can not use "var" like this
    public var int add(var a, var b){
        return a+b;
    }
     */



}
