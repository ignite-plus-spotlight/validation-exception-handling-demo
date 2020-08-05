package com.validation.exception.handling.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionResponse {

    private String exceptionMessage;
    private String exceptionCode;
}
