package com.nt.customer.dal.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.customer.dal.entity.Customer;

public interface CustomerRepositry extends CrudRepository<Customer, Long> {

}
