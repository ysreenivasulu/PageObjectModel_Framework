package PageObjectModel_Test;

import org.testng.annotations.Test;

import BaseClass.Driver3;
import POM_PageFactory.Facebook_meth3;



public class Facebook_login3 extends Driver3 {
	
	Facebook_meth3 fb;
	@Test
	public  void Test() throws Throwable {
		
	    fb=new Facebook_meth3(driver);
	    
		fb.enterEmail("selenium");
		fb.enterPassword("seleniu123");
		fb.loginbtn();
	}

}