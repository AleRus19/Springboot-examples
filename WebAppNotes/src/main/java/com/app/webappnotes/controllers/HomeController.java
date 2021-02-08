package com.app.webappnotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "index.html";
	}

	@PostMapping("/home")
	public String createFolder(@RequestParam(name = "folderName") String folderName) {
		System.out.println("Folder = " + folderName);
		return "index";
	}

}
