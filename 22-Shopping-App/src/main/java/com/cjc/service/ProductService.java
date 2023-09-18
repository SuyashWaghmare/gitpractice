package com.cjc.service;

import java.util.List;

import com.cjc.model.Product;

public interface ProductService {

	List<Product> getAllProducts();

	List<Product> getProductByCategeory(String pcategory);

	Product getProductByPid(long pid);

	

}
