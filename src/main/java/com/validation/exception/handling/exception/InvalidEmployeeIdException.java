package com.validation.exception.handling.exception;


import com.validation.exception.handling.model.dto.ExceptionResponse;
import org.springframework.http.HttpStatus;

public class InvalidEmployeeIdException extends GeneralException{

    public InvalidEmployeeIdException(ExceptionResponse exceptionResponse, HttpStatus httpStatus) {
        super(exceptionResponse, httpStatus);
    }

}
