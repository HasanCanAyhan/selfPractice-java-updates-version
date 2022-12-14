package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {


      /* Usage of default methods in the Interface
    Let's say that you have multiple classes that is implementing the same interface,
    instead of overriding the method and implementing it,
    by default all the classes implementing that interface will have the same implementation.
     */


    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date){
        validate(date);
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date){
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate): nextDate;
    }

    //private method
    private void validate(LocalDate date){
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
    }
}
