package com.innovart.cpve.training.application.caseuse;

import com.innovart.cpve.training.application.service.TrainingService;
import com.innovart.cpve.training.persistence.entity.Training;
import org.springframework.stereotype.Component;

@Component
public class CreateTraining {

    TrainingService trainingService;

    public CreateTraining(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    public Training saveTraining(Training newTraining) {
        return trainingService.saveTraining(newTraining);
    }


}
