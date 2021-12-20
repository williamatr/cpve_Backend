package com.innovart.cpve.report.persistence.entity;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CPVE_REPORTS")
public class Report {

    @Id
    @Column(name = "IDEVENTS")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvent;

    @Column(name = "REPORT_NUMBER")
    private Integer reportNumber;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "OBJECTIVE")
    private String objective;

    @Column(name = "BENEFICIARY")
    private String beneficiary;

    @Column(name = "STATE_PROJECT")
    private String stateProject;

    @Column(name = "POST_DATE")
    private LocalDateTime postDate;

    @Column(name = "AUTHORS")
    private String author;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

}
