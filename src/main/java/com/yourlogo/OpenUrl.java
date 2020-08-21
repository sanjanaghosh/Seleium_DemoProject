package com.yourlogo;

import org.openqa.selenium.WebDriver;

import com.util.ScreenShot;
import com.util.Utility;

public class OpenUrl {

	public static void url() {
		WebDriver driver=Utility.loadDriver();
		Utility.homePage(driver);
		String pt=Utility.pageTitle(driver);		
		ScreenShot.takeScreenShot(driver,pt);
		
	}

}
