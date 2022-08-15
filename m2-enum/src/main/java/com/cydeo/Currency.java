package com.cydeo;

public enum Currency {
    // enum is static - final , that`s why we can not put abstract and abstract methods inside it.

    //Enum may implement many interfaces but can not extend any class
    //because it internally extends Enum class(java.lang.Enum)

    //Enum can not create any child class.Inheritance not applicable for Enums

    // Enum can have fields, constructors, methods

    // Enum can be easily used in switch

    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);

    // PENNY is an object of currency class

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
