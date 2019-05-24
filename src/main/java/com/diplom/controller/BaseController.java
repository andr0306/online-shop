package com.diplom.controller;

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

import com.diplom.domain.RegisterRequest;
import com.diplom.entity.Repair;
import com.diplom.mapper.UserMapper;
import com.diplom.service.NotebookService;
import com.diplom.service.PcService;
import com.diplom.service.RepairService;
import com.diplom.service.TabletService;
import com.diplom.service.UserService;

@Controller
@SessionAttributes("noteEntity")
public class BaseController {
	
	
	@Autowired private UserService userService;
	@Autowired private TabletService tabletService;
	@Autowired private NotebookService notebookService;
	@Autowired private PcService pcService;
	@Autowired private RepairService repairService;
	
	//контролер
	@GetMapping({"/", "/home"})
	public String showHome(Model model) {
		return "home";
	}
	//контролер
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}
	//контролер , створюємо юзера
	@GetMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("userModel",new RegisterRequest());
		return "register";
	}
	//контролер перевіряємо чи юзер існує і зберігаемо його
	@PostMapping("/register")
	public String saveUser(@Valid @ModelAttribute("userModel") RegisterRequest request , BindingResult br) {
		if(br.hasErrors()) {
			return "register";
		}
		userService.saveUser(UserMapper.registerToEntity(request));
		
		return "redirect:/login";
	}
	//контролер
		@GetMapping("admin")
		public String showAdminpage() {
		return "admin/admin";
	}
		//контролер передаемо всі планшети на сторінку tablet
		@GetMapping("/tablet")
		public String showTablets(Model model) {
		model.addAttribute("tablet",tabletService.findAllTablets());
		return "tablet";
	}
		//конролер передаємо всі ноутбуки на сторінку notebook
		@GetMapping("/notebook")
		public String showNotebooks(Model model) {
			model.addAttribute("notebook",notebookService.findAllNotebooks());
			return "notebook";
		}
		// контролер передаємо всі пк на сторінку pc
		@GetMapping("/pc")
		public String showPcs(Model model) {
		model.addAttribute("pc",pcService.findAllPcs());
		return "pc";
	}
		// контролер сторінка ремонту
		@GetMapping("/repair")
		public String showRepairPage (Model model) {
			model.addAttribute("repair",new Repair());
			return "repair";
		}
		//контроер зберігаемо заявку
		@PostMapping("/repair")
		public String saveRepair (@ModelAttribute("repair")Repair repair) {
			repairService.saveRepair(repair);
			return "redirect:/";
			
		}	
		// контролер передаємо вираний продукт в корзину
		@GetMapping("/{noteId}/basket")
		public String showBasket(@PathVariable("noteId")int noteId, Model model) {
			model.addAttribute("notebook",notebookService.findNotebookById(noteId));
			return "basket";
		}
		
		
}
