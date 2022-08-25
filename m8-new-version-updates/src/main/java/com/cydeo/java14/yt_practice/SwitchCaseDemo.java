package com.cydeo.java14.yt_practice;

enum VehicleType{
    CAR,TRUCK,TRAIN,PLANE,MOTORCYCLE
}

public class SwitchCaseDemo {

    public static void main(String[] args) {

        //1.can be used as an expression
        //2.No need for break statements
        //3.Arrow Syntax(Lambda-like syntax)
        //4.Multiple cases per Line
        //5.Yield keyword to replace break when the returning a value

        VehicleType vehicle1 = VehicleType.MOTORCYCLE;
        switch (vehicle1){ //no break statement
            case CAR -> System.out.println("Car");
            case TRUCK -> System.out.println("Truck");
            case TRAIN -> System.out.println("Train");
            case PLANE -> System.out.println("Plane");
            case MOTORCYCLE -> System.out.println("Mototrcycle");
            default -> System.out.println("No match!");
        }

        System.out.println("-------------------------------");

        String dayOfTheWeek = "Wednesday";

        int result = switch (dayOfTheWeek){
            case "Monday" ->  1;
            case "Tuesday"-> 2;
            case "Wednesday"-> 3;
            case "Thursday"-> 4;
            case "Friday"-> 5;
            case "Saturday"-> 6;
            case "Sunday"-> 7;
            default -> 0;
        };

        System.out.println("The day of the week as a number is : " + result);


    }





}
