package com.cydeo.behaviorParameterization;

public class GreenApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
