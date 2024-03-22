package POM_PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_meth3 {    //WITH STRING USE THIS CLASS

	public WebDriver driver; 
	
	@FindBy(xpath="//input[@id='email']") public WebElement id;
	@FindBy(xpath="//input[@id='pass']")public WebElement name;
	@FindBy(name="login")public WebElement login;

	
	
	public Facebook_meth3(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);    //  if you this key use @findBy this line should be use
	}
	
	

	public void enterEmail(String email){
		
/*		Actions a=new Actions(driver);
		a.moveToElement(id).perform();
*/		
		id.sendKeys(email);
	}
	
	public void enterPassword(String password){
		
		name.sendKeys(password);
	}
	
	public void loginbtn() throws Throwable {
		
		Thread.sleep(2000);
		login.click();
	}
}