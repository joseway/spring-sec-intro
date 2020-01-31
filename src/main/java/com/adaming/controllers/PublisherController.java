package com.adaming.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/publishers")
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class PublisherController {

	@GetMapping(value="")
	public String publishers(Model model) {
		model.addAttribute("title", "Publishers");
		return "publishers";
	}
}
