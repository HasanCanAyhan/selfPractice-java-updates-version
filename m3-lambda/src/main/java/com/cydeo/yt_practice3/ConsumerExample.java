package com.cydeo.yt_practice3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("Tony",45));
        list.add(new Person("Tom",55));
        list.add(new Person("Can",27));


        list.forEach( (person -> System.out.println(person.getName()) )  );

        System.out.println("---------------------------------------------");

        Consumer<Person> consumer = (person) -> {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        };

        consumer.accept(new Person("Can",33));


    }

}
