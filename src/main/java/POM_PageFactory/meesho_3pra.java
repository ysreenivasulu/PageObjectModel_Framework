package POM_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class meesho_3pra {
	
	
	public WebDriver driver; 
	
	@FindBy(xpath="") public WebElement serchbox;
	
	public meesho_3pra(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);   
	}
	
	public void serchbox(){
		
		WebElement ele=driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]"));
		ele.sendKeys("saree");
		ele.submit();
		
		
		}

}
