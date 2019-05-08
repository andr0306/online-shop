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

import com.diplom.entity.Tablet;
import com.diplom.service.TabletService;

@Controller
@SessionAttributes("tabletEntity")
@RequestMapping("/admin")
public class TabletControler {
		
		@Autowired
		private TabletService tabletService;
		
		@GetMapping("/addt")
		public String showAddtPage (Model model) {
			model.addAttribute("tablet",new Tablet());
			return "admin/addt";
		}
		@PostMapping("/addt")
		public String saveTablet(@ModelAttribute("tablet")Tablet tablet) {
			tabletService.saveTablet(tablet);
			return "redirect:/admin/listt";
		}
		
		@GetMapping("/listt")
		public String showListtPage(Model model) {
			model.addAttribute("tabletsList",tabletService.findAllTablets());
			return "admin/listt";
			
		}
		@GetMapping("/{tabletId}/deletetablet")
		public String deleteTablet(@PathVariable("tabletId") int tabletId) {
			tabletService.deleteTabletById(tabletId);
			return "redirect:/admin/listt";
}
		@GetMapping("/{tabletId}/edittablet")
		public String editTablet(@PathVariable("tabletId") int tabletId , Model model) {
			model.addAttribute("tabletEntity",tabletService.findTabletById(tabletId));
			return "admin/editt";
		}
		@PostMapping("/{tabletId}/edittablet")
		public String saveEditedTablet(@ModelAttribute("tabletEntity") Tablet tablet) {
			tabletService.saveTablet(tablet);
			return "redirect:/admin/listt";
}
}