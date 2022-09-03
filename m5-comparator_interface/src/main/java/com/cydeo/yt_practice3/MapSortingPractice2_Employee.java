package com.cydeo.yt_practice3;

import com.cydeo.yt_practice.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

//https://youtu.be/aiWP9OaMT-c

public class MapSortingPractice2_Employee {

    public static void main(String[] args) {


        Map<Employee,Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        });

        //using lambda
        //Map<Employee,Integer> employeeMap = new TreeMap<>( (o1,o2)-> (int) (o1.getSalary() - o2.getSalary()));

        employeeMap.put( (new Employee(10,"Karl",27,50_000)),60 );
        employeeMap.put( (new Employee(20,"Edu",30,55_000)),90 );
        employeeMap.put( (new Employee(30,"Can",29,43_000)),50 );
        employeeMap.put( (new Employee(40,"Sam",43,66_000)),40 );


        System.out.println(employeeMap);

        System.out.println("---------------------------------------------------------");

        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee :: getSalary)))
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getAge)))
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        //byValue
        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);


    }

}
