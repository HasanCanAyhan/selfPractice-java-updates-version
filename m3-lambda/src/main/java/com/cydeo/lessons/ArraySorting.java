package com.cydeo.lessons;

public class ArraySorting { // QuickSort,BubbleSort

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        // Before Java 8
        // Other says the method only print this implementation, it is not dynamic????

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs); // print QuickSort-impl
        as.sort(bs); // print BubbleSort-impl

        /*
        System.out.println("----------");
        Sorting sorting = new QuickSort();
        sorting.sort();
         */

        System.out.println("-------------------");

        //with lambda

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        //as.sort(() -> System.out.println("Quick Sorting")); same thing

        // we are trying to pass action directly to method -> (sort method here), with ready Interface, functional interface

        // with java 8 - you have access to bunch of ready functional interface.

    }


    //                   polymorphism
    private void sort(Sorting sorting){ // interface and allows different actions like OuickSort , BubbleSort
       sorting.sort();
    }

}
