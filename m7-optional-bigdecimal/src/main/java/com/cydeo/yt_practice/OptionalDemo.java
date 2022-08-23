package com.cydeo.yt_practice;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        // of , empty , ofNullable  to create Optional object

        System.out.println("empty:");
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional); //Optional.empty

        System.out.println("--------------------------------------");
        System.out.println("of : ");

        String email = "can@gmail.com";
        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);//Optional[can@gmail.com]

        System.out.println("--------------------------------------");
        System.out.println("ofNullable : ");

        Optional<String> stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional);//Optional[can@gmail.com] : object
        //get()
        System.out.println(stringOptional.get()); // can@gmail.com : value of the Optional object

        System.out.println("--------------------------------------------------------------");

        System.out.println("--------------------------------------");
        System.out.println("isPresent : ");

        if (stringOptional.isPresent()){ // to check if the object contains value or not
            System.out.println(stringOptional.get());
        }else{
            System.out.println("no value present");
        }

        System.out.println("--------------------------------------");
        System.out.println("orElse : ");

        String defaultOptional = stringOptional.orElse("default@gmail.com");
        System.out.println(defaultOptional); // because object is not null : can@gmail.com, if it is null : default@gmail.com

        System.out.println("--------------------------------------");
        System.out.println("orElseGet : "); // like orElse

        String defaultOptional2 = stringOptional.orElseGet( () -> "default@gmail.com"  );
        System.out.println(defaultOptional2); // can@gmail.com

        System.out.println("--------------------------------------");
        System.out.println("orElseThrow() : ");

        String optionalObject = stringOptional.orElseThrow( () -> new IllegalArgumentException("Email is not exist") );
        System.out.println(optionalObject); //can@gmail.com

        System.out.println("--------------------------------------");
        System.out.println("ifPresent() : ");

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyOptionall = Optional.empty();

        gender.ifPresent( s -> System.out.println("value is present") );//value is present
        emptyOptionall.ifPresent( s -> System.out.println(" no value present"));// will not executed

        System.out.println("--------------------------------------");
        System.out.println("filter() : ");

        // traditional
        String result = " abc ";
        if (result != null && result.contains("abc")){
            System.out.println(result);
        }

        System.out.println("--------------------");

        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter( res -> res.contains("abc") )
                .ifPresent( res -> System.out.println(res) );

        System.out.println("--------------------------------------");
        System.out.println("map() : ");

        // transform value in Optional from one to another

        Optional<String> optionalStr2 = Optional.of(result);
        optionalStr2.filter( res -> res.contains("abc") )
                .map( String::trim   )
                .ifPresent( res -> System.out.println(res) );


    }

}
