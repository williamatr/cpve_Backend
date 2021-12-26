package com.innovart.cpve.categoriesuser.persistence.entity;

import com.innovart.cpve.category.persistence.entity.Category;
import com.innovart.cpve.user.persistence.entity.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CPVE_CATEGORIES_USERS")
public class CategoriesUser {

    @Id
    @Column(name = "IDCATEGORIES_USERS")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_IDCATEGORIESUSER",
            initialValue = 501,
            allocationSize=1
    )
    private Long idCategoriesUsers;

    @Column(name = "IDUSERS")
    private Long idUser;

    @Column(name = "IDCATEGORIES")
    private Long idCategory;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
