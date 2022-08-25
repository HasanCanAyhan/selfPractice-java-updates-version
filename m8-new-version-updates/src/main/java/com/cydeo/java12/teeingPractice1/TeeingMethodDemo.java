package com.cydeo.java12.teeingPractice1;

import java.util.*;
import java.util.stream.Collectors;


//https://youtu.be/7GmIHdGptps
public class TeeingMethodDemo {

    public static void main(String[] args) {


        /*
        It is a new static method teeing to java.util.stream.Collectors interface which
        allows to collect using two independent collectors, then merge their results using the
        supplied BiFunction.
        Every element passed to the resulting collector is processed by both downstream
        collectors, then their results are merged using the specified merge function into the
        final result.

        Please note that this function helps in performing a certain task in single steps. We
        can already perform the given task in two steps if we do not use
        the teeing() function.
         */

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"A",43,100),
                new Employee(2,"B",28,200),
                new Employee(3,"C",27,300),
                new Employee(4,"D",68,400)
        );

        Map<String, Employee> youngestAndOldestEmployees = new HashMap<>();

        Employee youngest = employeeList.stream().min(Comparator.comparing(Employee::getAge)).get();
        Employee oldest = employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();

        youngestAndOldestEmployees.put("Youngest",youngest);
        youngestAndOldestEmployees.put("Oldest",oldest);

        System.out.println(youngestAndOldestEmployees);
        //{Oldest=Employee{id=4, name='D', age=68, salary=400}, Youngest=Employee{id=3, name='C', age=27, salary=300}}

        System.out.println("------------------------------------------");

        Map<String,Employee> teeingExample = employeeList.stream().collect(Collectors.teeing(

                Collectors.minBy(Comparator.comparing(employee -> employee.getAge())),//downstream1
                Collectors.maxBy(Comparator.comparing(employee -> employee.getAge())),//downstream2

                //BiFunction: takes 2 argument return any Object
                (young, old) -> {
                    Map<String,Employee> map = new HashMap<>();
                    map.put("Oldest", old.get());
                    map.put("Youngest", young.get());
                    return map;
                }

        ));


        System.out.println(teeingExample);




    }


}

