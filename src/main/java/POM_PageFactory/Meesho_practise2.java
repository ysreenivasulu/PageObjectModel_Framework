
package POM_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Meesho_practise2 {

	public WebDriver driver; 
	
	@FindBy(xpath="//body/div[@id='__next']/div[2]/div[3]/div[1]/div[1]/span[1]") public WebElement womens_Ethnics;
	@FindBy(xpath="//p[contains(text(),'Cotton Sarees')]")public WebElement cotton_sarees;
	@FindBy(xpath="(//span[text()='Sarees'])[2]")public WebElement radiobtn;
	@FindBy(xpath="//p[contains(text(),'Myra Superior Sarees')]")public WebElement link;
	@FindBy(xpath="//body/div[@id='__next']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/img[1]")public WebElement Bandhani;
	@FindBy(xpath="//span[contains(text(),'Buy Now')]") public WebElement pink_color;

	public Meesho_practise2(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);   
	}
	public void womens_ethnics(){
		
		Actions a=new Actions(driver);
		a.moveToElement(womens_Ethnics).perform();
		}
	public void cotton_sarees(){
		Actions a=new Actions(driver);
		a.moveToElement(cotton_sarees).click().build().perform();
		
	}
	public void radiobtn() throws Throwable {
		
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//body/div[@id='__next']/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]"));
		if(ele.isDisplayed())
		{
			ele.click();
		}
	}
	public void link() throws InterruptedException {
		Thread.sleep(2000);
		link.click();
	}
	public void Bandhani() throws Throwable
	{
		Thread.sleep(2000);
		Bandhani.click();
	}
	public void pink_color()
	{
		pink_color.click();
	}
}