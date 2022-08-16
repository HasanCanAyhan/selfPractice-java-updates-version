package com.cydeo.patika_practice;

public class Main {

    public static void main(String[] args) {

        // lambda

        //Runnable Interface is Functional Interface inside one abstract method

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Class");
            }
        };

        runnable.run();

        // Java 8 - Lambda Expression

        Runnable r2 = () -> System.out.println("Runnable Class with Lambda");
        r2.run();

        System.out.println("-------------------------------------------------------------");

        // before Lambda


        MathOperator sum = new MathOperator() {
            @Override
            public int transaction(int a, int b) {
                return a + b;
            }
        };


        MathOperator minus = new MathOperator() {
            @Override
            public int transaction(int a, int b) {
                return a - b ;
            }
        };

        MathOperator multiply = new MathOperator() {
            @Override
            public int transaction(int a, int b) {
                return a * b;
            }
        };


        MathOperator divide = new MathOperator() {
            @Override
            public int transaction(int a, int b) {
                if (b == 0){
                    b = 1;
                }

                return a / b;
            }
        };

        System.out.println(sum.transaction(10,2));

        System.out.println("----------------------------------------------------");

        // with Lambda

        MathOperator sum2 = (x,y) -> x + y;
        MathOperator minus2 = (x,y) -> x - y;
        MathOperator multiply2 = (x,y) -> x * y;
        MathOperator divide2 = (x,y) -> {
            if ( y == 0){
                y = 1;
            }

            return x / y;
        };


        System.out.println(sum2.transaction(10,2));
        System.out.println(minus2.transaction(8,2));
        System.out.println(multiply2.transaction(5,2));
        System.out.println(divide2.transaction(4,2));




    }

}
