package com.validation.exception.handling.exception.handler;

import com.validation.exception.handling.exception.InvalidEmployeeIdException;
import com.validation.exception.handling.exception.RecordNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidEmployeeIdException.class)
    public ResponseEntity invalidEmployeeIdHandler(InvalidEmployeeIdException invalidEmployeeIdException){
        return ResponseEntity
                .status(invalidEmployeeIdException.getHttpStatus())
                .body(invalidEmployeeIdException.getExceptionResponse());
    }

    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity recordNotFoundException(RecordNotFoundException recordNotFoundException){
            return ResponseEntity
                    .status(recordNotFoundException.getHttpStatus())
                    .body(recordNotFoundException.getExceptionResponse())
                    ;
    }
}
