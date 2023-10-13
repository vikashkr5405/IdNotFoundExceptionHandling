package com.vikash.IdNotFoundExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice

public class GlobalExceptionHandler
{
    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleException(IdNotFoundException ix)
    {
        HttpStatus status=HttpStatus.BAD_REQUEST;
        LocalDateTime timestamp= LocalDateTime.now();
        String message= ix.getMessage();

        ErrorResponse response=new ErrorResponse(status,timestamp,message);
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
}
