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

        //based on weight : if you want to sort the object property, use comparing method

        //COMPARATOR.COMPARING Static Function : accepts a sort key Function and returns a Comparator for the type which contains the sort key

        //                                                  Function Interface
        Comparator<Apple> sortApple = Comparator.comparing( apple -> apple.getWeight()  );

        //sort method waiting for action, action is comparing method, then comparing method waiting implementation

        inventory.sort(sortApple);// sort method waiting for action
        System.out.println(inventory);

        System.out.println("------------Can I call the static method without ClassName : yes by importing-------------------------------------");

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






    }

}
