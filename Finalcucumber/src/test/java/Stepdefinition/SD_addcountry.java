package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.AddCountry;
import PO.Addcity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_addcountry {
	public WebDriver driver;
	public AddCountry obj;
	
	@Given("User Launches Chrome browser")
	public void user_launches_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CK69815\\eclipse-workspace\\cucumber\\Ecommerce\\chromedriver.exe");
		driver=new ChromeDriver();
		
	    obj=new AddCountry(driver);
	    driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User  enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
		obj.enterEmailAndPassword(string, string2);
	}

	@When("clicks on Login")
	public void clicks_on_login() {
	    
	}

	@Then("clicks on Locations")
	public void clicks_on_locations() {
	    obj.click_Locations();
	}

	@Then("click on country")
	public void click_on_country() {
	    obj.Click_contry();
	}

	@Then("clicks on add country")
	public void clicks_on_add_country() {
	    obj.Click_addcountry();
	}

	@Then("user enters country as {string}")
	public void user_enters_country_as(String country) {
	    obj.Enter_Country(country);
	}

	@Then("click on add")
	public void click_on_add() {
	   obj.Click_addbutton();
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}

}
