package com.cydeo.lesson.tasks.task2_byOzzy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {
     private String name;
     private boolean vegetarian;
     private int calories;
     private Type type;
}