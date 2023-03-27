package com.validation.springBoot.validationPractice.Advice;

import com.validation.springBoot.validationPractice.Exception.userNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class Exception {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String ,String> handleInvalidArgument(MethodArgumentNotValidException ex) {
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                errorMap.put(error.getField(), error.getDefaultMessage())
        );
        return errorMap;
    } @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
       @ExceptionHandler(userNotFoundException.class)
       public Map<String,String>  handleBusinessException(userNotFoundException ex)
        {
            Map<String,String> error = new HashMap<>();
            error.put("message",ex.getMessage());
            return  error;
        }

}


