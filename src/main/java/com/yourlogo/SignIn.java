package com.yourlogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.util.ScreenShot;
import com.util.Utility;

public class SignIn {
	static WebElement signin;

	public static void signIn(WebDriver driver) {
		boolean present;
		try {
			signin = driver.findElement(By.className("login"));
			present = true;
			System.out.println("SignIn is present");
		} catch (Exception e) {
			present = false;
			System.out.println("SignIn is not present");
		}

		if (present) {
			System.out.println("Ready to go");
			signin.click();
		}
		try {
			driver.findElement(By.id("login_form"));
			present = true;
			System.out.println("Already you have an account!! SignIn!!");
			driver.findElement(By.id("email")).sendKeys("test1@gmail.com");
			driver.findElement(By.id("passwd")).sendKeys("test1");
			driver.findElement(By.id("SubmitLogin")).click();
			System.out.println("Signedin Successfully!");
			String pt = Utility.pageTitle(driver);
			ScreenShot.takeScreenShot(driver, pt);
		} catch (Exception e) {
			present = false;
			System.out.println("Please create an account");
			driver.findElement(By.id("email_create")).sendKeys("test1@gmail.com");
			driver.findElement(By.id("SubmitCreate")).click();
			String pt = Utility.pageTitle(driver);
			ScreenShot.takeScreenShot(driver, pt);
		}
	}

}
