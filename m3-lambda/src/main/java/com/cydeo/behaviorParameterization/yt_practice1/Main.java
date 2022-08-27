package com.cydeo.behaviorParameterization.yt_practice1;

import java.util.ArrayList;
import java.util.List;

import static com.cydeo.behaviorParameterization.yt_practice1.Student.Gender.FEMALE;
import static com.cydeo.behaviorParameterization.yt_practice1.Student.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add( new Student("Can",27, MALE) );
        studentList.add( new Student("Sam",28, MALE) );
        studentList.add( new Student("Lucy",29, FEMALE) );
        studentList.add( new Student("Michella",30, FEMALE) );


        getAllStudents(studentList,new MaleStudentsImpl());
        System.out.println("---------------------------------");
        getAllStudents(studentList,new FemaleStudentsImpl());


    }


    private static void getAllStudents(List<Student> studentList, StudentsFilter<Student> studentsFilter){

        studentList.stream().filter(student -> studentsFilter.test(student)).forEach(System.out::println);


    }


}
