package com.innovart.cpve.categoriesuser.application.caseuse;

import com.innovart.cpve.categoriesuser.application.service.CategoriesUserService;
import com.innovart.cpve.categoriesuser.persistence.entity.CategoriesUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetCategoriesUser {

    CategoriesUserService categoriesUserService;

    public GetCategoriesUser(CategoriesUserService categoriesUserService) {
        this.categoriesUserService = categoriesUserService;
    }


    public List<CategoriesUser> getByIdUser(Long id) {
        return categoriesUserService.getByIdUser(id);
    }
}
