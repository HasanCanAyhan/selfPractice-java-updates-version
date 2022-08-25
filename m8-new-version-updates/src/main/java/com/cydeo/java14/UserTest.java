package com.cydeo.java14;

public class UserTest {

    public static void main(String[] args) {

        User user = new User("can","VA");

        System.out.println(user.name());
        System.out.println(user.address());
        System.out.println(user.toString());


        String str = User.nameUpperCase(user);
        System.out.println(str);

    }

}
