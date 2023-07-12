package com.example.cvapp.controller;


import com.example.cvapp.model.ExperienceModel;
import com.example.cvapp.service.ExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/experience")
public class ExperienceController {

    private ExperienceService experienceService;

    @GetMapping()
    private String getExperience(){
        return "experience/experience";
    }

    @PostMapping("/addExperience")
    private RedirectView postExperience(ExperienceModel experienceModel){
        experienceService.addExperience(experienceModel);
        return new RedirectView("experience/experience");
    }
}
