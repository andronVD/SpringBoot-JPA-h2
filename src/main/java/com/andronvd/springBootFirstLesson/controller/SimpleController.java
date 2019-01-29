package com.andronvd.springBootFirstLesson.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

	@Value("${spring.application.name}")
	String appName;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		//throw new IllegalArgumentException();
		return "home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	void onIllegalArgException(IllegalArgumentException exception) {
		System.out.println("Hello world");
	}
	
}
