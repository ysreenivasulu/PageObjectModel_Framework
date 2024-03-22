package PageObjectModel_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import POM_PageFactory.meesho_3pra;

public class mesho_3pra {

	public static void main(String[] args) throws Throwable {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.meesho.com/jeans-women/pl/3kc");
		d.manage().window().maximize();
		WebElement ele=d.findElement(By.xpath("//span[normalize-space()='Color']"));
	//	WebElement ele2=d.findElement(By.cssSelector("span[label='Blue'] span[class='sc-eDvSVe bJbuWg']"));
		
		Actions a=new Actions(d);
		a.moveToElement(ele).click().build().perform();
	
		Thread.sleep(3000);
		//d.close();
	}
	
}
