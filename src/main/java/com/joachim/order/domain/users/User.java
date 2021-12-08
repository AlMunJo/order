package com.joachim.order.domain.users;

import com.joachim.order.domain.Identifiable;
import com.joachim.order.service.validation.InputValidation;

public abstract class User extends Identifiable {
    private String emailAddress;
    private String password;
    private Role role;

    public User(String emailAddress,Role role) {
        this.role = role;
        this.emailAddress = emailAddress;
        this.password = null;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = InputValidation.emailValidation(emailAddress);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Role getRole(){
        return this.role;
    }
    public void setPassword(String password) {
        // put secure converter algorithm
        this.password = password;
    }

    public boolean testPassword(String password){
        //hash the password before
        return this.password.equals(password);
    }

}
