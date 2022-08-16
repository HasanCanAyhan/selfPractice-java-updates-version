package com.cydeo.yt_practice1;

public class Lambdas {

    public static void main(String[] args) {


        Cat myCat = new Cat();
        //myCat.print();

        printThing(myCat);

    }


    public static void printThing(Printable thing){
        thing.print();
    }


}
