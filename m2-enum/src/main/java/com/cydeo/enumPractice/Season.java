package com.cydeo.enumPractice;

public enum Season {

    WINTER(1),SPRING(2),SUMMER(3),FALL;

    //Enum can have constructor. For each enum constant(Object), constructor will
    //be executed.

    int value;

    Season(int value){
        this.value = value;
    }

    Season(){
        this.value = 4;
    }

    public int getValue() {
        return value;
    }
}
