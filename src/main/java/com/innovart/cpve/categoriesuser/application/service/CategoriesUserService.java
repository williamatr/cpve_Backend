package com.innovart.cpve.categoriesuser.application.service;

import com.innovart.cpve.repository.CategoriesUserRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriesUserService {

    private CategoriesUserRepository categoriesUserRepository;

    public CategoriesUserService(CategoriesUserRepository categoriesUserRepository) {
        this.categoriesUserRepository = categoriesUserRepository;
    }

}
