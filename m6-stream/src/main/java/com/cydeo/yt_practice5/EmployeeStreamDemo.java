package com.cydeo.yt_practice5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://youtu.be/AFmyV43UBgc

public class EmployeeStreamDemo {

    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {

        employeeList.add(new Employee(111,"Can",32,"Male","HR",2011,25000));
        employeeList.add(new Employee(122,"Nemo",25,"Female","Sales And Marketing",2015,18000));
        employeeList.add(new Employee(133,"Josh",29,"Male","Product Development",2012,32500));
        employeeList.add(new Employee(144,"Diana",28,"Female","Sales And Marketing",2014,22700));

        //1.How many male and female employees
        method1();
        System.out.println("------------------");
        //2.print the name of all departments
        method2();
        System.out.println("------------------");
        //3.what is the average age of male and female employees
        method3();
        System.out.println("------------------");
        //4.get the highest paid employee
        System.out.println(method4());
        System.out.println("------------------");
        //5.get the names of all employees who have joined after 2015;
        method5();
        System.out.println("------------------");
        //6.count the number of employees in each department
        method6();
        System.out.println("------------------");
        //7.what is the average salary of each department
        method7();
        System.out.println("------------------");
        //8.get the youngest employee name
        method8();
        System.out.println("------------------");
        //9.Who has the most working experience
        method9();
        System.out.println("------------------");
        //12.List down the names of all employees in each department
        method12();
        System.out.println("------------------");
        //13.What is the average salary and total salary of the whole
        method13();
        System.out.println("------------------");
        //15.who is the oldest employee and which department he belongs to
        method15();
    }

    private static void method15() {
        Employee employee = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getAge).reversed())
                .findFirst().get();

        System.out.println(employee.department);

    }

    private static void method13() {

        /*
        Double avg = employeeList.stream().collect(Collectors.averagingDouble(employee -> employee.salary));
        Double total = employeeList.stream().mapToDouble(Employee::getSalary).sum();

        System.out.println(avg + " : " + total);
         */

        DoubleSummaryStatistics empSalaryStatics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(empSalaryStatics.getAverage());
        System.out.println(empSalaryStatics.getSum());


    }

    private static void method12() {

        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        for (String s : collect.keySet()) {

            System.out.println(s + " : ");

            collect.get(s).stream().forEach(employee -> System.out.println(employee.name));

        }

    }

    private static void method9() {
        Employee employee = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst().get();
        System.out.println(employee.name);

    }

    private static void method8() {
        Employee employee = employeeList.stream().min(Comparator.comparing(Employee::getAge)).get();
        System.out.println(employee.name);

    }

    private static void method7() {
        Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        collect.entrySet().stream().forEach(stringDoubleEntry -> System.out.println(stringDoubleEntry.getKey() + " : " + stringDoubleEntry.getValue()));

    }

    private static void method6() {
        Map<String, Long> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        collect.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

    }

    private static void method5() {

        employeeList.stream().filter(employee -> employee.yearOfJoining >= 2015)
                .forEach(employee -> System.out.println(employee.name));


    }

    private static Employee method4() {

        /*
        return employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst().get();


         */

        //or

        Optional<Employee> collect = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        return collect.get();
    }

    private static void method3() {

        Map<String, Double> avg = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println("avg = " + avg);
    }

    private static void method2() {

       employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

    }

    private static void method1() {

        Map<String, Long> genderMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(genderMap);

    }

}
