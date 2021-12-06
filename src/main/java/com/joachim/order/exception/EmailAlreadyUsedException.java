package com.joachim.order.exception;

public class EmailAlreadyUsedException extends RuntimeException{
    public EmailAlreadyUsedException() {
    }

    public EmailAlreadyUsedException(String message) {
        super(message);
    }
}
