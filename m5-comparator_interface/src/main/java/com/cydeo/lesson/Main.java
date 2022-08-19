package com.cydeo.lesson;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Comparator Interface
        //implementing Comparator.compare() method

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        System.out.println("----------------CREATING INTERFACE WHICH IMPLEMENT COMPARATOR---------------------------------------");

        //Ascending
        Collections.sort(list);
        System.out.println(list);

        //Descending
        //Collections.reverse(list);

        Collections.sort(list, new MyComparator()); // behavior parameterization
        System.out.println(list);

        //using Lambda
        Collections.sort(list, (o1,o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);

        System.out.println("--------------COMPARE TO METHOD--------------------------");

        //CompareTo() method

        //Ascending order

        list.sort( (o1,o2) -> o1.compareTo(o2) );
        System.out.println(list);

        System.out.println("---------------");

        //Descending order
        list.sort( (o2,o1) -> o1.compareTo(o2) );
        System.out.println(list);





    }

}
