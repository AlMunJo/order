package com.joachim.order.service.users;

import com.joachim.order.domain.users.Admin;
import com.joachim.order.repository.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
        addDefaultAdmin();

    }

    private void addDefaultAdmin() {
        Admin adminDefault = new Admin("admin@admin.com");
        adminDefault.setPassword("password");
        this.adminRepository.addAdmin(adminDefault);
    }

}
