package com.cydeo.yt_practice3;

import javax.swing.*;
import java.security.KeyStore;
import java.util.*;

public class MapSortingPractice {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("eight",8);
        map.put("four",4);
        map.put("ten",10);
        map.put("two",2);

        System.out.println(map);


        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        System.out.println(entries);

        //using new Comparator
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        entries.forEach( (entry) -> System.out.println(entry.getKey() + " : " + entry.getValue()) );


        System.out.println("---------------------------------");

        Collections.sort(entries, (o1,o2)-> o1.getValue() - o2.getValue() );

        System.out.println(entries);

        System.out.println("--------------------------------------------");

        System.out.println("------byKey-------");
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);

        System.out.println("------byValue-------");

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);



   }

}
