package com.innovart.cpve.contactsuser.application.caseuse;

import com.innovart.cpve.contactsuser.application.service.ContactsUserService;
import com.innovart.cpve.contactsuser.persistence.entity.ContactsUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetContacts {

    private ContactsUserService contactsUserService;

    public GetContacts(ContactsUserService contactsUserService) {
        this.contactsUserService = contactsUserService;
    }

    public List<ContactsUser> getAll() {
        return contactsUserService.getAll();
    }

    public List<ContactsUser> findCotactsByUser(Long id) {
        return contactsUserService.findCotactsByUser(id);
    }

}
