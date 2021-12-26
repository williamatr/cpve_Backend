package com.innovart.cpve.contactsuser.application.service;

import com.innovart.cpve.contactsuser.application.repository.ContactsUserRepository;
import com.innovart.cpve.contactsuser.persistence.dto.ContactPutDto;
import com.innovart.cpve.contactsuser.persistence.entity.ContactsUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactsUserService {

    private ContactsUserRepository contactsUserRepository;

    public ContactsUserService(ContactsUserRepository contactsUserRepository){
        this.contactsUserRepository = contactsUserRepository;
    }

    public List<ContactsUser> getAll() {
        return contactsUserRepository.findAll();
    }

    public List<ContactsUser> findCotactsByUser(Long id) {
        return contactsUserRepository.search(id);
    }

    public ContactsUser saveContact(ContactsUser newContact) {
        ContactsUser contactNew = new ContactsUser();
        contactNew.setIdUser(newContact.getIdUser());
        contactNew.setContact(newContact.getContact());
        contactNew.setStateActive(1);
        return contactsUserRepository.save(contactNew);
    }

    public ContactsUser updateContact(ContactPutDto newContact, Long id) {
        return contactsUserRepository.findById(id)
                .map(contact -> {
                            contact.setStateActive(newContact.getStateActive());
                            return contactsUserRepository.save(contact);
                        }
                ).get();
    }
}
