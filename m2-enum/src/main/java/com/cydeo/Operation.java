package com.cydeo;

public enum Operation {

    PLUS,MINUS,MULTIPLY,DIVIDE; // each constant is object(new) of operation


    // we can not put public by creating Constructor
    private Operation() {
        // 4 times executed because each of them is object of Operation
        //Enum can have constructor.
        // For each enum constant(Object), constructor will be executed.
        System.out.println("Constructor");
    }
}
