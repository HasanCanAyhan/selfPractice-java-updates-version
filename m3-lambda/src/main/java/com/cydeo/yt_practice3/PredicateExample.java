package com.cydeo.yt_practice3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Person> predicate = (person) -> person.getAge() > 30;

        boolean result = predicate.test(new Person("can",32));
        System.out.println(result);



    }

}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Person{

    private String name;
    private int age;

}