package com.cydeo.behaviorParameterization;

public class HeavyApplePredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 200;
    }
}
