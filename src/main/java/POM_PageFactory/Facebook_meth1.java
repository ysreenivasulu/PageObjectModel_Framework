package POM_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook_meth1 {

	WebDriver driver;
	
	By id = By.xpath("//input[@id='email']");
	By name = By.xpath("//input[@id='pass']");
	By Login = By.name("login");
	
	public Facebook_meth1(WebDriver driver) 
	{
		
		this.driver=driver;  // if no use @findBy key word no pagefactory 
	}
	
	
	public void clickLogin() throws Throwable
	{
		driver.findElement(id).sendKeys("selenium");
		driver.findElement(name).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(Login).sendKeys("selenium");
	}
}
