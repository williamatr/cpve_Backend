package com.innovart.cpve.contactsuser.application.caseuse;

import com.innovart.cpve.contactsuser.application.service.ContactsUserService;
import org.springframework.stereotype.Component;

@Component
public class UpdateContacts {

    private ContactsUserService contactsUserService;

    public UpdateContacts(ContactsUserService contactsUserService) {
        this.contactsUserService = contactsUserService;
    }
}
