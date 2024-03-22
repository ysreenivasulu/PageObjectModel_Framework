package POM_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practice {

	WebDriver driver;
	@FindBy(id="") public WebElement id;
	@FindBy(name="") public WebElement name;
	
	public practice(WebDriver d)
	{
		this.driver=d;
		PageFactory.initElements(d, this);
	}
	public void test() {
		id.click();
		name.clear();
	}
	
}
