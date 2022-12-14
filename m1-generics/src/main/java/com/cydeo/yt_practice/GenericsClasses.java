package com.cydeo.yt_practice;

import java.sql.Array;
import java.util.ArrayList;

class MyGenericClass<T extends Number>{ // T : Thing
    //                  bounded types = you can create the objects of a generic class
    //                  to have data of specific derived types ex.Number

    T x;

    MyGenericClass(T x){
        this.x = x;
    }

    public T getValue() {
        return x;
    }



}

public class GenericsClasses {

    public static void main(String[] args) {

        // T extends Number!!!!

        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);

        //MyGenericClass<Character> myChar = new MyGenericClass<>('@');
        //MyGenericClass<String> myStr = new MyGenericClass<>("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myStr.getValue());


    }

}
