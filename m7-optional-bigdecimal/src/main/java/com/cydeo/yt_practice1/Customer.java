package com.cydeo.yt_practice1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

//https://youtu.be/4BUKaazoYyg

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Customer {

    private int id;
    private String name;
    private String email;
    private List<String> phoneNumbers;





}
