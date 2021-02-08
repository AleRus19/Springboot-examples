package com.app.webappnotes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.webappnotes.FolderRepository;
import com.app.webappnotes.models.Folder;

@Controller
public class HomeController {
	
	@Autowired
	FolderRepository folderRepository;

	@GetMapping("/home")
	public String home(Model model) {
		//((Model) model).addAttribute("folders", folderRepository.findAll());
		return "index.html";
	}

	@PostMapping("/home")
	public String createFolder(@RequestParam(name = "folderName") String folderName, Model model) {
		System.out.println("Folder = " + folderName);
		Folder newFolder = new Folder(folderName);
		folderRepository.save(newFolder);
	//	((Model) model).addAttribute("folders", folderRepository.findAll());
		return "index";
	}

}
