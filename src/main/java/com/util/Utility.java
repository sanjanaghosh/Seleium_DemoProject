package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		return pageTitle;
}
	public static void takeScreenShot(WebDriver driver, String pageTitle) {
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("E:\\Screenshots for Selenium\\"+pageTitle+".jpg");

		try {
			FileUtils.copyFile(file, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
}
