package com.rubchuk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rubchuk.entity.Product;

@Service
public interface ProductService {
	
	void saveProduct(Product product);
	
	List<Product> findAllProducts();
	
	Product findProductById(int id);
	
	void deleteProductById (int id);
}
