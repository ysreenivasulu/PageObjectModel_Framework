package BaseClass;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DRIVER_NEW {

	
public  WebDriver driver;
	
@BeforeMethod
	public  void launchBrowser() throws Throwable
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
	}
	
	
@AfterMethod
	public  void closeBrowser() throws Throwable
	
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\LUMA.png");
		FileUtils.copyFile(src, trg);
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
