package com.cydeo.java12.teeingPractice2;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://youtu.be/X4nJF2M-A44

public class TestTeeing {

    public static void main(String[] args) {


        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"A",43,100),
                new Employee(2,"B",28,200),
                new Employee(3,"C",27,300),
                new Employee(4,"D",68,400)
        );

       Map<String,List<Employee>>  mapTeeing = employeeList.stream().collect(
                Collectors.teeing(

                        Collectors.filtering(employee -> employee.getAge() > 43,Collectors.toList()),
                        Collectors.filtering(employee -> employee.getSalary() > 200,Collectors.toList()),


                        (ageList, salaryList)-> {

                            Map<String, List<Employee>> map = new HashMap<>();
                            map.put("Age : ", ageList);
                            map.put("Salary : ", salaryList);
                            return map;

                        }

                )
        );


        System.out.println(mapTeeing);

        System.out.println("---------------------------------------");


        List<Number> values = Stream.of(1, 2, 3, 4, 56, 7, 8, 9).collect(

                Collectors.teeing(

                        Collectors.summingInt(n -> (Integer) n),
                        Collectors.counting(),
                        (Integer sum, Long count) -> List.of(sum, count)


                )
        );

        System.out.println("Sum : " + values.get(0));
        System.out.println("Count : " + values.get(1));




    }

}
