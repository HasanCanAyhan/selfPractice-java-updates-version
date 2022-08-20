package com.cydeo.yt_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

    public static void main(String[] args) {


        List<String> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList("Banana","Apple","Mango","Orange"));

        //Ascending order
      List<String> sortedList =  fruits
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println("sortedList = " + sortedList);

        System.out.println("------------------");
        //using sort(lambda expr.)
        List<String> sortedList1 =  fruits
                .stream()
                .sorted( (o1,o2) -> o1.compareTo(o2) )
                .collect(Collectors.toList());

        System.out.println("sortedList1 = " + sortedList1);

        System.out.println("------------------");

        //using just sort()

        List<String> sortedList2 =  fruits
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("sortedList2 = " + sortedList2);


        System.out.println("----------------------------");


        System.out.println("-----descending----------");

        List<String> sortedList3 =  fruits
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("sortedList3 = " + sortedList3);

        System.out.println("------------------");
        //using sort(lambda expr.)
        List<String> sortedList4 =  fruits
                .stream()
                .sorted( (o1,o2) -> o2.compareTo(o1) )
                .collect(Collectors.toList());

        System.out.println("sortedList4 = " + sortedList4);


        System.out.println("------------EMPLOYEE EXAMPLE--------------");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10,"Ramesh",30,400000));
        employees.add(new Employee(20,"Santosh",29,350000));
        employees.add(new Employee(30,"Sanjay",30,450000));
        employees.add(new Employee(40,"Pramod",29,500000));

        System.out.println("--------------------ASCENDING ORDER-----------------------------------");

       List<Employee> employeeSortedList =
               employees.stream()
                       .sorted((Employee o1, Employee o2) -> (int) (o1.getSalary() - o2.getSalary()))
                       .collect(Collectors.toList());

        System.out.println("employeeSortedList = " + employeeSortedList);


        System.out.println("--------------------ASCENDING ORDER-----------------------------------");
       // or : using Comparator :Ascending order
       
        List<Employee> employeeSortedList2 =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getSalary))
                        .collect(Collectors.toList());

        System.out.println("employeeSortedList2 = " + employeeSortedList2);


        System.out.println("--------------------DESCENDING ORDER-----------------------------------");

        List<Employee> employeeSortedList3 =
                employees.stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .collect(Collectors.toList());

        System.out.println("employeeSortedList3 = " + employeeSortedList3);





    }

}
