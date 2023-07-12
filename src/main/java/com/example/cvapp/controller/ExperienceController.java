package com.example.cvapp.controller;


import com.example.cvapp.model.ExperienceModel;
import com.example.cvapp.service.ExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@RequiredArgsConstructor
@Controller
@RequestMapping("/exp")
public class ExperienceController {

    private final ExperienceService experienceService;

    @GetMapping()
    public String getExperienceList(Model model) {
        List<ExperienceModel> experienceModelList = experienceService.getExperinceList();
        model.addAttribute("experienceModel", experienceModelList);
        return "experience/experience";
    }

    @GetMapping("/addExperience")
    public String getAddExperience() {
        return "experience/addExperience";
    }

    @PostMapping("/addExperience")
    public RedirectView postExperience(ExperienceModel experienceModel) {
        experienceService.addExperience(experienceModel);
        return new RedirectView("/exp");
    }


}
