package POM_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Meesho_pageFactory {

	public WebDriver driver; 
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[3]/div[1]/div[13]") public WebElement jevellery;
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[3]/div[1]/div[14]/div[1]/div[1]/a[5]/p[1]")public WebElement bangles;
	@FindBy(xpath="//span[contains(text(),'Bangles & Bracelets')]")public WebElement radiobtn;
	@FindBy(xpath="//body/div[@id='__next']/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/a[1]/div[1]/div[2]/div[1]/span[1]/p[1]")public WebElement link;
	@FindBy(xpath="//body/div[@id='__next']/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]")public WebElement size;
	@FindBy(xpath="//span[contains(text(),'Buy Now')]") public WebElement buy;

	public Meesho_pageFactory(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);   
	}
	public void jevellery(){
		
		Actions a=new Actions(driver);
		a.moveToElement(jevellery).perform();
		}
	public void bangles(){
		Actions a=new Actions(driver);
		a.moveToElement(bangles).click().build().perform();
		
	}
	public void radiobtn() throws Throwable {
		
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Bangles & Bracelets')]"));
		if(ele.isDisplayed())
		{
			ele.click();
		}
	}
	public void link() throws InterruptedException {
		Thread.sleep(2000);
		link.click();
	}
	public void size() throws Throwable
	{
		Thread.sleep(2000);
		size.click();
	}
	public void Buy()
	{
		buy.click();
	}
}