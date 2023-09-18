package com.cjc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.cjc.model.Product;

@Service
public class ProductServiceIMPL implements ProductService {

	List<Product> list = new ArrayList<Product>();

	@PostConstruct
	public void init() {
		list.add(new Product(1, "SamsungA54", "Samsung", 20000, "Electronics"));
		list.add(new Product(2, "OnePlus9R", "OnePlus", 45000, "Electronics"));
		list.add(new Product(3, "PeanutButter", "MyFitness", 150, "Grocery"));
		list.add(new Product(4, "Almonds", "Americano", 450, "Grocery"));
		list.add(new Product(5, "Tshirt", "Wrogn", 2000, "Cloths"));
	}

	@Override
	public List<Product> getAllProducts() {

		return list;
	}

	@Override
	public List<Product> getProductByCategeory(String pcategory) {

		List<Product> product = list.stream().filter(p -> p.getPcategory().equals(pcategory))
				.collect(Collectors.toList());

		return product;
	}

	@Override
	public Product getProductByPid(long pid) {
		Optional<Product> optionalProduct = list.stream().filter(p -> p.getPid() == pid).findFirst();

		return optionalProduct.orElse(null);
	}
}
