package com.dwivedy.firdoxCustomer.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dwivedy.firdoxCustomer.entity.Customer;

//@Repository
public interface CustomerService extends JpaRepository<Customer, Integer>{

	
//
//	/**
//	 * Performs create product
//	 * 
//	 * @param product
//	 * 
//	 * 
//	 */
//	Customer createCustomer(Customer customer);
//
//	
//	/**
//	 * Performs complete find of object matched by id
//	 * 
//	 * @param productId
//	 * @throws RecordNotFoundException returns product
//	 */
//	Customer findCustomerById(Long customerId);
//
//	/**
//	 * Performs complete delete of object matched by id
//	 * 
//	 * @param productId
//	 * @throws RecordNotFoundException returns product
//	 */
//	Customer deleteCustomerById(Long customerId);
//
//	/**
//	 * Performs complete replacement of the object matched by Id
//	 * 
//	 * @param productId,product
//	 * @throws RecordNotFoundException
//	 * 
//	 */
//	Customer updateCustomerById(Long productId, Customer customer);

}
