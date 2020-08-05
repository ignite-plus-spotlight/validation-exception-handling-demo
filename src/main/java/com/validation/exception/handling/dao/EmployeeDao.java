package com.validation.exception.handling.dao;

import com.validation.exception.handling.model.entity.Employee;

import java.util.Map;

public interface EmployeeDao {

    Map<String, Employee> employeeData =  Map
            .of(
                    "1", new Employee("1", "SaM", "sam@gmail.com"),
                    "2", new Employee("2", "Saurabh", "saurabh@gmail.com"),
                    "3", new Employee("3", "Gautham", "gautham@gmail.com")
            );

    static Map<String, Employee> getEmployeesData(){
        return employeeData;
    }
}
