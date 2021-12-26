package com.innovart.cpve.categoriesproject.application.caseuse;


import com.innovart.cpve.categoriesproject.application.service.CategoriesProjectService;
import com.innovart.cpve.categoriesproject.persistence.dto.CategoriesProjectPutDto;
import com.innovart.cpve.categoriesproject.persistence.entity.CategoriesProject;
import org.springframework.stereotype.Component;

@Component
public class UpdateCategoriesProject {

    CategoriesProjectService categoriesProjectService;

    public UpdateCategoriesProject(CategoriesProjectService categoriesProjectService) {
        this.categoriesProjectService = categoriesProjectService;
    }


    public CategoriesProject updateCategoriesProject(CategoriesProjectPutDto newCategoriesProject, Long id) {
        return categoriesProjectService.updateCategoriesProject(newCategoriesProject, id);
    }
}
