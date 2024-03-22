package PageObjectModel_Test;

import BaseClass.Driver;
import POM_PageFactory.Facebook_meth1;


public class Facebook_Login1 extends Driver {
	
	public static void main(String[] args) throws Throwable {
		
		launchBrowser();
		driver.get("https://www.facebook.com/");
		
		//Creating object of home page
		Facebook_meth1 home = new Facebook_meth1(driver);
		home.clickLogin();
		
		
		closeBrowser();
	}

}