package com.dwivedy.firdoxCustomer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Pawan This class is representing the customer entity and its necessary
 *         properties .
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity(name = "roleUser")
public class RoleCustomer implements Serializable {

	private static final long serialVersionUID = 1L;

	 
	
	 	@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long roleId;
	 	
	 	@Column(unique = true)
	 	private String roleName;
		@Column(unique = true)
	 	private String roleCode;
		
	 	 
		 
		public Long getRoleId() {
			return roleId;
		}
		public void setRoleId(Long roleId) {
			this.roleId = roleId;
		}
		public String getRoleName() {
			return roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
		public String getRoleCode() {
			return roleCode;
		}
		public void setRoleCode(String roleCode) {
			this.roleCode = roleCode;
		}
		@Override
		public String toString() {
			return "RoleCustomer [roleId=" + roleId + ", roleName=" + roleName + ", roleCode=" + roleCode + "]";
		}


	    
	    
	    

	

}
