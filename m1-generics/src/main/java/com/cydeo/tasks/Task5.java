package com.cydeo.tasks;

public class Task5 {


    class Shape { }
    class Circle extends Shape {  }
    class Rectangle extends Shape {  }
    class Node<T> {  }

    public void main(String[] args) {

        Node<Circle> nc = new Node<>();
        //Node<Shape> ns = nc; // not compile because nc is only a object from Circle Class


    }


}
