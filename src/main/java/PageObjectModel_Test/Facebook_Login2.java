package PageObjectModel_Test;

import org.testng.annotations.Test;
import BaseClass.Driver2;
import POM_PageFactory.Facebook_meth2;
import POM_PageFactory.Facebook_meth3;



public class Facebook_Login2 extends Driver2 {
	

	Facebook_meth2 fb;
	
	
	@Test
	public  void Test() throws Throwable {
		
	
	    fb=new Facebook_meth2(driver);
	    
		fb.clickLogout();
		
	
	}

}