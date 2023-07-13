package com.example.cvapp.service;

import com.example.cvapp.model.EducationModel;
import com.example.cvapp.model.ExperienceModel;
import com.example.cvapp.repository.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EducationService {
    private final EducationRepository  educationRepository;

    public List<EducationModel> getEducationList() {
        return educationRepository.findAll();
    }

    public void addEducation(EducationModel educationModel) {
        educationRepository.save(educationModel);
    }public void editEducation(EducationModel editededucationModel) {
        educationRepository.save(editededucationModel);
    }

    public EducationModel getEducationModelById(Long id){
        return educationRepository.findById(id).orElse(null);
    }

    public void deleteEducation(Long id){
        educationRepository.deleteById(id);
    }


}
