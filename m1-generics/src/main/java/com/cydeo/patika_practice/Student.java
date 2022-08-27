package com.cydeo.patika_practice;

public class Student<T> implements IDatabase<T>{


    @Override
    public boolean insert(T data) {
        System.out.println("Data added");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Data deleted");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Data updated");
        return true;
    }

    @Override
    public void select(T data) {
        System.out.println("Data selected");
    }
}
