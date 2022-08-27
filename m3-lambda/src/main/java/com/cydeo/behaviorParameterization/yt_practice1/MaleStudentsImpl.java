package com.cydeo.behaviorParameterization.yt_practice1;

public class MaleStudentsImpl implements StudentsFilter<Student>{
    @Override
    public boolean test(Student student) {
        return student.getGender().equals(Student.Gender.MALE);
    }
}
