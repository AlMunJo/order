package com.joachim.order.repository;

import com.joachim.order.domain.users.Admin;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class AdminRepository {
    private final Map<String, Admin> admins;

    public AdminRepository() {
        this.admins = new ConcurrentHashMap<>();
    }

    public void addAdmin(Admin admin) {
        this.admins.put(admin.getUuid(), admin);
    }

    public Admin getAdminByEmail(String emailAddress) {
        return admins.values()
                .stream()
                .filter(customer -> customer.getEmailAddress().equals(emailAddress))
                .findFirst()
                .orElse(null);
    }
}
