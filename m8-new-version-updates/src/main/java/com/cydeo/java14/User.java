package com.cydeo.java14;

public record User(String name, String address) {

    //private final


    // All ARG CONST
    // GETTER
    // TO STRING
    // EQUALS
    // HASH CODE

    public static String nameUpperCase(User user){

        return user.name.toUpperCase();

    }


}
