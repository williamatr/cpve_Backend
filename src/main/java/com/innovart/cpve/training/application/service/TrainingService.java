package com.innovart.cpve.training.application.service;

import com.innovart.cpve.entity.Training;
import com.innovart.cpve.repository.TrainingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingService {
    private TrainingRepository trainingRepository;

    public TrainingService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    public List<Training> getAllTrainings(){
        return trainingRepository.findAll();
    }

}
