package com.cydeo.yt_practice;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;


@FunctionalInterface
interface Printable{
    void print(String msg);
}

public class MethodReferencesDemo {


    public void display(String msg){
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a, int b){
        return (a + b);
    }



    public static void main(String[] args) {

        // 1.Method reference to static method ->> Class::StaticMethodName

        System.out.println("------------------------------1.StaticMethod-------------------------------------");



        Function<Integer,Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        //using method reference

        Function<Integer,Double> functionMethodRef = Math::sqrt;
        System.out.println(functionMethodRef.apply(4));

        System.out.println("------------------------------");

        //lambda expr.

        BiFunction<Integer,Integer,Integer> biFunctionLambda = (a,b) -> MethodReferencesDemo.addition(a,b);
        System.out.println(biFunctionLambda.apply(5,6));

        //using method reference

        BiFunction<Integer,Integer,Integer> biFunctionMethodRef = MethodReferencesDemo::addition;
        System.out.println(biFunctionMethodRef.apply(5,6));

        System.out.println("------------------------------2.instanceMethod-------------------------------------");

        // 2.Reference to an instance method of a particular object ->> Object::instanceMethodName

        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();

        //lambda expr.
        Printable printable = (msg -> methodReferencesDemo.display(msg));
        printable.print("hello world");

        //using method reference
        Printable printableMethodRef = methodReferencesDemo::display;
        printableMethodRef.print("hello world");

        System.out.println("------------------------------3.SpecificType-------------------------------------");
        //Sometimes, we call a method of argument in the lambda expression
        //3.Reference to an instance method of arbitrary object of specific type ->> Class::instanceMethodName

        //Lambda
        Function<String,String> stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("JAVA"));

        //using method reference
        Function<String,String> stringFunctionMethodRef = String::toLowerCase;
        System.out.println( stringFunctionMethodRef.apply("JaVa") );


        //another ex:

        String[] strArray = { "A","E","I","O","U","a","e","i","o","u" };

        //using Lambda

        Arrays.sort(strArray,(s1,s2) -> s1.compareToIgnoreCase(s2));

        //using method ref

        Arrays.sort(strArray, String :: compareToIgnoreCase);

        System.out.println("------------------------------4.Constructor-------------------------------------");

        //    4.Reference to a constructor ->> ClassName::new

        List<String> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList("Banana","Apple","Mango","Watermelon"));

        Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        System.out.println(setFunction.apply(fruits));

        Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
        System.out.println(setFunctionMethodRef.apply(fruits));


        System.out.println("---------Convert list to map-----------------------------------");

        Function<String, String > function1 = ( s ) -> s.charAt(0) + "." + s.charAt(s.length()-1);

        Map<String,String> listToMap = convertListToMap(fruits,function1);
        System.out.println(listToMap);



    }

    private static Map<String, String> convertListToMap(List<String> fruits, Function<String, String> function1) {

        Map<String,String> map = new LinkedHashMap<>();

        //fruits.forEach(s -> map.put(s,function1.apply(s)));
        fruits.forEach(s -> map.put(function1.apply(s),s));

        return map;
    }


}

