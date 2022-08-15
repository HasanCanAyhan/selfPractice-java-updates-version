package com.cydeo;

public enum Currency {

    //Enum may implement many interfaces but can not extend any class
    //because it internally extends Enum class(java.lang.Enum)

    //Enum can not create any child class.Inheritance not applicable for Enums

    // Enum can have fields, constructors, methods

    // Enum can be easily used in switch

    PENNY,NICKLE,DIME,QUARTER;

    // PENNY is an object of currency class


}
