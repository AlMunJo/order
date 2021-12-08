package com.joachim.order.service.validation;

import com.joachim.order.exception.EmailNotValidException;
import com.joachim.order.exception.RequiredFieldException;

public class InputValidation {

    public static String emailValidation(String email) throws EmailNotValidException {
        if (emailIsValid(email))
            return email;
        throw new EmailNotValidException(email + " is not valid");
    }

    public static String stringValidation(String stringNotNullAndNotEmpty) throws RequiredFieldException {
        if (stringNotNullAndNotEmpty != null && !stringNotNullAndNotEmpty.isEmpty())
            return stringNotNullAndNotEmpty;
        throw new RequiredFieldException("is required.");
    }

    private static boolean emailIsValid(String email) {
        String regex = "^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
}
