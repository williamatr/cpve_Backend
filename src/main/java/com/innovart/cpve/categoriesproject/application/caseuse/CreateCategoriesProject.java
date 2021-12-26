package com.innovart.cpve.categoriesproject.application.caseuse;

import com.innovart.cpve.categoriesproject.application.service.CategoriesProjectService;
import com.innovart.cpve.categoriesproject.persistence.entity.CategoriesProject;
import org.springframework.stereotype.Component;

@Component
public class CreateCategoriesProject {

    CategoriesProjectService categoriesProjectService;

    public CreateCategoriesProject(CategoriesProjectService categoriesProjectService) {
        this.categoriesProjectService = categoriesProjectService;
    }


    public CategoriesProject saveCategoriesProject(CategoriesProject newCategoriesProject) {
        return categoriesProjectService.saveCategoriesProject(newCategoriesProject);
    }
}
