package com.cydeo.yt_practice2;

//https://youtu.be/fCR1LcECWBk


interface Shape{
    void draw();
}

/*
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle class : draw() method ");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class : draw() method ");
    }
}

class Circle  implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class : draw() method ");
    }
}



 */

public class LambdaExample {

    public static void main(String[] args) {

        String str = "hello";

        Shape rectangle = () -> System.out.println("Rectangle class : draw() method ");
        rectangle.draw();

        Shape square = () -> System.out.println("Square class : draw() method ");
        square.draw();

        Shape circle = () -> System.out.println("Circle class : draw() method ");
        circle.draw();

    }

}