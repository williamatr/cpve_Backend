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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategoriesUsers;

    @ManyToOne
    @JoinColumn(name = "IDUSERS", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "IDCATEGORIES", insertable = false, updatable = false)
    private Category category;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
