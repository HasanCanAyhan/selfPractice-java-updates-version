package com.cydeo.enumPractice;

import static com.cydeo.enumPractice.Season.*;

public class EnumTest {

    public static void main(String[] args) {

        //Accessing Enum Constants

        Season s = SPRING;
        System.out.println(s); // SPRING
        System.out.println(Season.WINTER);
        System.out.println(FALL);

        System.out.println("-----------------------");
        //values()--->>> return ARRAY

        Season[] seasons = Season.values();

        for (Season eachSeason : seasons) {
            System.out.println(eachSeason);
        }
        System.out.println("-----------------------");

        //ordinal() :
        //Returns the ordinal of the enumeration constants. Ordinal values are 0 based
        //like Array Index.

        System.out.println( SUMMER.ordinal()  ); // index: 2
        System.out.println(FALL.ordinal()); // index : 3

        System.out.println("-----------------------");

        //How to pass value to constructor? and get it

        for (Season season : values()) {

            System.out.println(season.getValue());

        }

        System.out.println("-----------------------");
        //switch Case

        seasonFind(SUMMER);

    }

    public static void seasonFind(Season season){


        String result = switch (season){

            case SPRING -> "Spring";
            case SUMMER -> "Summer";
            case FALL -> "Fall";
            case WINTER -> "Winter";
            default -> "Unknown season";
        };

        System.out.println("result = " + result);


    }


}
