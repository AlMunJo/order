package com.joachim.order.service.users;

import com.joachim.order.domain.users.Admin;
import com.joachim.order.repository.users.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl {
    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    private void addDefaultAdmin() {
        Admin adminDefault = new Admin("admin@admin.com","password");
        this.adminRepository.save(adminDefault);
    }

}
