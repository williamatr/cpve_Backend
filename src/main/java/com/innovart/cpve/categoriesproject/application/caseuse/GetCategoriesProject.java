package com.innovart.cpve.categoriesproject.application.caseuse;

import com.innovart.cpve.categoriesproject.application.service.CategoriesProjectService;
import com.innovart.cpve.categoriesproject.persistence.entity.CategoriesProject;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetCategoriesProject {

    CategoriesProjectService categoriesProjectService;

    public GetCategoriesProject(CategoriesProjectService categoriesProjectService) {
        this.categoriesProjectService = categoriesProjectService;
    }


    public List<CategoriesProject> getByIdProject(Long id) {
        return categoriesProjectService.findByIdProject(id);
    }
}
