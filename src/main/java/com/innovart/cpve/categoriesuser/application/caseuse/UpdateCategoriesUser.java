package com.innovart.cpve.categoriesuser.application.caseuse;

import com.innovart.cpve.categoriesuser.application.service.CategoriesUserService;
import com.innovart.cpve.categoriesuser.persistence.dto.CategoriesUserPutDto;
import com.innovart.cpve.categoriesuser.persistence.entity.CategoriesUser;
import org.springframework.stereotype.Component;

@Component
public class UpdateCategoriesUser {

    CategoriesUserService categoriesUserService;

    public UpdateCategoriesUser(CategoriesUserService categoriesUserService) {
        this.categoriesUserService = categoriesUserService;
    }

    public CategoriesUser updateCategoriesUser(CategoriesUserPutDto newCategoriesUser, Long id) {
        return categoriesUserService.updateCategoriesUser(newCategoriesUser, id);
    }
}
