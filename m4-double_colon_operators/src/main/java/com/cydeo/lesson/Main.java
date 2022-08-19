package com.cydeo.lesson;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        //Lambda Explanation:

        //Predicate<Integer> predicate = (p) -> p%2 == 0 ? true : false;
        //implementation of interface method
        //the implementation of abstract method belongs to the Functional Interface

        //When i write Lambda, i 'm puting implementation that belongs to Functional interface's abstract method, then i check method signature, if method signature match the abstract method signature,
        //I can use functional interface, Functional interface accept one abstract method


        //-----------------METHOD REFERENCES----------------------------------------------------

        //Type of the Lambda is Interface
        Calculate sumLambda = (x , y) -> System.out.println(x +y);
        sumLambda.calculate(10,20);

        System.out.println("----------------------------------------");

        // we have also one method that giving same function : static method ->> findSum() from Calculator Class
        Calculate useFindSumCalculatorMethod = (x,y) -> Calculator.findSum(x,y);
        useFindSumCalculatorMethod.calculate(10,20);

        System.out.println("----------------------------------------");

        //using method reference

        //reference to Static Method     ClassName::methodName
        Calculate calculateMethodRef = Calculator::findSum;
        calculateMethodRef.calculate(10,20);

        System.out.println("------------------------------------------");

        //reference to an instance method
        Calculator calculator = new Calculator();

        Calculate useFindMultiply = (x,y) -> calculator.findMultiply(x,y);
        useFindMultiply.calculate(10,20);

        //using method reference

        //                              objName(ref var)::methodName
        Calculate findMultiplyMethodRef = calculator::findMultiply;

        //or:
        //Calculate findMultiplyMethodRef2 = new Calculator()::findMultiply;


        System.out.println("------------------------------------------");

        //Functional interfaces : ready interfaces

        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);

        //using method reference

        BiFunction<String,Integer,String> funcMethodRef = String::substring;
        System.out.println(funcMethodRef.apply("Hello",1));

        System.out.println("-----------------------------------------------");

        Function<Integer,Double>  function = x -> x*2.5;
        Function<Integer,Double>  function2 = (x) -> new MyClass().method(x);

        Function<Integer,Double>  function3MethodRef = new MyClass()::method;
        BiFunction<MyClass,Integer,Double> f = MyClass::method;

        //if the method is an instance method, either call by creating object with new keyword,
        //or use Functional interface which takes argument ClassName(ex:MyClass), then you do not need to create object, call it through ClassName::methodName


    }


}
