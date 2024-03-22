package LUMA_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LUMA_POM_3 {

	public WebDriver driver;
	@FindBy(xpath="//div[@class='swatch-opt-1903']//div[@id='option-label-color-93-item-56']") public WebElement Color;
	@FindBy(xpath="//body/div[2]/main[1]/div[3]/div[1]/div[4]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]")public WebElement image;
	@FindBy(xpath="//span[contains(text(),'Add to Cart')]")public WebElement addtocart;

	
	
	public LUMA_POM_3(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);    
	}
	
	

	public void size1() throws Throwable {
		Color.click();
		
		Thread.sleep(2000);
		image.click();
		Thread.sleep(2000);
		addtocart.click();
		Thread.sleep(3000);
	}
}
