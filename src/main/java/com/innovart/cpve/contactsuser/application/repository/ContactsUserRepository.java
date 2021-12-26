package com.innovart.cpve.contactsuser.application.repository;

import com.innovart.cpve.contactsuser.persistence.entity.ContactsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactsUserRepository extends JpaRepository<ContactsUser, Long> {

    @Query(value = "SELECT c FROM ContactsUser c WHERE c.idUser = ?1")
    List<ContactsUser> search(Long user);

}
