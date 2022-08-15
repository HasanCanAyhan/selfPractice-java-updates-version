package com.cydeo;

import java.util.ArrayList;

public class Main { // <Class Name> generics

    public static void main(String[] args) { // Banana,Customer,Student,String,Integer : we should use filtering

        //ArrayList items = new ArrayList();


        ArrayList<Integer> items = new ArrayList();
        // ArrayList only accept objects belongs to Integer class


        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Apple");


        printDoubled(items);


        System.out.println("----------------------------------------------------");

        FootballPLayer joe = new FootballPLayer("joe"); // joe registering himself to football player
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<SoccerPlayer> liverpool = new Team("liverpool"); // Team accepting any object
        //liverpool.addPlayer(joe);
        //liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        // but problem is liverpool is a soccer team, it should only accept soccer player, not baseball-football players















    }

    private static void printDoubled(ArrayList<Integer> items) {

        for ( Object  i :  items){
            System.out.println( (Integer) i * 2);
        }

    }


}
