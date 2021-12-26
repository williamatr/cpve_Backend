package com.innovart.cpve.categoriesuser.application.caseuse;

import com.innovart.cpve.categoriesuser.application.service.CategoriesUserService;
import com.innovart.cpve.categoriesuser.persistence.entity.CategoriesUser;
import org.springframework.stereotype.Component;

@Component
public class CreateCategoriesUser {

    CategoriesUserService categoriesUserService;

    public CreateCategoriesUser(CategoriesUserService categoriesUserService) {
        this.categoriesUserService = categoriesUserService;
    }

    public CategoriesUser saveCategoriesUser(CategoriesUser newCategoriesUser) {
        return categoriesUserService.saveCategoriesUser(newCategoriesUser);
    }
}
