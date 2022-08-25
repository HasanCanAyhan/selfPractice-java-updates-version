package com.cydeo.yt_practice1;

//https://youtu.be/4BUKaazoYyg

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {


    public static Customer getCustomerByEmailId(String inputEmail) throws Exception {

        List<Customer> customers = CustomerDataBase.getAll();

        return customers.stream()
                .filter( customer -> customer.getEmail().equals(inputEmail) )
                .findAny().orElseThrow(  () -> new Exception("no customer present with this email id!") );

    }


    public static void main(String[] args) throws Exception {


        Customer customer = new Customer(101,"john",null, Arrays.asList("397937955","21654725"));

        //to create Optional object: empty/ of/ ofNullable

        Optional<Customer> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);//Optional.empty

        System.out.println("----------------------------------------------------------");
        //Optional<String> emailOptional = Optional.of(customer.getEmail());
        //System.out.println(emailOptional);

        System.out.println("----------------------------------------------------------");
        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        //System.out.println(emailOptional2.get()); you should not call directly get method!!

        System.out.println("1.Way to handle : isPresent && get");

        if (emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
        }

        System.out.println("---------------------");
        System.out.println("2.Way to handle : orElse");

        System.out.println(emailOptional2.orElse("default@email.com"));

        System.out.println("--------------------------");
        System.out.println("3.Way to handle : orElseThrow");

        //System.out.println(emailOptional2.orElseThrow( ()-> new IllegalArgumentException("email not resent") ));

        System.out.println("--------------------------");
        System.out.println("4.Way to handle : orElseGet()");

        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet( ()-> "default email..."  ));


        System.out.println("----------------Customer Example--------------------------------------");

        //getCustomerByEmailId("pqr"); // pqr email does not exist in the DataBase



    }

}
