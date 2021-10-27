package com.xoriant.banking.poc.dao.util;

public class DBQueries {

	public final static String ALL_CUSTOMER_LIST="select * from customer";
	public final static String VIEW_ACCOUNT_INFO="select * from account_details";
	public static final String ADD_NEW_PERSON="insert into personinfo values(?,?,?,?,?,?,?,?)";
	public static final String ADD_NEW_CUSTOMER="insert into customer values(?,?)";
	public static final String ADD_NEW_MANAGER="insert into manager values(?,?)";
	public static final String ADD_NEW_ADDRESS="insert into address values(?,?,?,?,?,?,?,?,?)";
	public static final String ADD_NEW_BRANCH="insert into branch values(?,?,?,?)";
	public static final String WITHDRAW_MONEY="insert into transaction_details values(?,?,?,?,?,?,?)";
	public final static String ACCOUNT_DETAILS="select ad.balance,ad.account_type_id,ad.branch_id,pi.person_type,pi.role_id from account_details ad join customer c join personinfo pi on ad.customer_id=c.customer_id and c.person_id=pi.person_id where ad.account_number= ?";
	public static final String UPDATE_ACCOUNT_BALNCE="update account_details set balance = ? where account_number = ?";
	public static final String DEPOSIT_MONEY="insert into transaction_details values(?,?,?,?,?,?,?)";
	public static final String MINI_STATEMENT="select * from transaction_details where account_number= ? order by transaction_id desc limit 5";
	public static final String CUSTOMIZED_MINI_STATEMENT="select * from transaction_details where account_number= ? and transaction_date between ? and ? order by transaction_id desc";		
			
			
}

