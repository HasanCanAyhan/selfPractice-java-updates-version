package com.cydeo.tasks.task2;

import java.util.Arrays;
import java.util.List;

public class Main { // QS 2

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        //int count2 = countIf(ci, new EvenPredicate());
        System.out.println("Number of odd integers = "+count);


    }

    //Write a generic method to count the number of elements in a collection
    public static <T> int countIf(List<T> list , UnaryPredicate<T> unaryPredicate ){
        int count = 0;

        for (T each : list) {

            if (unaryPredicate.test(each)){
                count++;
            }


        }


        return count;
    }


}
/*
Write a generic method to count the number of elements in a collection that
have a specific property (for example, odd integers, prime numbers).
Use following interface in your solution as well:

Sample output:
public interface UnaryPredicate<T> {
public boolean test(T obj);
}

List<Integer> ci = Arrays.asList(1, 2, 3, 4);
int count = countIf(ci, new OddPredicate());
System.out.println("Number of odd integers = " + count);
 */