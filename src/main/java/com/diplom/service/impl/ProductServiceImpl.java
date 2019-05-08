package com.diplom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diplom.entity.Product;
import com.diplom.repository.ProductRepository;
import com.diplom.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return productRepository.findOne(id);
	}

	@Override
	public void deleteProductById(int id) {
		productRepository.delete(id);
		
	}

	
}
