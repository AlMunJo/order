package com.joachim.order.domain.users;

import javax.persistence.Entity;

@Entity
public class Admin extends User{
    public Admin(String emailAddress,String password) {
        super(emailAddress, Role.ADMIN,password);
    }

    public Admin() {
        super(Role.ADMIN);
    }
}
