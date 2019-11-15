package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	
	// Je dis à Thymeleaf qu'il doit fabriquer 
	// la vue en se basant sur le templates:
	// /src/main/resources/templates/index/html	
    @GetMapping("/")
    public String home() {
        return "index";
    }
   
    
}
