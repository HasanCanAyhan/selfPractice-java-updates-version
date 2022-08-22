package com.cydeo.lesson;

import com.cydeo.lesson.tasks.task2.Dish;
import com.cydeo.lesson.tasks.task2.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        System.out.println("Reduce() : ");
        /*
        int sum = 0; ---->>> initial value
        for (Integer number : numbers) {
            sum = sum + number;
        }
         */
        int sum = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println("sum = " + sum);

        //if you do not put 0 as initial value , it returns Optional
        Optional<Integer> result = numbers.stream().reduce( (a,b) -> a+b  );
        System.out.println("result = " + result.get());

        System.out.println("-----------");

        //total Calories od Dishes
        //Dish object , first get the calories
        Optional<Integer> totalCalories = DishData.getAll().stream()
                .map(Dish::getCalories)
                //.reduce(0,(a,b) -> a+b);
                        .reduce(Integer::sum);

        System.out.println("totalCalories = " + totalCalories.get());

        System.out.println("-------");
        //Max and Min

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum2 =numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("total = " + sum2.get());

        System.out.println("-------------------------------------------");

        System.out.println("Count : ");

        long dishCount = DishData.getAll().stream().count(); // it counts how many object inside stream
        System.out.println(dishCount);


    }

}
