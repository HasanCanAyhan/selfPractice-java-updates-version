package com.cydeo;

public class Main {

    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;

        System.out.println(c);//DIME : toString already overridden because we do not see Hashcode

        System.out.println(Currency.PENNY);

        System.out.println("How to get  all the constant ");

        Currency[] currencies = Currency.values(); // Currency.values() returns Array[]

        for (Currency currency : currencies){
            System.out.println(currency);
        }








    }

}
