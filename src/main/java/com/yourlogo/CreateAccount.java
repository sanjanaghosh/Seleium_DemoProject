package com.yourlogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.util.ScreenShot;
import com.util.Utility;

public class CreateAccount {
	static WebElement createaccount;

	public static void createAccount(WebDriver driver) {
		boolean present;
		try {
			createaccount = driver.findElement(By.className("login"));
			present = true;
			System.out.println("SignIn is present");
		} catch (Exception e) {
			present = false;
			System.out.println("SignIn is not present");
		}

		if (present) {
			System.out.println("Ready to go");
			createaccount.click();
		}

		try {
			createaccount = driver.findElement(By.id("create-account_form"));
			present = true;
			System.out.println("Please create an Account!!");
			String pt = Utility.pageTitle(driver);
			ScreenShot.takeScreenShot(driver, pt);
		} catch (Exception e) {
			present = false;
			System.out.println("Create Account option is not present");
			String pt = Utility.pageTitle(driver);
			ScreenShot.takeScreenShot(driver, pt);
		}

		if (present) {
			driver.findElement(By.id("email_create")).sendKeys("test1@gmail.com");
			driver.findElement(By.id("SubmitCreate")).click();
			String pt = Utility.pageTitle(driver);
			ScreenShot.takeScreenShot(driver, pt);

		}
	}
}