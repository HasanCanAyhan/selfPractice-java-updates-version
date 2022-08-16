package com.cydeo.behaviorParameterization;

public class HeavyApple implements AppleFilter{
    @Override
    public boolean findApple(Apple apple) {
        return apple.getWeight() > 200;
    }
}
