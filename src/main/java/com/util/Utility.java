package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Utility {

	public static WebDriver loadDriver() {
		System.setProperty("webdriver.edge.driver", "E:\\Softwares\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;

	}

	public static void homePage(WebDriver driver) {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	public static String pageTitle(WebDriver driver) {
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		return pageTitle;
	}

}
