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
        switch (vehicle1){
            case CAR -> System.out.println("Car");
            case TRUCK -> System.out.println("Truck");
            case TRAIN -> System.out.println("Train");
            case PLANE -> System.out.println("Plane");
            case MOTORCYCLE -> System.out.println("Mototrcycle");
        }




    }





}
