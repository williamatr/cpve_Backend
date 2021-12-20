package com.innovart.cpve.training.application.caseuse;

import com.innovart.cpve.training.persistence.entity.Training;
import com.innovart.cpve.training.application.service.TrainingService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetTraining{

    private TrainingService trainingService;

    public GetTraining(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    public List<Training> getAll() {
        return trainingService.getAllTrainings();
    }

}
