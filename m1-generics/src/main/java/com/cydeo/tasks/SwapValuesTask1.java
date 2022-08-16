package com.cydeo.tasks;

import java.util.Arrays;

public class SwapValuesTask1 { // Task 1

    public static void main(String[] args) {

        Integer[] a = {1,2,3,4};

        String[] b = {"Can","Aras","Edu","Emos"};

        Character[] c = {'A','B','C','D'};


        swap(c,0,2);


        //or second method
        //System.out.println(Arrays.toString(a));

    }

    public static <T> void swap(T[] arr, int index1, int index2){


        for (int i = 0; i < arr.length; i++) {

            if (i == index1){

                T temp = arr[i];

                arr[i] = arr[index2];

                arr[index2] = temp;

            }


        }

        System.out.println(Arrays.toString(arr));


    }


    /* another solution
    private static <T> void swap(T[] a , int i, int j){ // generics method

        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;


    }

     */


}
/*
Write a generic method to exchange the positions of two different elements in
array.

Integer[] a = {1,2,3,4};
swap(a,0,2);
System.out.println(Arrays.toString(a)); //[3,2,1,4]
 */