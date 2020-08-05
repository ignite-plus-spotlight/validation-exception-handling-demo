package com.validation.exception.handling.service;

import com.validation.exception.handling.dao.EmployeeDao;
import com.validation.exception.handling.exception.RecordNotFoundException;
import com.validation.exception.handling.model.dto.ExceptionResponse;
import com.validation.exception.handling.model.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class EmployeeService {

    public Employee getEmployee(String empId) {
        Employee employee = EmployeeDao.getEmployeesData().get(empId);
        if (Objects.isNull(employee)) {
            throw new RecordNotFoundException(
                    ExceptionResponse
                    .builder()
                            .exceptionMessage("Employee Record Not found for Id : "+empId)
                            .exceptionCode("200")
                    .build(), HttpStatus.NOT_FOUND
            );
        }
        return employee;
    }
}
