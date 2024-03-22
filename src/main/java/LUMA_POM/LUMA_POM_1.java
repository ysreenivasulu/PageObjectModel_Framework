 package LUMA_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LUMA_POM_1 {

	public WebDriver driver;
	
	@FindBy(xpath="//span[contains(text(),'Women')]") public WebElement Women;
	@FindBy(xpath="//a[@id='ui-id-10']//span[contains(text(),'Bottoms')]")public WebElement Bottoms;
	@FindBy(xpath="//a[@id='ui-id-15']")public WebElement Shorts;

	
	
	public LUMA_POM_1(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);    
	}
	
	

	public void clickLogout() throws Throwable {
		Actions a=new Actions(driver);
		a.moveToElement(Women).perform();
		a.moveToElement(Bottoms).perform();
		//Thread.sleep(2000);
		a.moveToElement(Shorts).click().build().perform();
		
		Thread.sleep(3000);
	}
}
