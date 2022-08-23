package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx= new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = Arrays.asList(va,tx);

        //Suppose we have a State class that contains list of cities. Create a list
        //of States and print all the cities.

        list.stream()
                .flatMap(state -> state.getCities().stream())
                .forEach(System.out::println);
        System.out.println("------------OR-------------------");

        list.stream()
                .map(state -> state.getCities())
                .flatMap(List::stream)
                .forEach(System.out::println);

    }


}
