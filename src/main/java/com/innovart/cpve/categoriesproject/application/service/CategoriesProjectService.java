package com.innovart.cpve.categoriesproject.application.service;

import com.innovart.cpve.categoriesproject.application.repository.CategoriesProjectRepository;
import com.innovart.cpve.categoriesproject.persistence.dto.CategoriesProjectPutDto;
import com.innovart.cpve.categoriesproject.persistence.entity.CategoriesProject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesProjectService {

    private CategoriesProjectRepository categoriesProjectRepository;

    public CategoriesProjectService(CategoriesProjectRepository categoriesProjectRepository) {
        this.categoriesProjectRepository = categoriesProjectRepository;
    }

    public List<CategoriesProject> findByIdProject(Long id) {
        return categoriesProjectRepository.findByIdProject(id);
    }

    public CategoriesProject saveCategoriesProject(CategoriesProject newCategoriesProject) {
        CategoriesProject categoriesProjectNew = new CategoriesProject();
        categoriesProjectNew.setIdProject(newCategoriesProject.getIdProject());
        categoriesProjectNew.setIdCategory(newCategoriesProject.getIdCategory());
        categoriesProjectNew.setStateActive(1);
        return categoriesProjectRepository.save(categoriesProjectNew);
    }

    public CategoriesProject updateCategoriesProject(CategoriesProjectPutDto newCategoriesProject, Long id) {
        return categoriesProjectRepository.findById(id)
                .map(
                        categoriesproject ->{
                            categoriesproject.setStateActive(newCategoriesProject.getStateActive());
                            return categoriesProjectRepository.save(categoriesproject);
                        }
                ).get();
    }
}
