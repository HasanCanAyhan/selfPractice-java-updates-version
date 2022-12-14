package com.cydeo.lesson;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {

        /*
        1- with new keyword
        2- with valueOf() method
        3- with CONSTANT values

         */


        double amount1 = 374.56;
        double amount2 = 374.26;

        System.out.println(amount1-amount2); // 0.30000000000001137

        BigDecimal bigDecimal1 = new BigDecimal("374.56"); // constructor
        BigDecimal bigDecimal2 = new BigDecimal("374.26");

        //bigDecimal1 and bigDecimal2 are object which have some properties
        //with subtract method
        System.out.println(bigDecimal1.subtract(bigDecimal2)); //0.30

        System.out.println("------------------------------------------------------------");

        // BigDecimal.valueOf()
        BigDecimal b3 = BigDecimal.valueOf(374.56);

        // ready numbers

        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 = BigDecimal.ONE;

        System.out.println("------------------------------------------------------------");

        // add()

        System.out.println(b4.add(b5));
        System.out.println(b4.multiply(new BigDecimal("15.00")));
        System.out.println(b4.multiply(BigDecimal.valueOf(15.56)));


        System.out.println("------------------------------------------------------------");

        //Scaling method
        BigDecimal number1 = new BigDecimal("23.12");
        System.out.println(number1.setScale(1, RoundingMode.CEILING)); // 23.2 - up
        System.out.println(number1.setScale(1, RoundingMode.FLOOR)); // 23.1 - down
        System.out.println(number1.setScale(2, RoundingMode.CEILING)); // 23.12
        System.out.println(number1.setScale(2, RoundingMode.FLOOR)); //23.12


        System.out.println("------------------------------------------------------------");

        //DO NOT use Equals().   USE CompareTo()

        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));//0 : equals
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));//1 : first greater
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));//-1 : first less than




    }


}

class Employee{
    private String name;
    private BigDecimal salary;
    // private double salary; not any more !! --->> use BigDecimal
}