package com.cydeo.tasks.prettyPrintAppleTask;

public class AppleWeight implements AppleFilter{
    @Override
    public String test(Apple apple) {
        return "" + apple.getWeight();
    }
}
