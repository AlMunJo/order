package com.joachim.order.domain.users;

public class Admin extends User{
    public Admin(String emailAddress) {
        super(emailAddress, Role.ADMIN);
    }
}
