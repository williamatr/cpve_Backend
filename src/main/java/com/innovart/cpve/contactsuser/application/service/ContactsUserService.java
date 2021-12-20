package com.innovart.cpve.contactsuser.application.service;

import com.innovart.cpve.contactsuser.application.repository.ContactsUserRepository;
import com.innovart.cpve.contactsuser.persistence.entity.ContactsUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactsUserService {

    private ContactsUserRepository contactsUserRepository;

    public ContactsUserService(ContactsUserRepository contactsUserRepository){
        this.contactsUserRepository = contactsUserRepository;
    }

    public List<ContactsUser> getAllContacts() {
        return contactsUserRepository.findAll();
    }
    public List<ContactsUser> findCotactsByUser(Long id) {
        return contactsUserRepository.search(id);
    }


}
