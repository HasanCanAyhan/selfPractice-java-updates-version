package com.cydeo.lesson.flatMap_vs_Map;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private int empId;
    private String empName;
    private String empEmail;

    private List<String> empPhoneNumbers; // .stream --->>> Stream<String>

}
