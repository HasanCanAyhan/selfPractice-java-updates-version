package com.cydeo.yt_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,2,1);

        // findFirst() and findAny() methods

        Optional<Integer> findElement = list.stream().findFirst();
        if (findElement.isPresent()){
            System.out.println(findElement.get()); // 1
        }else {
            System.out.println("stream is empty");
        }
        System.out.println("--------------");
        Optional<Integer> findAnyElement = list.stream().findAny();
        if (findAnyElement.isPresent()){
            System.out.println(findAnyElement.get());
        }else{
            System.out.println("stream is empty");//1
        }






    }

}
