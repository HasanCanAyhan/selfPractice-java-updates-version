package com.cydeo.tasks.socialNetworkingApp;

public class MembersAge implements FeatureInterface{
    @Override
    public boolean test_sendingMessage(Members members) {
        if (members.getGender() == Gender.MALE){
            return members.getAge() > 18 && members.getAge() < 25;
        }

        return false;
    }
}
