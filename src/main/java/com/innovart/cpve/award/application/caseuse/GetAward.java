package com.innovart.cpve.award.application.caseuse;

import com.innovart.cpve.award.application.service.AwardService;
import com.innovart.cpve.award.persistence.entity.Award;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class GetAward {

    private AwardService awardService;

    public GetAward(AwardService awardService) {
        this.awardService = awardService;
    }

    public List<Award> getAll() {
        return awardService.getAllAwards();
    }

    public Optional<Award> findById(Long id) {
        return awardService.findById(id);
    }

}
