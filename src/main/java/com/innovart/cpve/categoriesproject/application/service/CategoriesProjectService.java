package com.innovart.cpve.categoriesproject.application.service;

import com.innovart.cpve.repository.CategoriesProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriesProjectService {

    private CategoriesProjectRepository categoriesProjectRepository;

    public CategoriesProjectService(CategoriesProjectRepository categoriesProjectRepository) {
        this.categoriesProjectRepository = categoriesProjectRepository;
    }

}
