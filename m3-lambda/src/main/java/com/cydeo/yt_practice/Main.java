package com.cydeo.yt_practice;

public class Main {

    public static void main(String[] args) {

        String name = "Bro";
        char symbol = '!';

        /*
        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void message(String name, char symbol) {

            }
        }

         */
        MyInterface myInterface = (x,y) -> {
            System.out.println("Hello World!");
            System.out.println("It is a nice day " + x +y);
        };

        myInterface.message(name,symbol);

        System.out.println("------------------");

        MyInterface myInterface2 = (x,y) -> {
            System.out.println("Hello " + x+y);
        };

        myInterface2.message(name,symbol);




    }

}
