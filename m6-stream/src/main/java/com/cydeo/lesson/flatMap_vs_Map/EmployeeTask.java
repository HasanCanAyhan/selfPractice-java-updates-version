package com.cydeo.lesson.flatMap_vs_Map;

import java.util.Collection;
import java.util.List;

public class EmployeeTask {

    public static void main(String[] args) {

        System.out.println("Print all emails: ");

        //map()
        //One-to-One mapping
        //EmployeeData.readAll() returns Stream, that s why we do not need to write stream() again
        EmployeeData.readAll()
                //.map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------");


        System.out.println("Print all phone numbers");

        /*
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);
        Result with map()
        Print all phone numbers
        [2022028765, 7038763425]
        [4122028765, 8998763425]
        [5162028765, 6198763425]
         */

        //flatMap() -->>> One to Many mapping

        EmployeeData.readAll()
                .flatMap( employee -> employee.getEmpPhoneNumbers().stream()) // it should return String
                .forEach(System.out::println);

        // to make a simple


        System.out.println("---------------2.Way With FlatMap()------------");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                //.flatMap(strings -> strings.stream())
                .flatMap(List::stream)
                .forEach(System.out::println);

    }


}
