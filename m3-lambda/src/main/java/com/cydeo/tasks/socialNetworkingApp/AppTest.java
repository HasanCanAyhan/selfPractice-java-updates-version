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


        message(membersList,new MaleMembers(),"wie geht es?");

        message(membersList,new MaleMembers(),"Fine");

        System.out.println("------------------------------------");

        System.out.println("With Lambda:");

        FeatureInterface test1 = members ->  members.getGender() == Gender.MALE;

        message(membersList,test1,"good job");

        FeatureInterface test2 = members -> {

            if (members.getGender() == Gender.MALE){
                return members.getAge() > 18 && members.getAge() < 25;
            }
            return false;
        };

        message(membersList,test2,"I am fine thanks");


    }

    private static void message(List<Members> membersList, FeatureInterface featureInterface,String message){

        for (Members members : membersList) {

            if (featureInterface.test_sendingMessage(members)){
                System.out.println(message + " is sent to " + members.getName());
            }


        }


    }



}
