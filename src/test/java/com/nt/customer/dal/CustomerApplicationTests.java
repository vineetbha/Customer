package com.nt.customer.dal;

import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nt.customer.dal.entity.Customer;
import com.nt.customer.dal.repo.CustomerRepositry;

@SpringBootTest
class CustomerApplicationTests {
	@Autowired
	CustomerRepositry repo;

	@Test
	void TestCrateCustomer()  {
		Customer c = new Customer();
		c.setName("Suresh");
		c.setEmail("sureshbhavsar97@gmail.com");
		repo.save(c);
	}
	
	@Test
	void TestReadCustomer() {
		Customer customer = repo.findById(3l).get();
		System.out.println(customer);
	}
	
	@Test
	void TestUpdateCustomer() {
		Customer customer = repo.findById(3l).get();
		customer.setName("Bhavsar");
		repo.save(customer);
	}
	
	@Test
	void TestdelCustomer() {
		Customer customer = repo.findById(1l).get();
		repo.deleteAll();
	}

}
