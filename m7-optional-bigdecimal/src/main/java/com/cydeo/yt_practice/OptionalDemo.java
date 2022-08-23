package com.cydeo.yt_practice;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        // of , empty , ofNullable  to create Optional object

        System.out.println("empty:");
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional); //Optional.empty

        System.out.println("--------------------------------------");
        System.out.println("of : ");

        String email = "can@gmail.com";
        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);//Optional[can@gmail.com]

        System.out.println("--------------------------------------");
        System.out.println();


    }

}
