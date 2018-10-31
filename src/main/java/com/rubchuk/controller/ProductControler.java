		package com.rubchuk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubchuk.entity.Product;
import com.rubchuk.service.ProductService;
import com.rubchuk.service.impl.ProductServiceImpl;



@Controller
@RequestMapping("/admin/adminpage")
public class ProductControler {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/add")
	public String showAddPage(Model model) {
		model.addAttribute("product",new Product());
		return "admin/add";
	}
	@PostMapping("/add")
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.saveProduct(product);
		return "redirect:/admin/adminpage/list";
	}
	
	@GetMapping("/list")
	public String showListPage(Model model) {
		model.addAttribute("productsList",productService.findAllProducts());
		return "admin/list";
	}
//	@GetMapping("/{productId}/delete")
//	public String deleteProduct(@PathVariable("productId") int productId) {
//		productService.deleteProductById(productId);
//		
//		return "redirect:/admin/adminpage/list";
//		}
	
}
