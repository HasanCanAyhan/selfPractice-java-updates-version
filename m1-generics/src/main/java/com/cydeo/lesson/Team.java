package com.cydeo.lesson;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player > { // T is generics
    // T - can be any class - SoccerPlayer, FootballPlayer, BasketballPlayer

    // Team should accept only PLayer class and subclasses
    // T is child of Player



    private String name;

    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){

        if (members.contains(player)){
            System.out.println( ( (Player)player ).getName() + " is already on the team");
            //                      casting because java do not know which one it is
            return false;
        }else {
            members.add(player);
            System.out.println( ( (Player)player).getName() + " picked for team " + this.name);
            return true;
        }
    }



}
