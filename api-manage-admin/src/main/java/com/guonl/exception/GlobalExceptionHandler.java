package com.guonl.exception;

import com.guonl.model.FrontResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BusinessException.class)
    public FrontResult businessException(BusinessException e) {
        return FrontResult.error(-1, e.getMessage());
    }


}
