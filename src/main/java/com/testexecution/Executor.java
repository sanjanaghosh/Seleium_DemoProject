package com.testexecution;

import com.yourlogo.CreateAccount;
import com.yourlogo.OpenUrl;
import com.yourlogo.SignIn;

public class Executor {

	public static void main(String[] args) {
		OpenUrl.url();
		CreateAccount.createAccount(null);
		SignIn.signIn(null);

	}

}
