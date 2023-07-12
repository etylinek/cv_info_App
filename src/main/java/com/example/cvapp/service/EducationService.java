package com.example.cvapp.service;

import com.example.cvapp.model.ExperienceModel;
import com.example.cvapp.repository.EducationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EducationService {
    private EducationRepository  educationRepository;


}
