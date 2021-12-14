package com.innovart.cpve.award.application.service;

import com.innovart.cpve.repository.AwardRepository;
import org.springframework.stereotype.Service;

@Service
public class AwardService {

    private AwardRepository awardRepository;

    public AwardService(AwardRepository awardRepository) {
        this.awardRepository = awardRepository;
    }

}
