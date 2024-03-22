package LUMA_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LUMA_POM_2 {

   public WebDriver driver;
	
	@FindBy(xpath="//div[text()='Size']") public WebElement Size;
	@FindBy(xpath="//a[@aria-label='28']//div[contains(@class,'swatch-option text')][normalize-space()='28']")public WebElement s28;
	@FindBy(xpath="//a[@id='ui-id-15']")public WebElement Shorts;

	
	
	public LUMA_POM_2(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);    
	}
	
	

	public void size() throws Throwable {
		Actions a=new Actions(driver);
		a.moveToElement(Size).click().build().perform();
		
		Thread.sleep(2000);
		s28.click();
		
		
		Thread.sleep(3000);
	}

}
