package com.validation.exception.handling.exception;

import com.validation.exception.handling.model.dto.ExceptionResponse;
import org.springframework.http.HttpStatus;

public class RecordNotFoundException extends GeneralException{

    public RecordNotFoundException(ExceptionResponse exceptionResponse, HttpStatus httpStatus) {
        super(exceptionResponse, httpStatus);
    }
}
