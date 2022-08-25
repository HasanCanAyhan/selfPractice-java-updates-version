package com.cydeo.java12;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTeeingDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"A",100),
                new Employee(2,"B",200),
                new Employee(3,"C",300),
                new Employee(4,"D",400)
        );

        //Max and Min Salary using teeing method

        Map<String , Employee > employeesHasMaxAndMinSalary = employeeList.stream().collect(

                Collectors.teeing( // getting 2 collectors

                        Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary())),// downstream1
                        Collectors.minBy(Comparator.comparing(employee -> employee.getSalary())),// downstream2

                        //BiFunction
                        (eMaxSalary, eMinSalary) -> {

                            Map<String, Employee> map = new HashMap<>();
                            map.put("Max",eMaxSalary.get());
                            map.put("Min",eMinSalary.get());
                            return map;
                        }

                )

        );


        System.out.println(employeesHasMaxAndMinSalary);

        System.out.println("--------------------------------------------");

        System.out.println("Without using teeing method");

        Employee employee_min = employeeList.stream().min(Comparator.comparing(Employee::getSalary)).get();
        Employee employee_max = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();

        Map<String, Employee> mapOfEmployees = new HashMap<>();
        mapOfEmployees.put("Max",employee_max);
        mapOfEmployees.put("Min",employee_min);

        System.out.println(mapOfEmployees);

    }


}

