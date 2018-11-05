package com.rubchuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rubchuk.entity.Notebook;
import com.rubchuk.service.NotebookService;

@Controller
@SessionAttributes("notebookEntity")
@RequestMapping("/admin")
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
		return "redirect:/admin/listn";
	}
	@GetMapping("/listn")
	public String showListnPage(Model model) {
		model.addAttribute("notebooksList",notebookService.findAllNotebooks());
		return "admin/listn";
	}
	
	@GetMapping("/{notebookId}/deletenotebook")
	public String deleteNotebook(@PathVariable("notebookId") int notebookId) {
		notebookService.deleteTabletById(notebookId);
		return "redirect:/admin/listn";
	}
	@GetMapping("/{notebookId}/editnotebook")
	public String editNews(@PathVariable("notebookId") int notebookId , Model model) {
		model.addAttribute("notebookEntity",notebookService.findNotebookById(notebookId));
		return "admin/editn";
	}
	@PostMapping("/{notebookId}/editnotebook")
	public String saveEditedTeam(@ModelAttribute("notebookEntity") Notebook notebook) {
		notebookService.saveNotebook(notebook);
		return "redirect:/admin/listn";
	}
}
