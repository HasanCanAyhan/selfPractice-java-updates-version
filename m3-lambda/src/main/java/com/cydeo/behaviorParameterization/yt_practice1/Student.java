package com.cydeo.behaviorParameterization.yt_practice1;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {

    private String name;
    private Integer age;
    private Gender gender;





    public static enum Gender{
        MALE,FEMALE
    }

}



