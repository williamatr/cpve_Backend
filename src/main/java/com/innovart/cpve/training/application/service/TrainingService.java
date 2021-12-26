package com.innovart.cpve.training.application.service;

import com.innovart.cpve.training.persistence.entity.Training;
import com.innovart.cpve.training.application.repository.TrainingRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TrainingService {
    private TrainingRepository trainingRepository;

    public TrainingService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    public List<Training> getAllTrainings(){
        return trainingRepository.findAll();
    }



   public Optional<Training> findById(Long id) {
        return trainingRepository.findById(id);
    }

    public List<Training> getPageTrainings(@RequestParam int page, @RequestParam int size){
        List<Training> trainingsList = trainingRepository.findAll(PageRequest.of(page,size, Sort.by("idTraining").ascending())).getContent();
        return trainingsList;
    }

    public Training saveTraining(Training newTraining) {
        Training trainingNew = new Training();
        trainingNew.setIdUser(newTraining.getIdUser());
        trainingNew.setTitle(newTraining.getTitle());
        trainingNew.setContent(newTraining.getContent());
        trainingNew.setAbstracts(newTraining.getAbstracts());
        trainingNew.setStateActive(1);
        trainingNew.setPostDate(LocalDateTime.now());
        return trainingRepository.save(trainingNew);
    }

    public List<Training> findByIdUser(Long id) {
        return trainingRepository.findByIdUser(id);
    }
}
