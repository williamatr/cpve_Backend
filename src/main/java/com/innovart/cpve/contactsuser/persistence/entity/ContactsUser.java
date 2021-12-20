package com.innovart.cpve.contactsuser.persistence.entity;

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

    @Column(name = "IDUSERS")
    private Long userId;

    @Column(name = "IDUSERCONTACT")
    private Long contact;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
