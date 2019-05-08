package com.diplom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.diplom.entity.Product;

@Service
public interface ProductService {
	
	void saveProduct(Product product);
	
	List<Product> findAllProducts();
	
	Product findProductById(int id);
	
	void deleteProductById (int id);
}
