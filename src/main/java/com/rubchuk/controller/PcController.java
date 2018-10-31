package com.rubchuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubchuk.entity.Pc;
import com.rubchuk.entity.Tablet;
import com.rubchuk.service.PcService;
import com.rubchuk.service.TabletService;

@Controller
@RequestMapping("/admin/adminpage")
public class PcController {
	
	@Autowired
	private PcService pcService;
	
	@GetMapping("/addp")
	public String showAddpPage (Model model) {
		model.addAttribute("pc",new Pc());
		return "admin/addp";
	}
	@PostMapping("/addp")
	public String savePc(@ModelAttribute("pc")Pc pc) {
		pcService.savePc(pc);
		return "redirect:/admin/adminpage/listp";
	}
	
	@GetMapping("/listp")
	public String showListpPage(Model model) {
		model.addAttribute("pcsList",pcService.findAllPcs());
		return "admin/listp";
	}	
	@GetMapping("/{pcId}/delete")
	public String deleteTabletById (@PathVariable("pcId") int pcId) {
	pcService.deletePcById(pcId);
	return "redirect:/admin/adminpage/listp";
}
}		