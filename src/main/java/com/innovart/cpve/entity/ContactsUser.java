package com.innovart.cpve.entity;

import com.innovart.cpve.user.persistence.entity.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CPVE_CONTACTS_USERS")
public class ContactsUser {

    @Id
    @Column(name = "IDCONTACTS_USERS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContactsUser;

    @ManyToOne
    @JoinColumn(name = "IDUSERS", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "IDUSERCONTACT", insertable = false, updatable = false)
    private User contact;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
