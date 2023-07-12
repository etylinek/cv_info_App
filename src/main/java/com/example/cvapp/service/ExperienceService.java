package com.example.cvapp.service;


import com.example.cvapp.model.ExperienceModel;
import com.example.cvapp.repository.ExperienceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExperienceService {

    private ExperienceRepository experienceRepository;

    public void addExperience(ExperienceModel experienceModel){
        experienceRepository.save(experienceModel);
    }



}
