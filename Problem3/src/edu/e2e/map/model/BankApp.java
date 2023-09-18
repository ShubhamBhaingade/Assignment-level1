package edu.e2e.map.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankApp {
	
	AccountDb db;

	public BankApp() {
		db = new AccountDb();
	}

 

	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.groupAccountsByLocation();
	}

	public void groupAccountsByLocation() {
		
		List<Account> allAccounts = db.openNewAccount();
		Map<String, List<Account>> mapAccounts = new HashMap<>();
		for (Account account : allAccounts) {
			String loc = account.getLocation();
			List<Account> savedAccount = mapAccounts.get(loc);

			if(savedAccount == null) {
				List<Account> list = new ArrayList<>();
				list.add(account);
				mapAccounts.put(loc, list);
			} else if(savedAccount != null) {
				List<Account> list = mapAccounts.get(loc);
				list.add(account);
			}
		}

		for (Map.Entry<String, List<Account>> entry : mapAccounts.entrySet()) {
			String loc = entry.getKey();
			List<Account> allSavedAccounts = entry.getValue();
			display (loc, allSavedAccounts);
		}
	}

	public void display(String loc, List<Account> allAccounts) {
		System.out.println("----------- All Accounts of "+loc+"--------------");
		for (Account account : allAccounts) {
			System.out.println(account);
		}
		System.out.println();
	}
}