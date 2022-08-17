package com.cydeo.tasks.socialNetworkingApp;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {


        List<Member> membersList = new ArrayList<>();

        membersList.add(new Member("Can",Gender.MALE,24));
        membersList.add(new Member("Aras",Gender.FEMALE,17));
        membersList.add(new Member("Edu",Gender.FEMALE,26));
        membersList.add(new Member("Joe",Gender.MALE,22));

        //implementations for test method
        MessageInterface mILambda = member -> member.getGender() == (Gender.MALE)
                && member.getAge() >= 18 && member.getAge() <= 25;

        printMessage(membersList,mILambda);


    }

    private static void printMessage(List<Member> membersList, MessageInterface mI){

        for (Member eachMember : membersList) {

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