package com.validation.exception.handling.controller;

import com.validation.exception.handling.model.entity.Employee;
import com.validation.exception.handling.service.EmployeeService;
import com.validation.exception.handling.util.InputValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable String employeeId){
        InputValidation.validateInputParameter(employeeId);
        return ResponseEntity
                .ok(employeeService.getEmployee(employeeId));
    }
}
