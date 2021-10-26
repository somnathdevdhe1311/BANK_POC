package com.xoriant.banking.poc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xoriant.banking.poc.dao.util.CommonMethods;
import com.xoriant.banking.poc.dao.util.DBQueries;
import com.xoriant.banking.poc.model.Branch;
import com.xoriant.banking.poc.model.Customer;
import com.xoriant.banking.poc.model.Manager;
import com.xoriant.banking.poc.model.PersonInfo;

@Repository
public class ManagerDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Branch addNewBranch(Branch branch) {
		
		int res = jdbcTemplate.update(DBQueries.ADD_NEW_BRANCH,branch.getBranchId(), branch.getBranchName(),
				branch.getIfscCode(),branch.getMicrCode());

		if (res != 0) {
			return branch;
		}

		return null;	
	}
	
public PersonInfo addNewPerson(PersonInfo personInfo) {
	personInfo.getAddress().setAddressId(CommonMethods.getAddressId());
	personInfo.setPersonId(CommonMethods.getPersonId());
	System.out.println("PERSON ID=="+personInfo.getPersonId());
	System.out.println("ADDRESS ID=="+personInfo.getAddress().getAddressId());
	int res = jdbcTemplate.update(DBQueries.ADD_NEW_ADDRESS,personInfo.getAddress().getAddressId(),personInfo.getAddress().getDoorNo(),
			personInfo.getAddress().getCity(),personInfo.getAddress().getArea(),
			personInfo.getAddress().getState(),personInfo.getAddress().getPincode(),
			personInfo.getAddress().getAddressType(),personInfo.getAddress().getBranchId(),
			personInfo.getPersonId());
	
	System.out.println("================Address Inserted====================");
	
		if (personInfo.getAddress().getAddressId() != 0) {

			personInfo.setPersonId(CommonMethods.getPersonId());
			int res1 = jdbcTemplate.update(DBQueries.ADD_NEW_PERSON,personInfo.getPersonId(),personInfo.getPersonName(),
					personInfo.getGender().getId(), personInfo.getDob(), personInfo.getMobNumber(),personInfo.getAddress().getAddressId(),
					personInfo.getRoles().getRole_id(),personInfo.getPersonType());
			
			System.out.println("==================Person Inserted=======================");
			
			if(personInfo.getPersonType().equals("CUSTOMER")) {
				
				Customer customer= new Customer();
				customer.setCustomerId(CommonMethods.getCustomerId());
				int res2 = jdbcTemplate.update(DBQueries.ADD_NEW_CUSTOMER,customer.getCustomerId(),personInfo.getPersonId());
				System.out.println("=================Customer Inserted=======================");
			}else {
				Manager manager= new Manager();
				manager.setManagerId(CommonMethods.getManagerId());
				int res3 = jdbcTemplate.update(DBQueries.ADD_NEW_MANAGER,manager.getManagerId(),personInfo.getPersonId());
				
				System.out.println("==================Manager Inserted=======================");
			}
			return personInfo;
		}

		return null;	
	}

}
