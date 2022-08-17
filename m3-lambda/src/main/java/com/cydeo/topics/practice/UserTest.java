package com.cydeo.topics.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mike","Smith",35));
        users.add(new User("Tom","Evan",25));
        users.add(new User("Emma","Pollard",55));

        // print all elements in the list

        Predicate<User> predicate = user ->  true;
        print(users,predicate);

        System.out.println("---------------------------------------------");

        //print all people that lastName starts with E

        Predicate<User> predicate1 = user -> user.getLastName().startsWith("E");
        print(users,predicate1);

        System.out.println("---------------------");

        //or:

        print(users,user -> true);
        System.out.println("--------");
        print(users, user -> user.getLastName().startsWith("E"));


    }

    //Write Method , do not use custom interface , use ready interface

    private static void print(List<User> userList , Predicate<User> predicate){

        for (User user : userList) {

            if (predicate.test(user)){
                System.out.println(user);
            }

        }

    }


}
