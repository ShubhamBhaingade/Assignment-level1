package edu.e2e.map.model;

import java.util.LinkedList;
import java.util.List;

public class AccountDb {
	List<Account> listofAccounts = new LinkedList<>();

	public List<Account> openNewAccount() {
		Account a1 = new Account(101,"Shubham",1000,"mumbai");
		Account a2 = new Account(102,"Rohit",200000,"Kolhapur");
		Account a3 = new Account(103,"Rutvik",1000,"Pune");
		Account a4 = new Account(107,"Rutvik",1000,"nashik");
		
		

		listofAccounts.add(a1);
		listofAccounts.add(a2);
		listofAccounts.add(a3);
		listofAccounts.add(a4);
		

		return listofAccounts;

}
}
