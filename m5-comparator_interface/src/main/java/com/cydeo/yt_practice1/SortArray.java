package com.cydeo.yt_practice1;

import com.cydeo.yt_practice.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray {

    public static void main(String[] args) {

        //sort Array of employee objects using Comparator interface

        Employee[] employees = {
            new Employee(10,"Karl",27,50_000),
            new Employee(20,"Edu",28,55_000),
            new Employee(30,"Can",29,43_000)
        };

        System.out.println("Before sorting ==>> " + Arrays.toString(employees));
        //Ascending order
        Arrays.sort(employees,new SortEmployeeeBySalary());
        System.out.println("After sorting ==>> " + Arrays.toString(employees));

        System.out.println("---------------------------------------");

        System.out.println("Before sorting ==>> " + Arrays.toString(employees));
        Arrays.sort(employees,new SortEmployeeeByName());
        System.out.println("After sorting ==>> " + Arrays.toString(employees));

        System.out.println("--------------------------USING LAMBDA EXPR--------------------------------------------------");

        System.out.println("Before sorting ==>> " + Arrays.toString(employees));
        Arrays.sort(employees, (e1, e2) -> (int)( e1.getSalary() - e2.getSalary()));
        System.out.println("After sorting ==>> " + Arrays.toString(employees));


        System.out.println("---------------------------------------");

        //ByName

        System.out.println("Before sorting ==>> " + Arrays.toString(employees));
        Arrays.sort(employees, (e1,e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println("After sorting ==>> " + Arrays.toString(employees));


    }

}

class SortEmployeeeBySalary implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getSalary() - o2.getSalary()) ; // ascending order
    }
}


class SortEmployeeeByName implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
