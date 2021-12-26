package com.innovart.cpve.contactsuser.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CPVE_CONTACTS_USERS")
public class ContactsUser {

    @Id
    @Column(name = "IDCONTACTS_USERS")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence-generator"
    )
    @SequenceGenerator(
            name = "sequence-generator",
            sequenceName = "SEC_IDCONTACTS",
            initialValue = 801,
            allocationSize=1
    )
    private Long idContactsUser;

    @Column(name = "IDUSERS")
    private Long idUser;

    @Column(name = "IDUSERCONTACT")
    private Long contact;

    @Column(name = "STATE_ACTIVE")
    private Integer stateActive;

}
