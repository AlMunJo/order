package com.joachim.order.domain.users;

import com.joachim.order.service.validation.InputValidation;

import javax.persistence.*;

@MappedSuperclass
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String emailAddress;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Role role;

    public User() {
    }

    public User(Role role){
        this.role = role;
    }

    public User(String emailAddress, Role role, String password) {
        this.role = role;
        this.emailAddress = emailAddress;
        this.setPassword(password);
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = InputValidation.emailValidation(emailAddress);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Role getRole() {
        return this.role;
    }

    public void setPassword(String password) {
        // put secure converter algorithm
        this.password = password;
    }

    public boolean testPassword(String password) {
        //hash the password before
        return this.password.equals(password);
    }

    public long getId() {
        return id;
    }
}
