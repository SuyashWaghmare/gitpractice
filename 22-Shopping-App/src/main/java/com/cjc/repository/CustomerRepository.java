package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Customer;
import com.cjc.model.ProductOrder;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<ProductOrder> findByCmob(long cmob);

	

	



	

}
