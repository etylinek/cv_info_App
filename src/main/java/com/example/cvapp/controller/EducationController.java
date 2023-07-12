package com.example.cvapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/edu")
public class EducationController {

    @GetMapping()
    private String getEducation(){
        return "education/education";
    }

}
