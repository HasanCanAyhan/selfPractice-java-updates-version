package com.cydeo.yt_practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDataBase {


    public static List<Customer> getAll(){

        return Stream.of(

                new Customer(101,"john","john@gmail.com", Arrays.asList("2344445","123444555")),
                new Customer(102,"smith","smith@gmail.com", Arrays.asList("34677","788765433")),
                new Customer(103,"peter","peter@gmail.com", Arrays.asList("344567","1237899")),
                new Customer(104,"kelly","kelly@gmail.com", Arrays.asList("98654333","87655443"))


        ).collect(Collectors.toList());


    }

}
