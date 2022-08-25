package com.cydeo.java14.yt_practice;

public class RecordExample {

    public static void main(String[] args) {

        Vehicle1 vehicle1 = new Vehicle1("Mercedes","UX 1238 A95");

        System.out.println(vehicle1.brand());
        System.out.println(vehicle1.licensePlate());

        System.out.println(vehicle1.toString());

        Vehicle1 vehicle2 = new Vehicle1("Mercedes","UX 1238 T95");

        System.out.println(vehicle1.brand().equals(vehicle2.brand()));

        System.out.println("--------------------------------");

        Vehicle2 vehicle_2 = new Vehicle2("Tesla");

        System.out.println( vehicle_2.brandAsLowerCase() );

        System.out.println("-------------------------------");

        Vehicle2 vehicle = new Vehicle2("bmw");
        String s = Vehicle2.brandAsUpperCase(vehicle);
        System.out.println(s);

    }

}
