package com.dwivedy.firdoxCustomer.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwivedy.firdoxCustomer.entity.RoleCustomer;

public interface RoleUserService extends JpaRepository<RoleCustomer, Integer> {

}
