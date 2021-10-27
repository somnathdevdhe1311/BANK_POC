package com.xoriant.banking.poc.dao.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonMethods {

	/*
	 * private static String CUSTOMERID; private static String MANAGERID; private
	 * static String PERSONID; private static String ADDRESSID; private static
	 * String ACCOUNTID; private static String BRANCHID;
	 */
	private static String TRANSACTIONID;

	/*
	 * public static int getCustomerId() {
	 * 
	 * String str = "10000";
	 * 
	 * int random = (int) (Math.random() * (1000 - 100 + 1) + 100); str = str +
	 * Integer.toString(random); CUSTOMERID = str;
	 * 
	 * return Integer.parseInt(CUSTOMERID);
	 * 
	 * }
	 * 
	 * public static int getManagerId() {
	 * 
	 * String str = "20000";
	 * 
	 * int random = (int) (Math.random() * (1000 - 100 + 1) + 100); str = str +
	 * Integer.toString(random); MANAGERID = str;
	 * 
	 * return Integer.parseInt(MANAGERID);
	 * 
	 * }
	 * 
	 * public static int getPersonId() {
	 * 
	 * String str = "30000";
	 * 
	 * int random = (int) (Math.random() * (1000 - 100 + 1) + 100); str = str +
	 * Integer.toString(random); PERSONID = str;
	 * 
	 * return Integer.parseInt(PERSONID);
	 * 
	 * }
	 * 
	 * public static int getAddressId() {
	 * 
	 * String str = "40";
	 * 
	 * int random = (int) (Math.random() * (1000 - 100 + 1) + 100); str = str +
	 * Integer.toString(random); ADDRESSID = str;
	 * 
	 * return Integer.parseInt(ADDRESSID);
	 * 
	 * }
	 * 
	 * public static int getAccountId() {
	 * 
	 * String str = "40000";
	 * 
	 * int random = (int) (Math.random() * (1000 - 100 + 1) + 100); str = str +
	 * Integer.toString(random); ACCOUNTID = str;
	 * 
	 * return Integer.parseInt(ACCOUNTID);
	 * 
	 * }
	 * 
	 * public static int getBranchId() {
	 * 
	 * String str = "50000";
	 * 
	 * int random = (int) (Math.random() * (1000 - 100 + 1) + 100); str = str +
	 * Integer.toString(random); BRANCHID = str;
	 * 
	 * return Integer.parseInt(BRANCHID);
	 * 
	 * }
	 */
	public static int getTransactionId() {

		String str = "99000";

		int random = (int) (Math.random() * (1000 - 100 + 1) + 100);
		str = str + Integer.toString(random);
		TRANSACTIONID = str;
		
		return Integer.parseInt(TRANSACTIONID);

	}
	
	public static String getCurrentDate() {

		String str = "";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		str= dtf.format(now);
		   
		return str;

	}
}
