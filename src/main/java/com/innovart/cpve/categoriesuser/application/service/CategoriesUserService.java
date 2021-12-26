package com.innovart.cpve.categoriesuser.application.service;

import com.innovart.cpve.categoriesuser.application.repository.CategoriesUserRepository;
import com.innovart.cpve.categoriesuser.persistence.dto.CategoriesUserPutDto;
import com.innovart.cpve.categoriesuser.persistence.entity.CategoriesUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriesUserService {

    private CategoriesUserRepository categoriesUserRepository;

    public CategoriesUserService(CategoriesUserRepository categoriesUserRepository) {
        this.categoriesUserRepository = categoriesUserRepository;
    }

    public List<CategoriesUser> getByIdUser(Long id) {
        return categoriesUserRepository.getByIdUser(id);
    }

    public CategoriesUser saveCategoriesUser(CategoriesUser newCategoriesUser) {
        CategoriesUser categoriesUserNew = new CategoriesUser();
        categoriesUserNew.setIdUser(newCategoriesUser.getIdUser());
        categoriesUserNew.setIdCategory(newCategoriesUser.getIdCategory());
        categoriesUserNew.setStateActive(1);
        return categoriesUserRepository.save(categoriesUserNew);
    }

    public CategoriesUser updateCategoriesUser(CategoriesUserPutDto newCategoriesUser, Long id) {
        return categoriesUserRepository.findById(id)
                .map(
                        categoriesUser -> {
                            categoriesUser.setStateActive(newCategoriesUser.getStateActive());
                            return categoriesUserRepository.save(categoriesUser);
                        }
                ).get();
    }
}
