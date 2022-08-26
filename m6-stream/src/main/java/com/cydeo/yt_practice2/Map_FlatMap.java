package com.cydeo.yt_practice2;

import java.util.List;
import java.util.stream.Collectors;

public class Map_FlatMap {

    public static void main(String[] args) {


        List<Customer> customers = CustomerDataBase.getAll();

        // convert List<String> -->>> Data Transformation

        //one to one mapping, because one customer has one email

        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);


        System.out.println("----------------------------------------------------");

        //FlatMap()

        //one to multiple , one customer has more phone numbers
        customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .forEach(System.out::println);




    }

}
