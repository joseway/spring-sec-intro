package com.adaming.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/books")
public class BookController {

	@GetMapping(value="")
	public String books(Model model) {
		model.addAttribute("title", "Books");
		return "books";
	}
}
