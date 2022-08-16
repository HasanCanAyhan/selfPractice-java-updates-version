package com.cydeo.tasks.socialNetworkingApp;

public class MaleMembers implements FeatureInterface{

    @Override
    public boolean test_sendingMessage(Members members) {
        return members.getGender() == Gender.MALE ;
    }
}
