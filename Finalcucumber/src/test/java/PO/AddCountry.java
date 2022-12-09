package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCountry {
		public WebDriver ldriver;   
		    
		    public AddCountry(WebDriver ldriver)
		    {
		        PageFactory.initElements(ldriver,this);
		    }
		        @FindBy(xpath="//input[@id='useremail']")
		        @CacheLookup
		        WebElement useremail_login;
		        
		        @FindBy(xpath = "//input[@id='password']")
		        @CacheLookup
		        WebElement password_login;
		        
		        @FindBy(xpath = "//button[@class='btn btn-primary btn-flat m-b-30 m-t-30']")
		        @CacheLookup
		        WebElement login_button;
		        
		        @FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/a")
		        @CacheLookup
		        WebElement Locations;
		        
		        @FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[1]/a")
		        @CacheLookup
		        WebElement country;
		        
		        @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
		        @CacheLookup
		        WebElement addcountry;
		        
		        @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/form/div/div[1]/div/div/input")
		        @CacheLookup
		        WebElement enter_country;
		        
		        @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div[2]/div/form/div/div[2]/div/div/button")
		        @CacheLookup
		        WebElement add_button;
		        
		        
		        public void enterEmailAndPassword(String str1, String str2) {
		            useremail_login.sendKeys(str1);
		            password_login.sendKeys(str2);
		            login_button.click();
		            
		        }
		        public void click_Locations() {
		            Locations.click();
		        }
		        public void Click_contry() {
		            country.click();
		        }
		        public void Click_addcountry() {
		        	addcountry.click();
		        }
		        public void Enter_Country(String country) {
		        	enter_country.sendKeys(country);
		        }
		        public void Click_addbutton() {
		        	add_button.click();
		        }

		
}
