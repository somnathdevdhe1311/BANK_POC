package com.xoriant.banking.poc.dao.util;

public class CommonMethods {

	private static String CUSTOMERID;
	private static String MANAGERID;
	private static String PERSONID;
	private static String ADDRESSID;
	private static String ACCOUNTID;
	private static String BRANCHID;

	public static int getCustomerId() {

		String str = "10000";

		int random = (int) (Math.random() * (1000 - 100 + 1) + 100);
		str = str + Integer.toString(random);
		CUSTOMERID = str;
		
		return Integer.parseInt(CUSTOMERID);

	}

	public static int getManagerId() {

		String str = "20000";

		int random = (int) (Math.random() * (1000 - 100 + 1) + 100);
		str = str + Integer.toString(random);
		MANAGERID = str;

		return Integer.parseInt(MANAGERID);

	}

	public static int getPersonId() {

		String str = "30000";

		int random = (int) (Math.random() * (1000 - 100 + 1) + 100);
		str = str + Integer.toString(random);
		PERSONID = str;

		return Integer.parseInt(PERSONID);

	}

	public static int getAddressId() {

		String str = "40";

		int random = (int) (Math.random() * (1000 - 100 + 1) + 100);
		str = str + Integer.toString(random);
		ADDRESSID = str;

		return Integer.parseInt(ADDRESSID);

	}
	
	public static int getAccountId() {

		String str = "40000";

		int random = (int) (Math.random() * (1000 - 100 + 1) + 100);
		str = str + Integer.toString(random);
		ACCOUNTID = str;
		
		return Integer.parseInt(ACCOUNTID);

	}
	
	public static int getBranchId() {

		String str = "50000";

		int random = (int) (Math.random() * (1000 - 100 + 1) + 100);
		str = str + Integer.toString(random);
		BRANCHID = str;
		
		return Integer.parseInt(BRANCHID);

	}
}
