package com.cydeo.yt_practice;

import com.cydeo.lesson.MyComparator;

//https://youtu.be/2DOzWaVen4Q

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        /*

        1. we can create Custom Sort Class implement Comparator  :  Collections.sort(employees, new MySort());
        2. we can use ready method of ready Interface Comparator :USING ANONYMOUS CLASS : Collections.sort(employees, new Comparator<Employee>(...)
        3. we can use Lambda expression :  Collections.sort( employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        4. Comparator.comparing() with Stream API
           */


        //SortList

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);

        // classic way

        Collections.sort(list); // ascending order
        System.out.println("ascending list = " + list);

        System.out.println("-------------------------");

        Collections.reverse(list); // descending order
        System.out.println("descending list = " + list);

        System.out.println("---------------CUSTOM OBJECT USING BEHAVIOUR PARAMETERIZED---------------------------------------------");

        //Custom Object :Employee

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10,"Ramesh",30,400000));
        employees.add(new Employee(20,"Santosh",29,350000));
        employees.add(new Employee(30,"Sanjay",30,450000));
        employees.add(new Employee(40,"Pramod",29,500000));

        Collections.sort(employees, new MySort()); // ascending order
        System.out.println(" ascending order : " +employees);

        // descending order : in the MySort class you should change --->>>  return (int) (o2.getSalary() - o1.getSalary());


        System.out.println("--------------------USING ANONYMOUS CLASS------------------------------------");

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });

        System.out.println("ascending order ANONYMOUS Class : " +employees);

        // descending order : you should change --->>>  return (int) (o2.getSalary() - o1.getSalary());


        System.out.println("--------------------USING LAMBDA EXPR------------------------------------");

        Collections.sort( employees , ((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())) );
        System.out.println("USING LAMBDA EXPR ascending order : "+employees);

        System.out.println("-------------according to Name of Employee---------------------------");

        //compared To()
        Collections.sort( employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(employees);


    }

}

class MySort implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
