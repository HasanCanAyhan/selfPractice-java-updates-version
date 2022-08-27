package com.cydeo.yt_practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

public class MethodReferenceExample {

    public static void main(String[] args) {

        //1. reference to a static method --->>> ContainingClass::staticMethodName
        //2. reference to a constructor --->>> ClassName::new
        //3. reference to an instance method of an arbitrary object(String,Integer) --->>> ContainingType::methodName
        //4. reference to an instance method  --->>> ContainingObject::instanceMethodName

        System.out.println("reference to a static method");

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable command = MethodReferenceExample::myRun;
        executorService.execute(command);

        System.out.println("---------------------------------------");

        System.out.println("reference to instance method of an particular object  ");

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Can",27));
        persons.add(new Person("Bean",28));
        persons.add(new Person("Sam",29));
        persons.add(new Person("Artur",25));


        List<String>  personNames =  MethodReferenceExample.getPersonsName(persons, Person::getName);
        personNames.forEach(System.out::println);

        System.out.println("---------------------------------------");

        System.out.println("reference to instance method of an arbitrary  ");

        persons.forEach(System.out::println);


    }

    private static List<String> getPersonsName(List<Person> persons, Function<Person, String> f) {

        List<String>  result = new ArrayList<>();

        persons.forEach( n -> result.add(f.apply(n)));


        return result;

    }


    private static void myRun() {
      System.out.println("My Task is running");
    }

}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
