package com.diplom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diplom.service.RepairService;

@Controller
@RequestMapping("/admin")
public class RepairController {
	
	@Autowired
	private RepairService repairService;
	
	@GetMapping("/listr")
	public String showRepairListPage(Model model) {
		model.addAttribute("repairsList", repairService.findAllRepairs());
		return "admin/listr";
	}
	@GetMapping("/{repairId}/deleterepair")
	public String deleteRepair(@PathVariable("repairId") int repairId) {
		repairService.deleteRepairById(repairId);
		return "redirect:/admin/listr";
}
}
