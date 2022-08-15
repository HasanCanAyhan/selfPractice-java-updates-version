package com.cydeo;

import java.util.ArrayList;

public class Main { // <Class Name> generics

    public static void main(String[] args) { // Banana,Customer,Student,String,Integer : we should use filtering

        //ArrayList items = new ArrayList();


        ArrayList<Integer> items = new ArrayList();
        // ArrayList only accept objects belongs to Integer class


        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Apple");


        printDoubled(items);

    }

    private static void printDoubled(ArrayList<Integer> items) {

        for ( Object  i :  items){
            System.out.println( (Integer) i * 2);
        }

    }


}
