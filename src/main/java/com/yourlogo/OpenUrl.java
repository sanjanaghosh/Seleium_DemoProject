package com.yourlogo;

import org.openqa.selenium.WebDriver;
import com.util.Utility;

public class OpenUrl {

	public static void main(String[] args) {
		WebDriver driver=Utility.loadDriver();
		Utility.homePage(driver);
		String pt=Utility.pageTitle(driver);
		
		Utility.takeScreenShot(driver,pt);
		
		
	}

}
