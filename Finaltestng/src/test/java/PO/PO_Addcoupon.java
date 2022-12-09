package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Addcoupon {
	
	
	WebDriver driver;
	public PO_Addcoupon(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using ="//*[@id=\"useremail\"]")
	WebElement username;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"LoginForm\"]/button")
	WebElement signin;
	
	@FindBy(how=How.XPATH, using ="/html/body/div[1]/div/div[1]/ul/li[8]/a")
	WebElement coupon;
	
	@FindBy(how=How.XPATH, using ="/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
	WebElement Addcoupon;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"coupon_name\"]")
	WebElement Couponcode;

	@FindBy(how=How.XPATH, using ="//*[@id=\"addcategory\"]/div/div[2]/div/div/button")
	WebElement add;
	
	public void EnterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void Enterpassword(String pw) {
		password.sendKeys(pw);
	}
	
	public void Click_signin() {
		signin.click();
	}
	
	public void Click_Coupon() {
		coupon.click();
	}
	
	public void Click_Addcoupon() {
		Addcoupon.click();
	}
	
	public void Enter_Couponcode(String cc) {
		Couponcode.sendKeys(cc);
	}
	
	public void Click_add() {
		add.click();
	}
	
	public void Valid(String uname, String pw, String cc) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_Coupon();
		Click_Addcoupon();
		Enter_Couponcode(cc);
		Click_add();
		
	}
	
	public void Invalidspecial(String uname, String pw, String cc) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_Coupon();
		Click_Addcoupon();
		Enter_Couponcode(cc);
		Click_add();
		
	}
	
	public void Invalidnum(String uname, String pw, String cc) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_Coupon();
		Click_Addcoupon();
		Enter_Couponcode(cc);
		Click_add();
		
	}
	
	public void Invalidspaces(String uname, String pw, String cc) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_Coupon();
		Click_Addcoupon();
		Enter_Couponcode(cc);
		Click_add();
		
	}
	
	public void Invaliddoubspaces(String uname, String pw, String cc) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_Coupon();
		Click_Addcoupon();
		Enter_Couponcode(cc);
		Click_add();
		
	}
	public void Invalidnumspecial(String uname, String pw, String cc) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_Coupon();
		Click_Addcoupon();
		Enter_Couponcode(cc);
		Click_add();
		
	}
	
	public void Invalidalphaspecial(String uname, String pw, String cc) {
		EnterUsername(uname);
		Enterpassword(pw);
		Click_signin();
		Click_Coupon();
		Click_Addcoupon();
		Enter_Couponcode(cc);
		Click_add();
		
	}
	
	
	
	
}
