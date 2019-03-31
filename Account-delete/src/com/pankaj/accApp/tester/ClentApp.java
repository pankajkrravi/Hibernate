package com.pankaj.accApp.tester;

import com.pankaj.accApp.dao.AccountDAO;
import com.pankaj.accApp.dto.AccountDTO;

public class ClentApp {
	public static void main(String[] args) {
		AccountDAO accountdao = new AccountDAO();
		accountdao.deleteAccount(3);
	}
}
