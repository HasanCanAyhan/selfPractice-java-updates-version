package com.cydeo.yt_practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapCollectExample {

    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User(1,"Ramesh","secrete","Ramesh@gmail.com"));
        users.add(new User(2,"Santosh","secrete1","Santosh@gmail.com"));
        users.add(new User(3,"Sanjay","secrete2","Sanjay@gmail.com"));

        //Before Java 8
        List<UserDTO> userDTOS = new ArrayList<>();
        for (User user : users) {
            userDTOS.add( new UserDTO(user.getId(), user.getUserName(), user.getEmail()) );
        }

        for (UserDTO userDTO : userDTOS) {
            System.out.println(userDTO);
        }


        System.out.println("----------After Java 8 : using stream().map()------------------");

        System.out.println("-------without Lambda---------------------------");
        users.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
            }
        })
                .forEach(System.out::println);


        System.out.println("------------using Lambda---------------------------------");

        Stream<UserDTO>  userDTOStream  = users.stream().map(user ->  new UserDTO(user.getId(), user.getUserName(), user.getEmail())  );
        userDTOStream.forEach(System.out::println);

        //or : you can write:

        /*
       users.stream().map(user ->  new UserDTO(user.getId(), user.getUserName(), user.getEmail())  )
               .forEach(System.out::println);
         */

        System.out.println("----If you want to convert Stream to List-->>>>> use .collect(Collectors.toList)--------");

       List<UserDTO> userDTOList =  users.stream().map(user -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
                .collect(Collectors.toList());

       userDTOList.forEach(System.out::println);

    }

}


@Getter
@Setter
@AllArgsConstructor
@ToString
class UserDTO{
    private int id;
    private String userName;
    private String email;
}


@Getter
@Setter
@AllArgsConstructor
@ToString
class User{
    private int id;
    private String userName;
    private String password;
    private String email;
}
