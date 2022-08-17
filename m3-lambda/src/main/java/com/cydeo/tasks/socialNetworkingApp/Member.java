package com.cydeo.tasks.socialNetworkingApp;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Member {

    private String name;
    private Gender gender;
    private int age;

}
