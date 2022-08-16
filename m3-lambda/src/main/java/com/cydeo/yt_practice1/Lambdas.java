package com.cydeo.yt_practice1;

public class Lambdas {

    public static void main(String[] args) {


        //Cat myCat = new Cat();
        //myCat.print();

        //printThing(myCat);


        //printThing( () -> System.out.println("Meow"));

        Printable lambdaPrintable = (s) -> System.out.println("Meow " + s) ;
        printThing(lambdaPrintable);



    }


    public static void printThing(Printable thing){
        thing.print("!");
    }


}
