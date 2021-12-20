package com.innovart.cpve.award.application.service;

import com.innovart.cpve.award.application.repository.AwardRepository;
import com.innovart.cpve.award.persistence.dto.AwardPutDto;
import com.innovart.cpve.award.persistence.entity.Award;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AwardService {

    private AwardRepository awardRepository;

    public AwardService(AwardRepository awardRepository) {
        this.awardRepository = awardRepository;
    }

    public List<Award> getAllAwards(){
        return awardRepository.findAll();
    }

    public Award update(AwardPutDto newAwardPutDto, Long id) {
        return awardRepository.findById(id)
                .map(
                        award -> {
                            award.setName(newAwardPutDto.getName());
                            award.setDescription(newAwardPutDto.getDescription());
                            award.setAward(newAwardPutDto.getAward());
                            award.setStateActive(newAwardPutDto.getStateActive());
                            return awardRepository.save(award);
                        }
                ).get();
    }

    public Award logicalDelete(AwardPutDto newAwardPutDto, Long id) {
        return awardRepository.findById(id)
                .map(
                        award -> {
                            award.setStateActive(newAwardPutDto.getStateActive());
                            return awardRepository.save(award);
                        }
                ).get();
    }

    public Optional<Award> findById(Long id) {
        return awardRepository.findById(id);
    }
}
