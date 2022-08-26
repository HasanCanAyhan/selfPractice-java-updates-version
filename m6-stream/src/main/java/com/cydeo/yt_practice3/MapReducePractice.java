package com.cydeo.yt_practice3;

import com.cydeo.yt_practice.Employee;
import com.cydeo.yt_practice1.MyEmployee;

import java.util.Arrays;
import java.util.List;

//https://youtu.be/w-iwyp_A7e8

public class MapReducePractice {

    public static void main(String[] args) {

        List<MyEmployee> myEmployeeList = Arrays.asList(
                new MyEmployee("Sam",25,50_000),
                new MyEmployee("Ram",20,60_000),
                new MyEmployee("Tim",30,70_000),
                new MyEmployee("Kim",35,80_000)

        );

        // get employee whose age > 25
        //get salary
        //avg salary
        double avgSalary = myEmployeeList.stream()
                .filter(myEmployee -> myEmployee.getAge() > 25)
                .map(myEmployee -> myEmployee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

        System.out.println(avgSalary);


        System.out.println("----------------------------------------------");

        //sum of the salary

        double sumSalary = myEmployeeList.stream()
                .map(MyEmployee::getSalary)
                .mapToDouble(i -> i)
                .sum();

        System.out.println(sumSalary);


    }

}
