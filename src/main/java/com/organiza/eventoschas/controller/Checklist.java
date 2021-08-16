package com.organiza.eventoschas.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Checklist {
	
	@GetMapping
    public String showSignUpForm(Model model) {
        return "index";
    }


}
