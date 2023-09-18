package com.cjc.service;

import java.util.List;

import com.cjc.model.Customer;
import com.cjc.model.ProductOrder;

public interface CustomerService {

	String saveCustomer(Customer customer);

	Customer getCustomerById(long cmob);

	String deleteCustomerById(long cmob);

	void sendOrderConfirmationEmail(Customer existingCustomer);

	List<ProductOrder> findByCmob(long cmob);

	}
