package LUMA_TEST;

import org.testng.annotations.Test;

import BaseClass.DRIVER_NEW;
import LUMA_POM.LUMA_POM_1;
import LUMA_POM.LUMA_POM_2;
import LUMA_POM.LUMA_POM_3;


public class LUMA_TEST21 extends DRIVER_NEW{

	LUMA_POM_1 L1;
	LUMA_POM_2 L2;
	LUMA_POM_3 L3;
	
	
	@Test
	public  void Test() throws Throwable {
		
	
	    L1=new LUMA_POM_1(driver);
	    L2=new LUMA_POM_2(driver);
	    L3=new LUMA_POM_3(driver);
	    
		L1.clickLogout();
		L2.size();
	    L3.size1();
		
	
	}

}
