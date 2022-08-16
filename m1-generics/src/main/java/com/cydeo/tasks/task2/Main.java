package com.cydeo.tasks.task2;

import java.util.Arrays;
import java.util.List;

public class Main { // QS 2

    public static void main(String[] args) {

        // create Interface(generic)
        // create class implementing Interface
        // create method
        // get result


        List<Integer> ci = Arrays.asList(1, 2, 3, 4); // can be also Double etc... that's why countIf method should be generics
        int count = countIf(ci, new OddPredicate());
        //int count2 = countIf(ci, new EvenPredicate());
        System.out.println("Number of odd integers = "+count);


        //UnaryPredicate unaryPredicate = new OddPredicate();
        //UnaryPredicate unaryPredicate = new EvenPredicate(); it can be also...

    }

    //Write a generic method to count the number of elements in a collection
    public static <T> int countIf(List<T> list , UnaryPredicate<T> unaryPredicate ){ // we should this method generics, in order to use in the different Type like OddPredicate,EvenPredicate etc...
        //                                      it should be parent class interface in order to accept OddPredicate,EvenPredicate...
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