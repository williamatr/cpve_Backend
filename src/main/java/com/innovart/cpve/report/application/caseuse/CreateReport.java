package com.innovart.cpve.report.application.caseuse;

import com.innovart.cpve.report.application.service.ReportService;
import org.springframework.stereotype.Component;

@Component
public class CreateReport {

    ReportService reportService;

    public CreateReport(ReportService reportService) {
        this.reportService = reportService;
    }


}
