package com.innovart.cpve.award.application.repository;

import com.innovart.cpve.award.persistence.entity.Award;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwardRepository extends JpaRepository<Award, Long> {


}
