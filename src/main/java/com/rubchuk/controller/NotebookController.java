package com.rubchuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubchuk.entity.Notebook;
import com.rubchuk.service.NotebookService;

@Controller
@RequestMapping("/admin/adminpage")
public class NotebookController {
	
	@Autowired
	private NotebookService notebookService;
	
	@GetMapping("/addn")
	public String showAddnPage (Model model) {
		model.addAttribute("notebook", new Notebook());
		return "admin/addn";
		
	}
	@PostMapping("/addn")
	public String saveNotebook(@ModelAttribute("notebook") Notebook notebook) {
		notebookService.saveNotebook(notebook);
		return "redirect:/admin/adminpage/listn";
	}
	@GetMapping("/listn")
	public String showListnPage(Model model) {
		model.addAttribute("notebooksList",notebookService.findAllNotebooks());
		return "admin/listn";
	}
	
	
}
