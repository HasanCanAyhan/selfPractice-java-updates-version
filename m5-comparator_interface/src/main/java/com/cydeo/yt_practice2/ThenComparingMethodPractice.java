package com.cydeo.yt_practice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThenComparingMethodPractice {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Davis",30),
                new Employee("Martin",40),//
                new Employee("Alice",23),
                new Employee("Martin",25),//
                new Employee("Barry",34),
                new Employee("Martin",35),//
                new Employee("James",45)

        );

        System.out.println("before : ");
        employeeList.forEach(System.out::println);

        System.out.println("--------------------------------------");

        System.out.println("after : ");
        //first name then age
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);

        Collections.sort(employeeList,employeeComparator);
        employeeList.forEach(System.out::println);

    }


}
