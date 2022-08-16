package com.cydeo.behaviorParameterization;

public class GreenApple implements AppleFilter{

    @Override
    public boolean findApple(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
