package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {

	boolean addProduct(Product product);
	List<Product> getAllProduct();
	boolean updateProduct(int id, Product updatedProduct);
	Product getProductById(int id);
	boolean deleteProduct(int id);
	List<Product> searchProduct(String data);
	
}

