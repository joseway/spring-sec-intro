package com.adaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping(value="/")
	public String home(Model model) {
		model.addAttribute("title", "Welcome");
		return "index";
	}
	@GetMapping(value="/login")
	public String login() {
		return "login";
	}
}
