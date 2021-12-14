package com.innovart.cpve.contactsuser.application.service;

import com.innovart.cpve.repository.ContactsUserRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactsUserService {

    private ContactsUserRepository contactsUserRepository;

    public ContactsUserService(ContactsUserRepository contactsUserRepository){
        this.contactsUserRepository = contactsUserRepository;
    }

}
