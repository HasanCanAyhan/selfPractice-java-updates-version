package com.cydeo.yt_practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestTakeAfter_vs_DropAfter_Method {

    public static void main(String[] args) {

        List<MyEmployee> myEmployeeList = Arrays.asList(
                new MyEmployee("Sam",25,50_000),
                new MyEmployee("Ram",20,60_000),
                new MyEmployee("Tim",30,70_000),
                new MyEmployee("Kim",35,80_000)

        );


        //takeWhile _vs_dropWhile

        myEmployeeList.stream()
                .sorted(Comparator.comparing(MyEmployee::getAge))
                .takeWhile(myEmployee -> myEmployee.getAge() < 30)
                .forEach(System.out::println);

        System.out.println("-------------------------------------------");

        myEmployeeList.stream()
                .sorted(Comparator.comparing(MyEmployee::getSalary))
                .dropWhile(myEmployee -> myEmployee.getSalary()< 70_000 )
                .forEach(System.out::println);




    }


}
