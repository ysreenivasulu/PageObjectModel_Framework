package Cucumber_definition_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.driverfb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facebook {
	WebDriver driver;
	driverfb d=new driverfb();

@Given("User navigate to homepage")
public void user_navigate_to_homepage() {
   
	d.launchBrowser();

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
