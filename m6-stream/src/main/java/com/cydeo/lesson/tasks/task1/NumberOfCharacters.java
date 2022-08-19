package com.cydeo.lesson.tasks.task1;

import java.util.Arrays;
import java.util.List;

public class NumberOfCharacters { // CharStreamTask

    public static void main(String[] args) {

        // given a list of words , print the number of characters for each word
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        // do smt on each element -->>> map
        words.stream()
                .map(each -> each.length())
                .forEach(System.out::println);




    }

}
