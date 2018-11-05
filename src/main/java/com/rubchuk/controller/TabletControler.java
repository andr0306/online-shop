package com.rubchuk.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubchuk.entity.Tablet;
import com.rubchuk.service.TabletService;

@Controller
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
		@GetMapping("/{tabletId}/delete")
		public String deleteTablet(@PathVariable("tabletId") int tabletId) {
			tabletService.deleteTabletById(tabletId);
			return "redirect:/admin/listt";
}
}