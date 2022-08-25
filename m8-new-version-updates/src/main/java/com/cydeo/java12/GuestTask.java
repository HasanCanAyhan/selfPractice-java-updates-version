package com.cydeo.java12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestTask {

    public static void main(String[] args) {


        EventParticipation collect = Stream.of(
                        // Guest(String name, boolean participating, Integer participantsNumber)
                        new Guest("Marco", true, 3),
                        new Guest("David", false, 2),
                        new Guest("Roger", true, 6))

                .collect(Collectors.teeing(

                        Collectors.filtering(guest -> guest.isParticipating(),
                                Collectors.mapping(Guest::getName, Collectors.toList())),

                        //     Collectors.summingInt(Guest::getParticipantsNumber),// 11
                        Collectors.filtering(guest -> guest.isParticipating(), Collectors.summingInt(Guest::getParticipantsNumber)), // 9

                        (List<String> nameList, Integer totalGuest) -> {
                            EventParticipation eventParticipation = new EventParticipation(nameList, totalGuest);
                            return eventParticipation;
                        }


                ));


        System.out.println(collect);

        System.out.println("----------------------------------------------------------------");

        List<Guest> guestList = Arrays.asList(
                // Guest(String name, boolean participating, Integer participantsNumber)
                new Guest("Marco", true, 3),
                new Guest("David", false, 2),
                new Guest("Roger", true, 6)
        );


        List<String>  guestName_coming = guestList.stream()
                .filter(Guest::isParticipating)
                .map(Guest::getName)
                .collect(Collectors.toList());

        Integer total = guestList.stream()
                .filter(Guest::isParticipating)
                .collect(Collectors.summingInt(guest-> guest.getParticipantsNumber()));

      Map<String,List<String> >  map = new HashMap<>();

        String str = "Guest Name";

        map.put(str,guestName_coming);


        Map<Integer, Map<String,List<String>>>  map1 = new HashMap<>();

        map1.put(total,map);

        System.out.println("map1 = " + map1);

        for (Map<String, List<String>> value : map1.values()) {

            for (List<String> list : value.values()) {

                list.forEach(System.out::println);

            }


        }


    }

}
