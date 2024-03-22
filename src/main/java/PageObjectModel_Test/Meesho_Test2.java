package PageObjectModel_Test;

import org.testng.annotations.Test;

import BaseClass.Driver2;
import POM_PageFactory.Meesho_practise2;

public class Meesho_Test2 extends Driver2 {

	Meesho_practise2 ms;
	@Test
	public void Test() throws Throwable
	{
        ms=new Meesho_practise2(driver);
		driver.get("https://www.meesho.com/");
		ms.womens_ethnics();
		ms.cotton_sarees();
		ms.radiobtn();
		ms.link();
		Thread.sleep(3000);
		ms.Bandhani();
		Thread.sleep(3000);
		ms.pink_color();  
		
	}
}
