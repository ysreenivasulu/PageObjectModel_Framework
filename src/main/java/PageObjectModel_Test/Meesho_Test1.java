package PageObjectModel_Test;

import org.testng.annotations.Test;

import BaseClass.Driver2;
import POM_PageFactory.Meesho_pageFactory;

public class Meesho_Test1 extends Driver2 {

	Meesho_pageFactory ms;
	@Test
	public void Test() throws Throwable
	{
        ms=new Meesho_pageFactory(driver);
		driver.get("https://www.meesho.com/");
		ms.jevellery();
		ms.bangles();
		ms.radiobtn();
		ms.link();
		ms.size();
		ms.Buy();  
		
	}
}
