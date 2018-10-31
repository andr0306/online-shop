package com.rubchuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubchuk.entity.Repair;
import com.rubchuk.service.RepairService;

@Controller
@RequestMapping("/admin/adminpage")
public class RepairController {
	
	@Autowired
	private RepairService repairService;
	
	@GetMapping("/listr")
	public String showRepairListPage(Model model) {
		model.addAttribute("repairsList", repairService.findAllRepairs());
		return "admin/listr";
	}

}
