package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nopcomhomtor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en");
		
		driver.manage().window().maximize();
		WebElement usericon=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li)[3]"));
		WebElement registerlink=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(usericon);
		action.click(registerlink).build().perform();
		
		


	}

}
