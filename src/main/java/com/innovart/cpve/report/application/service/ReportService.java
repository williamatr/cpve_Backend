package com.innovart.cpve.report.application.service;

import com.innovart.cpve.report.persistence.entity.Report;
import com.innovart.cpve.report.application.repository.ReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    private ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository){
        this.reportRepository = reportRepository;
    }

    public List<Report> getAllReports(){
        return reportRepository.findAll();
    }

}
