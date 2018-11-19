package com.rubchuk.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rubchuk.domain.RegisterRequest;
import com.rubchuk.entity.Notebook;
import com.rubchuk.entity.Repair;
import com.rubchuk.mapper.UserMapper;
import com.rubchuk.service.NotebookService;
import com.rubchuk.service.PcService;
import com.rubchuk.service.RepairService;
import com.rubchuk.service.TabletService;
import com.rubchuk.service.UserService;

@Controller
@SessionAttributes("noteEntity")
public class BaseController {
	
	
	@Autowired private UserService userService;
	@Autowired private TabletService tabletService;
	@Autowired private NotebookService notebookService;
	@Autowired private PcService pcService;
	@Autowired private RepairService repairService;
	
	@GetMapping({"/", "/home"})
	public String showHome(Model model) {
		return "home";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@GetMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("userModel",new RegisterRequest());
		return "register";
	}
	@PostMapping("/register")
	public String saveUser(@Valid @ModelAttribute("userModel") RegisterRequest request , BindingResult br) {
		if(br.hasErrors()) {
			return "register";
		}
		userService.saveUser(UserMapper.registerToEntity(request));
		
		return "redirect:/login";
	}
		@GetMapping("admin")
		public String showAdminpage() {
		return "admin/admin";
	}
		@GetMapping("/tablet")
		public String showTablets(Model model) {
		model.addAttribute("tablet",tabletService.findAllTablets());
		return "tablet";
	}
		@GetMapping("/notebook")
		public String showNotebooks(Model model) {
			model.addAttribute("notebook",notebookService.findAllNotebooks());
			return "notebook";
		}
		@GetMapping("/pc")
		public String showPcs(Model model) {
		model.addAttribute("pc",pcService.findAllPcs());
		return "pc";
	}
		@GetMapping("/repair")
		public String showRepairPage (Model model) {
			model.addAttribute("repair",new Repair());
			return "repair";
		}
		@PostMapping("/repair")
		public String saveRepair (@ModelAttribute("repair")Repair repair) {
			repairService.saveRepair(repair);
			return "redirect:/";
			
		}	
		@GetMapping("/{noteId}/basket")
		public String showBasket(@PathVariable("noteId")int noteId, Model model) {
			model.addAttribute("notebook",notebookService.findNotebookById(noteId));
			return "basket";
		}
		
		
}
