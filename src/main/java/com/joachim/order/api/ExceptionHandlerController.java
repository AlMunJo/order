package com.joachim.order.api;

import com.joachim.order.exception.EmailAlreadyUsedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {
    private final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlerController.class);

    @ExceptionHandler(EmailAlreadyUsedException.class)
    protected void emailAddressInvalidException(EmailAlreadyUsedException emailException, HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value(), emailException.getMessage());
        LOGGER.error(emailException.getMessage(), emailException);
    }

    @ExceptionHandler(RuntimeException.class)
    protected void emailAddressInvalidException(RuntimeException emailException, HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value(), emailException.getMessage());
        LOGGER.error(emailException.getMessage(), emailException);
    }

}
