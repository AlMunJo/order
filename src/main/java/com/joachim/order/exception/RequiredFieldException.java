package com.joachim.order.exception;

public class RequiredFieldException extends RuntimeException{
    public RequiredFieldException() {
    }

    public RequiredFieldException(String message) {
        super(message);
    }
}
