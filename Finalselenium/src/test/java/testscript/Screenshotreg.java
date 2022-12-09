package testscript;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotreg {

	public static void main(String[] args) {
		try {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
		
		driver.manage().window().maximize();
		
		WebElement fn=driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement ln=driver.findElement(By.xpath("//input[@id='LastName']"));
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement conemail=driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
		WebElement username=driver.findElement(By.xpath("//input[@id='Username']"));
		Select country=new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
		country.selectByVisibleText("India");
		Select timezone=new Select(driver.findElement(By.xpath("//select[@id='TimeZoneId']")));
		timezone.selectByVisibleText("(UTC-10:00) Hawaii");
		WebElement check=driver.findElement(By.xpath("//label[@class='custom-control-label']"));
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement conpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		WebElement mycompp=driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));
		WebElement register=driver.findElement(By.id("register-button"));
		
		fn.sendKeys("Amy");
		ln.sendKeys("Doe");
		email.sendKeys("amydoe@gmail.com");
		conemail.sendKeys("amydoe@gmail.com");
		username.sendKeys("Amydoe");
		check.click();
		password.sendKeys("123456");
		conpassword.sendKeys("123456");
		mycompp.sendKeys("I am Student");
		register.click();
		
		
//		File screenShotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenShotFile, new File(".//Screenshots/nopcomss.png"));
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
