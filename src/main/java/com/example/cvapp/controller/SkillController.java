package com.example.cvapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/skl")
public class SkillController {

    @GetMapping()
    private String getSkills(){
        return "skills/skills";
    }
}
