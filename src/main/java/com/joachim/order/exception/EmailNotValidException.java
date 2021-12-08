package com.joachim.order.exception;

public class EmailNotValidException extends RuntimeException{
    public EmailNotValidException() {
    }

    public EmailNotValidException(String message) {
        super(message);
    }
}
