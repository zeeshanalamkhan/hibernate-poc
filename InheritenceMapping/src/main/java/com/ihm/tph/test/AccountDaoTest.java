package com.ihm.tph.test;

import com.ihm.tph.dao.AccountDao;
import com.ihm.tph.entities.SavingAccount;
import com.ihm.tph.entities.Account;
public class AccountDaoTest {
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		SavingAccount sa = new SavingAccount(); 
		sa.setBankName("Canara Bank");
		sa.setBranchName("Sahawar");
		sa.setHolderName("ZEESHAN ALAM KHAN");
		sa.setMinbal(1000.00);
		boolean trace = dao.insert(sa);
		System.out.println("Hello Record Inserted?: "+trace);
	}
}