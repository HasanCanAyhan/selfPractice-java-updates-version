package com.cydeo.tasks.socialNetworkingApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppTest {

    public static void main(String[] args) {


        List<Members> membersList = new ArrayList<>();

        membersList.add(new Members("Can",Gender.MALE,24));
        membersList.add(new Members("Aras",Gender.FEMALE,17));
        membersList.add(new Members("Edu",Gender.FEMALE,26));
        membersList.add(new Members("Joe",Gender.MALE,22));

        MessageInterface mILambda = members -> members.getGender().equals(Gender.MALE)
                && members.getAge() >= 18 && members.getAge() <= 25;

        printMessage(membersList,mILambda);


    }

    private static void printMessage(List<Members> membersList, MessageInterface mI){

        for (Members eachMember : membersList) {

            if (mI.test_sendingMessage(eachMember)){
                System.out.println(eachMember);
            }

        }


    }

}
/*
Suppose that you are creating a social networking application. You want to
create a feature that enables an administrator to perform any kind of action,
such as sending a message, on members of the social networking application
that satisfy certain criteria.

Criteria : Send message to Male Members whose age is between 18 and 25
 */