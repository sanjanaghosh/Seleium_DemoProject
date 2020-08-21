package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public static void takeScreenShot(WebDriver driver, String pageTitle) {
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("E:\\Screenshots for Selenium\\"+pageTitle+".jpg");

		try {
			FileUtils.copyFile(file, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String pt=Utility.pageTitle(driver);
		ScreenShot.takeScreenShot(driver,pt);
	}

	


}
