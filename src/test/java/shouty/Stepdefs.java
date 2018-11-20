package shouty;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;






public class Stepdefs {
	
	WebDriver driver;
       public Stepdefs(SharedDriver driver)
       {super();
       this.driver=driver();
       }

	
	
	@Given("^The URL of Demo Webshop$")
	public void the_URL_of_Demo_Webshop() throws Throwable {
		//driver=ChromeDriver();
		driver.get("http://demowebshop.tricentis.com")
		;
	
	}

	@When("^User enters (.*) to username$")
	public void user_enters_savik__hotmail_com_to_username(String username) throws Throwable {
	 
	
		driver.findElement(By.id("Email")).sendKeys(username);
		
		
	}

	@When("^User enters (.*) as password$")
	public void user_enters_hello_as_password(String password) throws Throwable {
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.cssSelector("input[value=Log in']")).click();
	}

	@Then("^User (is|is not) valid$")
	public void user_is_valid() throws Throwable {
		
		if(message.Equals("is not"))
		{
	    Assert.assertEquals("demo web shop.", driver.getTitle());
		}
		else
		{Assert.assertEquals("demo web shop", driver.getTitle());} //striked off means the function is just depricated but it will run
		
	}


}
