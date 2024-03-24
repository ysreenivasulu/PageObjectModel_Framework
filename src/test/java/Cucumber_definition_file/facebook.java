package Cucumber_definition_file;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import BaseClass.driverfb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facebook {
	public  WebDriver driver;
	

@Given("User navigate to homepage")
public void user_navigate_to_homepage() {
	driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");

}

@When("User enter the email ID")
public void user_enter_the_email_id() {
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("selenium");
	
}

@When("User enter the password")
public void user_enter_the_password() {
    
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("selenium123");
}

@Then("User click on login button")
public void user_click_on_login_button() throws Throwable {
  
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	driver.quit();
}



}
