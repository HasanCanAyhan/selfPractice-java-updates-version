package com.cydeo.lesson;

public class Calculator {

    public static void findSum(int x, int y){
        System.out.println("Sum " + (x +y));
    }

    public void findMultiply(int x , int y){ // instance method
        System.out.println("Multiply " + (x * y));
    }

    public String convertString(int x ){
        return Integer.toString(x);
    }

}
