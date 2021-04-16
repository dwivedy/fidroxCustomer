package com.dwivedy.firdoxCustomer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.atomic.LongAccumulator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.dwivedy.firdoxCustomer.pojo.Account;

/**
 * @author Pawan This class is representing the customer entity and its necessary
 *         properties .
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	 
	
	 	@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long userId;
	    
	    private String userName;
	    private Date dateOfBirth;
	    @Column(name="gender")
	    @NotNull(message = "Gender is mandatory")
	    private String gender;
	    private String phoneNumber;
	    
	    @OneToOne
	    @JoinColumn(name = "roleId", referencedColumnName = "roleId")
	    private RoleCustomer roleCustomer;
	    
	    @Transient
	    @NotNull(message = "role is mandatory")
	    private String userRole;
	    
	    @Transient
	    @NotNull(message = "branch is mandatory")
	    private String branch;
	    
	    @Transient
	    private Account Account;
	 
		 
		
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public String getUserRole() {
			return userRole;
		}
		public void setUserRole(String userRole) {
			this.userRole = userRole;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		 
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public RoleCustomer getRoleCustomer() {
			return roleCustomer;
		}
		public void setRoleCustomer(RoleCustomer roleCustomer) {
			this.roleCustomer = roleCustomer;
		}
		public Account getAccount() {
			return Account;
		}
		public void setAccount(Account account) {
			Account = account;
		}
		@Override
		public String toString() {
			return "Customer [userId=" + userId + ", userName=" + userName + ", dateOfBirth=" + dateOfBirth
					+ ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", roleCustomer=" + roleCustomer
					+ ", userRole=" + userRole + ", branch=" + branch + "]";
		}
		
		
		
		
		 
		 
	    
	    

	

}
