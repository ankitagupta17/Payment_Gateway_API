package com.demo.card;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String> getCustomException(CustomException e){
        return new ResponseEntity<>(e.getMessage(),e.getStatus());
    }
    
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> getDefaultException(Exception e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
