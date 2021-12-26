package com.innovart.cpve.contactsuser.application.caseuse;

import com.innovart.cpve.contactsuser.application.service.ContactsUserService;
import com.innovart.cpve.contactsuser.persistence.entity.ContactsUser;
import org.springframework.stereotype.Component;

@Component
public class CreateContacts {

    ContactsUserService contactsUserService;

    public CreateContacts(ContactsUserService contactsUserService) {
        this.contactsUserService = contactsUserService;
    }

    public ContactsUser saveContact(ContactsUser newContact) {
        return contactsUserService.saveContact(newContact);
    }
}
