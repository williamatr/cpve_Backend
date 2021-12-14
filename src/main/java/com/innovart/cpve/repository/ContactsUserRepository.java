package com.innovart.cpve.repository;

import com.innovart.cpve.entity.ContactsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsUserRepository extends JpaRepository<ContactsUser, Long> {

}
