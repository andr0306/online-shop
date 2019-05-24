package com.diplom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.diplom.entity.Notebook;
import com.diplom.service.NotebookService;

@Controller
@SessionAttributes("notebookEntity")
@RequestMapping("/admin")
public class NotebookController {
	
	@Autowired
	private NotebookService notebookService;
	
	// контролер стрінка додання ноутбуків
	@GetMapping("/addn")
	public String showAddnPage (Model model) {
		model.addAttribute("notebook", new Notebook());
		return "admin/addn";
		
	}
	// контрлер збереження ноутбуків
	@PostMapping("/addn")
	public String saveNotebook(@ModelAttribute("notebook") Notebook notebook) {
		notebookService.saveNotebook(notebook);
		return "redirect:/admin/listn";
	}
	//контролер сторінка всіх ноутбуків
	@GetMapping("/listn")
	public String showListnPage(Model model) {
		model.addAttribute("notebooksList",notebookService.findAllNotebooks());
		return "admin/listn";
	}
	//контролер видалення ноутбука
	
	@GetMapping("/{notebookId}/deletenotebook")
	public String deleteNotebook(@PathVariable("notebookId") int notebookId) {
		notebookService.deleteTabletById(notebookId);
		return "redirect:/admin/listn";
	}
	//контролер сторінка реагування ноубуків, передаємо модель
	@GetMapping("/{notebookId}/editnotebook")
	public String editNotebook(@PathVariable("notebookId") int notebookId , Model model) {
		model.addAttribute("notebookEntity",notebookService.findNotebookById(notebookId));
		return "admin/editn";
	}
	// контролер збереження редагованого ноута, зберігаемо  модель
	@PostMapping("/{notebookId}/editnotebook")
	public String saveEditedNotebook(@ModelAttribute("notebookEntity") Notebook notebook) {
		notebookService.saveNotebook(notebook);
		return "redirect:/admin/listn";
	}
}
