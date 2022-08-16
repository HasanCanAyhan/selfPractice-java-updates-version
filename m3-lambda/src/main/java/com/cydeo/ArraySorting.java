package com.cydeo;

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



    }


    //                   polymorphism
    private void sort(Sorting sorting){ // interface and allows different actions like OuickSort , BubbleSort
       sorting.sort();
    }

}
