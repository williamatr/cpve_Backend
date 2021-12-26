package com.innovart.cpve.training.application.caseuse;

import com.innovart.cpve.training.persistence.entity.Training;
import com.innovart.cpve.training.application.service.TrainingService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Component
public class GetTraining{

    private TrainingService trainingService;

    public GetTraining(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    public List<Training> getAll() {
        return trainingService.getAllTrainings();
    }

    public Optional<Training> getById(Long id) {
        return trainingService.findById(id);
    }

    public List<Training> getPage(@RequestParam int page, @RequestParam int size) {
        return trainingService.getPageTrainings(page, size);
    }

    public List<Training> getByIdUser(Long id) {
        return trainingService.findByIdUser(id);
    }
}
