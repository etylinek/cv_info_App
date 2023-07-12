package com.example.cvapp.service;


import com.example.cvapp.model.ExperienceModel;
import com.example.cvapp.repository.ExperienceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExperienceService {

    private final ExperienceRepository experienceRepository;

    public List<ExperienceModel> getExperinceList() {
        return experienceRepository.findAll();
    }

    public void addExperience(ExperienceModel experienceModel) {
        experienceRepository.save(experienceModel);
    }public void editExperience(ExperienceModel editedExperienceModel) {
        experienceRepository.save(editedExperienceModel);
    }

    public ExperienceModel getExperienceModelById(Long id){
        return experienceRepository.findById(id).orElse(null);
    }

    public void deleteExperience(Long id){
        experienceRepository.deleteById(id);
    }

}
