package com.example.projet1.exception;

public class FilmNotfoundException extends RuntimeException {


    public FilmNotfoundException() {
        super();
    }

    public FilmNotfoundException(String message) {
        super(message);
    }

    public FilmNotfoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public FilmNotfoundException(Throwable cause) {
        super(cause);
    }
}
