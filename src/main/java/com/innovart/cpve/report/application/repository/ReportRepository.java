package com.innovart.cpve.report.application.repository;

import com.innovart.cpve.report.persistence.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {
}
