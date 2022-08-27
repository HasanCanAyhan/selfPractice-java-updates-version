package com.cydeo.yt_practice4;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

//https://youtu.be/FOJYM8q4X1k

public class BiFunction_AndThen {

    public static void main(String[] args) {

        //Client Test


        BiFunction<String, Integer, Integer > biFunction = (designation,age) ->  getSalaryByAgeAndDesign(designation, age);
        //BiFunction<String, Integer, Integer > biFunction = BiFunction_AndThen::getSalaryByAgeAndDesign;

        int salary = biFunction.apply("Manager",31);
        System.out.println(salary);

        salary = biFunction.apply("Developer",28);
        System.out.println(salary);

        System.out.println("----------------------------------");

        Function<Integer,String> function = (salry) -> getBandOnSalary(salry);
        //Function<Integer,String> function =  BiFunction_AndThen::getBandOnSalary;


        //Example of the andThen() method
        System.out.println("Example of the andThen() method : ");

        String salaryBand1 = biFunction.andThen(function).apply("Manager",31);
        System.out.println(salaryBand1);

        String salaryBand2 = biFunction.andThen(function).apply("Developer",26);
        System.out.println(salaryBand2);



    }

    private static String getBandOnSalary(Integer salry) {

        if (salry >= 100_000){
            return "Band 5";
        }else if (salry >= 80_000){
            return "Band 4";
        }else {
            return "Band 3";
        }
    }

    private static int getSalaryByAgeAndDesign(String designation, Integer age) {
        Optional<String> optionalDesignation = Optional.ofNullable(designation);
        Optional<Integer> optionalAge = Optional.ofNullable(age);

        if (optionalDesignation.get().equalsIgnoreCase("Manager") && optionalAge.get() > 30){
            return 120_000;
        } else if (optionalDesignation.get().equalsIgnoreCase("Developer") && optionalAge.get() > 25) {
            return 90_000;
        }else{
            return 0;
        }
    }


}
