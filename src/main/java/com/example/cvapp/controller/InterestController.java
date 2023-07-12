package com.example.cvapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interests")
public class InterestController {

    @GetMapping
    private String getIntrests(){
        return "interests/interests";
    }
}