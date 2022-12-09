package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.Addcity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SD_addcity {
	public WebDriver driver;
	public Addcity obj;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CK69815\\eclipse-workspace\\cucumber\\Ecommerce\\chromedriver.exe");
		driver=new ChromeDriver();
		
	    obj=new Addcity(driver);
	    driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User  enters Emails as {string} and password as {string}")
	public void user_enters_emails_as_and_password_as(String string, String string2) {
		obj.enterEmailAndPassword(string, string2);
	}

	@When("click on Login")
	public void click_on_login() {
		//obj.
	}


	@Then("click on Locations")
	public void click_on_locations() {
	   obj.click_Locations();
	}

	@Then("click on city")
	public void click_on_city() {
	    obj.Click_city();
	}

	@Then("click on add city")
	public void click_on_add_city() {
	    obj.Click_addcity();
	}

	@Then("user enters city as {string}")
	public void user_enters_city_as(String city) {
	    obj.Enter_City(city);
	}

	@Then("clicks on add")
	public void clicks_on_add() {
	    obj.Click_addbutton();
	}

	@Then("close")
	public void close() {
	    driver.close();
	}

}
