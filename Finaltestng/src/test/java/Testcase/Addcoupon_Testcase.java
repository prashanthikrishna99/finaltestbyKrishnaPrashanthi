package Testcase;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.PO_Addcoupon;
import Utility.BrowserManager;

public class Addcoupon_Testcase {
	
	WebDriver driver;
	JSONObject addcoupon;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		InputStream datais =null;
		try {
			
			String FileName="data/addcoupon.json";
			datais = getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener =new JSONTokener(datais);
			addcoupon = new JSONObject(tokener);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(datais != null) {
				datais.close();
			}
		}
	}
	@BeforeMethod
	@Parameters({"Browser","url"})
	public void setUp(String Browser,String url) throws InterruptedException {
		driver = BrowserManager.getDriver(Browser);
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
	}
	
	@Test(priority=1)
		public void Valid_Data() {
		try {
			String uname=addcoupon.getJSONObject("Valid").getString("uname");
			String pw=addcoupon.getJSONObject("Valid").getString("pw");
			String cc=addcoupon.getJSONObject("Valid").getString("cc");
		
			PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
			obj.Valid(uname,pw,cc);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public void Invalidspecial_Data() {
	try {
		String uname=addcoupon.getJSONObject("Valid").getString("uname");
		String pw=addcoupon.getJSONObject("Valid").getString("pw");
		String cc=addcoupon.getJSONObject("Valid").getString("cc");
	
		PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
		obj.Invalidspecial(uname,pw,cc);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=3)
	public void Invalidnum_Data() {
	try {
		String uname=addcoupon.getJSONObject("Valid").getString("uname");
		String pw=addcoupon.getJSONObject("Valid").getString("pw");
		String cc=addcoupon.getJSONObject("Valid").getString("cc");
	
		PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
		obj.Invalidnum(uname,pw,cc);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=4)
	public void Invalidspaces_Data() {
	try {
		String uname=addcoupon.getJSONObject("Valid").getString("uname");
		String pw=addcoupon.getJSONObject("Valid").getString("pw");
		String cc=addcoupon.getJSONObject("Valid").getString("cc");
	
		PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
		obj.Invalidspaces(uname,pw,cc);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=5)
	public void Invaliddoubspaces_Data() {
	try {
		String uname=addcoupon.getJSONObject("Valid").getString("uname");
		String pw=addcoupon.getJSONObject("Valid").getString("pw");
		String cc=addcoupon.getJSONObject("Valid").getString("cc");
	
		PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
		obj.Invaliddoubspaces(uname,pw,cc);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=6)
	public void Invalidnumspecial_Data() {
	try {
		String uname=addcoupon.getJSONObject("Valid").getString("uname");
		String pw=addcoupon.getJSONObject("Valid").getString("pw");
		String cc=addcoupon.getJSONObject("Valid").getString("cc");
	
		PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
		obj.Invalidnumspecial(uname,pw,cc);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=7)
	public void Invalidalphaspecial_Data() {
	try {
		String uname=addcoupon.getJSONObject("Valid").getString("uname");
		String pw=addcoupon.getJSONObject("Valid").getString("pw");
		String cc=addcoupon.getJSONObject("Valid").getString("cc");
	
		PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
		obj.Invalidalphaspecial(uname,pw,cc);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	
	@AfterMethod
	public void tearDown() {
	
	}

	@AfterClass
	public void stopReport() {
		
	}

	

}
