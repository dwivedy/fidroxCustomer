package com.dwivedy.firdoxCustomer.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.dwivedy.firdoxCustomer.entity.Customer;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Pawan This class is representing the product entity and its necessary
 *         properties .
 */
 
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	 
	 private Long accountId;
	 
	 private String accountType;
	 private Date openDate;
	 
	 
	 private Customer customerId;
	 private String customerName;
	 private String branch;
	 private Character minorIndicator;
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	 
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Character getMinorIndicator() {
		return minorIndicator;
	}
	public void setMinorIndicator(Character minorIndicator) {
		this.minorIndicator = minorIndicator;
	}
	
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", openDate=" + openDate
				+ ", customerId=" + customerId + ", customerName=" + customerName + ", branch=" + branch
				+ ", minorIndicator=" + minorIndicator + "]";
	}
	
	
	 
	 
	 

}
