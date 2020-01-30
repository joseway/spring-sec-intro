package com.adaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/authors")
public class AuthorController {

	@GetMapping(value="")
	public String authors(Model model) {
		model.addAttribute("title", "Authors");
		return "authors";
	}
}
