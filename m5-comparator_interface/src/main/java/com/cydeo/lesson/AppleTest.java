package com.cydeo.lesson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;


public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        //COMPARATOR.COMPARING Static Function : accepts a sort key Function and returns a Comparator for the type which contains the sort key

        //based on weight : if you want to sort the object property, use comparing method

        //                                                  Function Interface
        Comparator<Apple> sortApple = Comparator.comparing( apple -> apple.getWeight()  );

        //sort method waiting for action, action is comparing method, then comparing method waiting implementation

        inventory.sort(sortApple);// sort method waiting for action
        System.out.println(inventory);

        System.out.println("------------Can I call the static method without ClassName : yes by importing Class name-------------------------------------");

        //Can I call the static method without ClassName : yes by importing

        Comparator<Apple> sortApple2 = comparing( apple -> apple.getWeight()  );
        inventory.sort(sortApple2);
        System.out.println(inventory);

        //to simplify using method reference

        Comparator<Apple> sortAppleMethodRef = comparing( Apple::getWeight );
        inventory.sort(sortAppleMethodRef);
        //or:
        //inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);


        System.out.println("------DESCENDING-------------------");

        //Comparator interface includes a default method reversed that reverses the ordering of a given comparator.
        //using reverse() method

        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        System.out.println("------------CHAINING-----------------------");

        inventory.sort(comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor));

        System.out.println(inventory);


    }

}
