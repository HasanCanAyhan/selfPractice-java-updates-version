package com.cydeo.behaviorParameterization.yt_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterization {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(

                new Employee("Can",27,100_000),
                new Employee("Sam",35,110_000),
                new Employee("John",32,90_000)

        );

        //employeeList.stream().filter( employee -> employee.getAge() > 30 ).forEach(System.out::println);

        //employeeList.stream().filter(employee -> employee.getSalary() > 90_000).forEach(System.out::println);


        Predicate<Employee> agePredicate = employee -> employee.getAge() > 30;
        Predicate<Employee> salaryPredicate = employee -> employee.getSalary() > 90_000;

        System.out.println( getEmployeeInformation(employeeList,agePredicate)  );

        System.out.println("------------------");


        System.out.println( getEmployeeInformation(employeeList,salaryPredicate) );


        System.out.println("------------OR : ---------------");


        getEmployeeInformation2(employeeList,agePredicate);
        System.out.println("--------------------------------");
        getEmployeeInformation2(employeeList,salaryPredicate);


    }

    private static List<Employee> getEmployeeInformation(List<Employee> list, Predicate<Employee> predicate  ){

        List<Employee> employees = new ArrayList<>();

        for (Employee employee : list) {

            if (predicate.test(employee)){
                employees.add(employee);
            }

        }

        return employees;

    }


    private static void getEmployeeInformation2(List<Employee> list, Predicate<Employee> predicate){

        list.stream().filter(predicate).forEach(System.out::println);

    }


}
