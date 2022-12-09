package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcity {
public WebDriver ldriver;   
    
    public Addcity(WebDriver ldriver)
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
        
        @FindBy(xpath = "//a[@href='https://products.pisystindia.com/Ecommerce/admin/city'][1]")
        @CacheLookup
        WebElement city;
        
        @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[3]/div/div/div[1]/a")
        @CacheLookup
        WebElement addcity;
        
        @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[3]/div/div/div[2]/div/form/div/div[1]/div/div/input")
        @CacheLookup
        WebElement enter_city;
        
        @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[3]/div/div/div[2]/div/form/div/div[2]/div/div/button")
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
        public void Click_city() {
            city.click();
        }
        public void Click_addcity() {
        	addcity.click();
        }
        public void Enter_City(String city) {
        	enter_city.sendKeys(city);
        }
        public void Click_addbutton() {
        	add_button.click();
        }

}
