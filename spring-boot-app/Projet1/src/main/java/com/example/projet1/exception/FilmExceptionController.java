package com.example.projet1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FilmExceptionController {

    @ExceptionHandler(value = FilmNotfoundException.class)

    public ResponseEntity<Object> exception(FilmNotfoundException exception){
        return new ResponseEntity<>("Film not found", HttpStatus.NOT_FOUND);
    }
}
