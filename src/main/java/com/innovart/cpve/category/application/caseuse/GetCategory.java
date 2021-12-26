package com.innovart.cpve.category.application.caseuse;

import com.innovart.cpve.category.application.service.CategoryService;
import com.innovart.cpve.category.persistence.entity.Category;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetCategory {

    CategoryService categoryService;

    public GetCategory(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    public Optional<Category> getById(Long id) {
        return categoryService.findById(id);
    }

    public List<Category> getAll() {
        return categoryService.findAll();
    }
}
