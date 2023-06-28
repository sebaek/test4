package com.example.study1.controller;

import com.example.study1.mapper.StudyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private StudyMapper mapper;

    @GetMapping("/home")
    public void home(Model model) {

        model.addAttribute("studyList", mapper.list());

    }
}
