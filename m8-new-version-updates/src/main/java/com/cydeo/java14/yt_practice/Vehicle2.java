package com.cydeo.java14.yt_practice;

public record Vehicle2(String brand, String licensePlate) {

    public Vehicle2 {}

    public Vehicle2(String brand) {
        this(brand, null);
    }



    public String brandAsLowerCase(){ // instance method
        return brand.toLowerCase();
    }


    public static String brandAsUpperCase(Vehicle2 vehicle2){

        return vehicle2.brand.toUpperCase();
    }



}
