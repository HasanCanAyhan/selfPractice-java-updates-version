package com.cydeo.tasks.prettyPrintAppleTask;

public class AppleColor implements AppleFilter{


    @Override
    public String test(Apple apple) {
        return ""+apple.getColor();
    }
}
