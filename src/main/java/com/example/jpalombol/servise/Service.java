package com.example.jpalombol.servise;

import com.example.jpalombol.repository.CompanyRepository;
import com.example.jpalombol.repository.UserRepository;

public class Service {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public Service(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
