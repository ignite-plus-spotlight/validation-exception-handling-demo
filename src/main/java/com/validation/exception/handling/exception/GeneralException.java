package com.validation.exception.handling.exception;

import com.validation.exception.handling.model.dto.ExceptionResponse;
import lombok.Getter;
import org.springframework.http.HttpStatus;

public class GeneralException extends RuntimeException {
    @Getter
    private ExceptionResponse exceptionResponse;

    @Getter
    private HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;

    public GeneralException(ExceptionResponse exceptionResponse, HttpStatus httpStatus) {
        super(exceptionResponse.getExceptionMessage());
        this.exceptionResponse = exceptionResponse;
        this.httpStatus = httpStatus;
    }
}
