package com.innovart.cpve.report.application.service;

import com.innovart.cpve.report.application.dao.ReportsDAO;
import com.innovart.cpve.report.persistence.entity.Report;
import com.innovart.cpve.report.application.repository.ReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    private ReportRepository reportRepository;
    private ReportsDAO reportsDAO;

    public ReportService(ReportRepository reportRepository, ReportsDAO reportsDAO){
        this.reportRepository = reportRepository;
        this.reportsDAO = reportsDAO;
    }

    public List<Report> getAllReports(){
        return reportRepository.findAll();
    }

    public Boolean createReport(){
        return reportsDAO.createReports();
    }

}
