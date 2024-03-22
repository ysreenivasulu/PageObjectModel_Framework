package POM_PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_meth2 {   //WITHOUT STRING USE IN THIS CLASS

	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']") public WebElement id;
	@FindBy(xpath="//input[@id='pass']")public WebElement name;
	@FindBy(name="login")public WebElement login;

	
	
	public Facebook_meth2(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);    
	}
	
	

	public void clickLogout() throws Throwable {
		id.sendKeys("selenium");
		name.sendKeys("selenium123");
		Thread.sleep(2000);
		login.click();
		Thread.sleep(3000);
	}
}