package com.innovart.cpve.report.application.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.Map;

@Repository
public class ReportsDAO {

    JdbcTemplate jdbcTemplate;

    String PACKAGE = "PACK_REPORTS";

    String PROCEDURE_CREATE_REPORT = "CREATE_REPORT";

    public ReportsDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Boolean createReports(){
        boolean status_report;
        var simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withCatalogName(PACKAGE)
                .withProcedureName(PROCEDURE_CREATE_REPORT)
                .declareParameters(
                        new SqlOutParameter("OP_STATUS_REPORT", Types.INTEGER));
        Map<String, Object> out = simpleJdbcCall.execute();
        Integer op_status_report = (Integer) out.get("OP_STATUS_REPORT");
        status_report = op_status_report == 0;
        return status_report;
    }


}
