package com.innovart.cpve.report.web;

import com.innovart.cpve.report.application.service.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/report")
public class ReportRestController {

    ReportService reportService;

    @GetMapping("/create/")
    public ResponseEntity<?> createReport(){
        Map<String, Object> response = new HashMap<>();

        Boolean res = reportService.createReport();
        System.out.println(res);
        if(!res){
            response.put("status", res);
            response.put("message","Creacion de reporte fallo");

            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        } else{
            response.put("status",res);
            response.put("message","Creacion de reporte exitosa");
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

    }

}
