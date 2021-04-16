package com.dwivedy.firdoxCustomer.service.impl;

import java.net.URI;
import java.time.Duration;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.dwivedy.firdoxCustomer.entity.Customer;
import com.dwivedy.firdoxCustomer.entity.RoleCustomer;
import com.dwivedy.firdoxCustomer.pojo.Account;
import com.dwivedy.firdoxCustomer.service.CustomerService;
import com.dwivedy.firdoxCustomer.service.RoleUserService;

import reactor.core.publisher.Mono;
 

/**
 * @author Pawan
 *
 *         This class acts as a service layer having RESTful API methods implementation.
 *         
 */

@Service
public class CustomerServiceImpl {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	RoleuserServiceImpl roleUserServiceImpl ;
	
	 
//	@Autowired
//	WebClient webClient;

	private Logger logger = Logger.getLogger(CustomerServiceImpl.class.getName());


 
	
	public Customer createCustomer(Customer customer) throws Exception {

		logger.info("products-service createProduct() invoked: " + customer);
		Optional <RoleCustomer> roleCustomer=roleUserServiceImpl.findByCode(customer.getUserRole());
		RoleCustomer roleCustomerObj= roleCustomer.isPresent()?roleCustomer.get():null;
		if(roleCustomerObj==null) {
			throw new Exception();
		}
		System.out.println(roleCustomerObj);
		customer.setRoleCustomer(roleCustomerObj);
		Customer saveCus=customerService.save(customer);
		
		Account acc= new Account();
		
		acc.setAccountType(customer.getUserRole());
		acc.setBranch(customer.getBranch());
		acc.setCustomerId(customer);
		 
		acc.setCustomerName(customer.getUserName());
		acc.setOpenDate(new Date());
		acc.setMinorIndicator('Y');
		
		Account accPer=WebClient.create().post()
        .uri("http://localhost:9002/api/v1/accounts")
        .body(Mono.just(acc), Account.class)
        .retrieve()
        .bodyToMono(Account.class).block();
		
		customer.setAccount(accPer);

		return customer;
	}

	 
//
//	@Override
//	public Customer findCustomerById(Long productId) {
////		Optional<Customer> product = mockStorage.getProducts().stream()
////				.filter(productObj -> productObj.getId() == productId).findFirst();
//
////		return product.isPresent() ? product.get() : null;
//		return null;
//	}
//
//	@Override
//	public Customer deleteCustomerById(Long productId) {
//		logger.info("products-service deleteProduct() invoked: " + productId);
//
////		Optional<Customer> product = mockStorage.getProducts().stream()
////				.filter(productObj -> productObj.getId() == productId).findFirst().map(p -> {
////					mockStorage.getProducts().remove(p);
////					return p;
////				});
////
////		return product.isPresent() ? product.get() : null;
//		return null;
//	}
//
//	@Override
//	public Customer updateCustomerById(Long productId, Customer productUpdate) {
//		logger.info("products-service updateProductById() invoked: " + productId);
////		Optional<Customer> product = mockStorage.getProducts().stream()
////				.filter(productObj -> productObj.getId() == productId).findFirst().map(p -> {
////					productUpdate.setId(p.getId());
////					mockStorage.getProducts().add(productUpdate);
////					mockStorage.getProducts().remove(p);
////					return productUpdate;
////				});
////
////		return product.isPresent() ? product.get() : null;
//		return null;
//	}



	 

}
