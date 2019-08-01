package edu.mum.cs.cs425.demowebapps.eRegistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

	@GetMapping(value = {"/", "/eRegistrar", "/eRegistrar/home"})
	public String displayHomePage() {
		return "home/index";
	}
}
