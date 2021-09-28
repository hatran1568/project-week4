package com.project.api.exception;

import com.project.api.dto.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SampleExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({ConstraintViolationException.class})
    public ResponseEntity<ErrorResponse> handlerConstraintViolationEx(ConstraintViolationException ex){
        return new ResponseEntity<>(new ErrorResponse("001", ex.getMessage()), null, HttpStatus.FAILED_DEPENDENCY);
    }
}
