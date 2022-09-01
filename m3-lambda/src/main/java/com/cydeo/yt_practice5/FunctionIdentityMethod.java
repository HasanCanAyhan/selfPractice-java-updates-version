package com.cydeo.yt_practice5;

import com.cydeo.behaviorParameterization.yt_practice.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionIdentityMethod {

    public static void main(String[] args) {

        List<MyEmployee> myEmployeeList = Arrays.asList(
                new MyEmployee("Sam",25,50_000),
                new MyEmployee("Ram",20,60_000),
                new MyEmployee("Tim",30,70_000),
                new MyEmployee("Kim",35,80_000)

        );


        List<MyEmployee> empNameListInitials = applyIdentityToEmpList(myEmployeeList,Function.identity());

        empNameListInitials.forEach(System.out::println);




    }

    public static List<MyEmployee> applyIdentityToEmpList(List<MyEmployee> employeeList, Function<MyEmployee,MyEmployee> funcEmpToEmp ){

        List<MyEmployee> empNameList = new ArrayList<>();

        for (MyEmployee myEmployee : employeeList) {

            empNameList.add(funcEmpToEmp.apply(myEmployee));

        }

        return empNameList;

    }

}
