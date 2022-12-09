package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Updatecategory {
	
	WebDriver driver;
	public PO_Updatecategory(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH, using ="//*[@id=\"useremail\"]")
	WebElement username;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"LoginForm\"]/button")
	WebElement signin;
	
	@FindBy(how=How.XPATH, using ="/html/body/div[1]/div/div[1]/ul/li[3]/a")
	WebElement product;
	
	@FindBy(how=How.XPATH, using ="/html/body/div[1]/div/div[1]/ul/li[3]/ul/li[1]/a")
	WebElement category;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"bootstrap-data-table-export\"]/tbody/tr[1]/td[6]/a[1]")
	WebElement updatename;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"category_name\"]")
	
	WebElement categoryname;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"bootstrap-data-table-export\"]/tbody/tr[1]/td[6]/a[2]")
	WebElement updateimage;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"addSubcategory\"]/div/div[1]/div/div/div/input")
	WebElement categoryimage;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"editCategory\"]/div[2]/div/button")
	WebElement updatenamebutton;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"addSubcategory\"]/div/div[2]/div/div/button")
	WebElement updateimagebutton;
	
	public void EnterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void Enterpassword(String pw) {
		password.sendKeys(pw);
	}
	
	public void Click_signin() {
		signin.click();
	}
	
	public void Click_product() {
		product.click();
	}
	
	public void click_Category() {
		category.click();
	}
	
	public void Click_updatename() {
		
		updatename.click();
	}
	public void Click_updatenamebutton() {
		updatenamebutton.click();
	}
	
	
	public void Click_category(String name) {
		categoryname.clear();
		categoryname.sendKeys(name);
		driver.navigate().back();
	}
	public void Click_updateimage() {
		updateimage.click();
	
	}
	
	public void Click_categoryimage(String imagepath) {
		categoryimage.sendKeys(imagepath);
	}
	public void Click_updateimagebutton() {
		updateimagebutton.click();
	}
	
	public void Valid(String uname, String pw, String name, String imagepath) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_product();
		click_Category();
		Click_updatename();
		Click_category(name);
		Click_updateimage();
		Click_categoryimage(imagepath);
		
	}
	public void InValidnums(String uname, String pw, String name, String imagepath) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_product();
		click_Category();
		Click_updatename();
		Click_category(name);
		Click_updateimage();
		Click_categoryimage(imagepath);
		
	}
	public void InValidspecial(String uname, String pw, String name, String imagepath) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_product();
		click_Category();
		Click_updatename();
		Click_category(name);
		Click_updateimage();
		Click_categoryimage(imagepath);
		
	}
	public void InValidalpha(String uname, String pw, String name, String imagepath) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_product();
		click_Category();
		Click_updatename();
		Click_category(name);
		Click_updateimage();
		Click_categoryimage(imagepath);
	}
		public void InValidalphanum(String uname, String pw, String name, String imagepath) {
			EnterUsername(uname);
			Enterpassword(pw);
			Click_signin();
			Click_product();
			click_Category();
			Click_updatename();
			Click_category(name);
			Click_updateimage();
			Click_categoryimage(imagepath);
			
		}
		public void InValidspecialalpha(String uname, String pw, String name, String imagepath) {
			EnterUsername(uname);
			Enterpassword(pw);
			Click_signin();
			Click_product();
			click_Category();
			Click_updatename();
			Click_category(name);
			Click_updateimage();
			Click_categoryimage(imagepath);
			
		}
		public void InValidspaces(String uname, String pw, String name, String imagepath) {
			EnterUsername(uname);
			Enterpassword(pw);
			Click_signin();
			Click_product();
			click_Category();
			Click_updatename();
			Click_category(name);
			Click_updateimage();
			Click_categoryimage(imagepath);
			
		}
}
