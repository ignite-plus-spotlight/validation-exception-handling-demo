package com.validation.exception.handling.util;


import com.validation.exception.handling.exception.InvalidEmployeeIdException;
import com.validation.exception.handling.model.dto.ExceptionResponse;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.http.HttpStatus;

public class InputValidation {
    private InputValidation() {}

    public static void validateInputParameter(String employeeId){
        if (! NumberUtils.isParsable(employeeId)){
            throw new InvalidEmployeeIdException(ExceptionResponse
                    .builder()
                    .exceptionMessage("Employee Id Should be Numeric")
                    .exceptionCode("100")
                    .build(), HttpStatus.BAD_REQUEST);
        }
    }
}
