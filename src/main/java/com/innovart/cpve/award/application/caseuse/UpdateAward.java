package com.innovart.cpve.award.application.caseuse;

import com.innovart.cpve.award.application.service.AwardService;
import com.innovart.cpve.award.persistence.dto.AwardPutDto;
import com.innovart.cpve.award.persistence.entity.Award;
import org.springframework.stereotype.Component;

@Component
public class UpdateAward {

    private AwardService awardService;

    public UpdateAward(AwardService awardService) {
        this.awardService = awardService;
    }

    public Award update(AwardPutDto newAwardPutDto, Long id) {
        return awardService.update(newAwardPutDto, id);
    }

}
