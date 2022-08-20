package com.cydeo.lesson.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(1,2,3,4));

        print(a);


    }

    //Will the following method compile? If not, why? it will work properly, because we extend Number, only accept this type

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }


}
