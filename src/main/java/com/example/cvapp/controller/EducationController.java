package com.example.cvapp.controller;


import com.example.cvapp.model.EducationModel;
import com.example.cvapp.model.ExperienceModel;
import com.example.cvapp.service.EducationService;
import com.example.cvapp.service.ExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/edu")
public class EducationController {

    private final EducationService educationService;
//    @GetMapping()
//    private String getEducation(){
//        return "education/education";
//    }

    @GetMapping()
    public String getEducationList(Model model) {
        List<EducationModel> educationModelListModelList = educationService.getEducationList();
        model.addAttribute("educationModel", educationModelListModelList);
        return "education/education";
    }

    @GetMapping("/addEducation")
    public String getAddEducation() {
        return "education/addEducation";
    }

    @PostMapping("/addEducation")
    public RedirectView postEducation(EducationModel educationModel) {
        educationService.addEducation(educationModel);
        return new RedirectView("/edu");
    }

    @GetMapping("/editEducation/{id}")
    public String getEditEducation(@PathVariable Long id, Model model) {
        EducationModel educationModelById = educationService.getEducationModelById(id);
        model.addAttribute("educationModel", educationModelById);
        return "experience/editExperience";
    }

    @PostMapping("/editEducation/{id}")
    public RedirectView postEditEducation(@PathVariable Long id, EducationModel educationModel) {
        educationService.editEducation(educationModel);
        return new RedirectView("/edu");
    }

    @PostMapping("/deleteEducation/{id}")
    public  RedirectView postDeleteEducation(@PathVariable Long id){
        educationService.deleteEducation(id);
        return new RedirectView("/edu");
    }

}
