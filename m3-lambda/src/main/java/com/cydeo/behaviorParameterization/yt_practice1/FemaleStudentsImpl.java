package com.cydeo.behaviorParameterization.yt_practice1;

public class FemaleStudentsImpl implements StudentsFilter<Student>{
    @Override
    public boolean test(Student student) {
        return student.getGender().equals(Student.Gender.FEMALE);
    }
}
