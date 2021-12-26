package com.innovart.cpve.contactsuser.application.caseuse;

import com.innovart.cpve.contactsuser.application.service.ContactsUserService;
import com.innovart.cpve.contactsuser.persistence.dto.ContactPutDto;
import com.innovart.cpve.contactsuser.persistence.entity.ContactsUser;
import org.springframework.stereotype.Component;

@Component
public class UpdateContacts {

    private ContactsUserService contactsUserService;

    public UpdateContacts(ContactsUserService contactsUserService) {
        this.contactsUserService = contactsUserService;
    }

    public ContactsUser updateContact(ContactPutDto newContact, Long id) {
        return contactsUserService.updateContact(newContact, id);
    }
}
