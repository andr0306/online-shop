package com.rubchuk.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubchuk.domain.RegisterRequest;
import com.rubchuk.entity.Repair;
import com.rubchuk.mapper.UserMapper;
import com.rubchuk.service.NotebookService;
import com.rubchuk.service.PcService;
import com.rubchuk.service.ProductService;
import com.rubchuk.service.RepairService;
import com.rubchuk.service.TabletService;
import com.rubchuk.service.UserService;

@Controller
public class BaseController {
	
	@Autowired private UserService userService;
	@Autowired private ProductService productService;
	@Autowired private TabletService tabletService;
	@Autowired private NotebookService notebookService;
	@Autowired private PcService pcService;
	@Autowired private RepairService repairService;
	
	@GetMapping({"/", "/home"})
	public String showHome(Model model) {
		model.addAttribute("product", productService.findAllProducts());
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
	
	
	
	@GetMapping("admin/adminpage")
	public String showAdminpage() {
		return "adminpage";
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
		System.out.println(pcService.findAllPcs().get(0).getImg());
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
		
}
