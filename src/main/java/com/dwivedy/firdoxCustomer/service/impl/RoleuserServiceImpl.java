package com.dwivedy.firdoxCustomer.service.impl;

import java.util.Optional;
import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwivedy.firdoxCustomer.entity.Customer;
import com.dwivedy.firdoxCustomer.entity.RoleCustomer;
import com.dwivedy.firdoxCustomer.service.CustomerService;
import com.dwivedy.firdoxCustomer.service.RoleUserService;
 

/**
 * @author Pawan
 *
 *         This class acts as a service layer having RESTful API methods implementation.
 *         
 */

@Service
public class RoleuserServiceImpl {
	
	@Autowired
	RoleUserService roleUserService;
	

	private Logger logger = Logger.getLogger(RoleuserServiceImpl.class.getName());


	public RoleCustomer createUserRole(RoleCustomer roleCustomer) {
	
		return roleUserService.save(roleCustomer);
	}
	
	public  Optional<RoleCustomer> findByCode(String code) {
		
		return roleUserService.findAll().stream().filter(r-> r.getRoleCode().equals(code)).findFirst();
	}


 
	
//	public Customer createRoleUser(Customer customer) {
//
//		logger.info("products-service createProduct() invoked: " + customer);
//
//		customerService.save(customer);
//		return customer;
//	}

	 
 

	 

}
