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

import PO.PO_Updatecategory;
import Utility.BrowserManager;

public class Updatecategory_Testcase {
	
	WebDriver driver;
	JSONObject updatecategory;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		InputStream datais =null;
		try {
			
			String FileName="data/updatecategory.json";
			datais = getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener =new JSONTokener(datais);
			updatecategory = new JSONObject(tokener);
			
			
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
		
		String uname=updatecategory.getJSONObject("Valid").getString("uname");
		String pw=updatecategory.getJSONObject("Valid").getString("pw");
		String name=updatecategory.getJSONObject("Valid").getString("name");
		String imagepath=updatecategory.getJSONObject("Valid").getString("imagepath");

	
		PO_Updatecategory obj=PageFactory.initElements(driver, PO_Updatecategory.class);
		obj.Valid(uname,pw,name,imagepath);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=2)
	public void InValidnums_Data() {
	try {
		
		String uname=updatecategory.getJSONObject("InValidnums").getString("uname");
		String pw=updatecategory.getJSONObject("InValidnums").getString("pw");
		String name=updatecategory.getJSONObject("InValidnums").getString("name");
		String imagepath=updatecategory.getJSONObject("InValidnums").getString("imagepath");

	
		PO_Updatecategory obj=PageFactory.initElements(driver, PO_Updatecategory.class);
		obj.InValidnums(uname,pw,name,imagepath);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=3)
	public void InValidspecial_Data() {
	try {
		
		String uname=updatecategory.getJSONObject("InValidspecial").getString("uname");
		String pw=updatecategory.getJSONObject("InValidspecial").getString("pw");
		String name=updatecategory.getJSONObject("InValidspecial").getString("name");
		String imagepath=updatecategory.getJSONObject("InValidspecial").getString("imagepath");

	
		PO_Updatecategory obj=PageFactory.initElements(driver, PO_Updatecategory.class);
		obj.InValidspecial(uname,pw,name,imagepath);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=4)
	public void InValidalpha_Data() {
	try {
		
		String uname=updatecategory.getJSONObject("InValidalpha").getString("uname");
		String pw=updatecategory.getJSONObject("InValidalpha").getString("pw");
		String name=updatecategory.getJSONObject("InValidalpha").getString("name");
		String imagepath=updatecategory.getJSONObject("InValidalpha").getString("imagepath");

	
		PO_Updatecategory obj=PageFactory.initElements(driver, PO_Updatecategory.class);
		obj.InValidalpha(uname,pw,name,imagepath);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=5)
	public void InValidalphanum_Data() {
	try {
		
		String uname=updatecategory.getJSONObject("InValidalphanum").getString("uname");
		String pw=updatecategory.getJSONObject("InValidalphanum").getString("pw");
		String name=updatecategory.getJSONObject("InValidalphanum").getString("name");
		String imagepath=updatecategory.getJSONObject("InValidalphanum").getString("imagepath");

	
		PO_Updatecategory obj=PageFactory.initElements(driver, PO_Updatecategory.class);
		obj.InValidalphanum(uname,pw,name,imagepath);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=6)
	public void InValidspecialalpha_Data() {
	try {
		
		String uname=updatecategory.getJSONObject("InValidspecialalpha").getString("uname");
		String pw=updatecategory.getJSONObject("InValidspecialalpha").getString("pw");
		String name=updatecategory.getJSONObject("InValidspecialalpha").getString("name");
		String imagepath=updatecategory.getJSONObject("InValidspecialalpha").getString("imagepath");

	
		PO_Updatecategory obj=PageFactory.initElements(driver, PO_Updatecategory.class);
		obj.InValidspecialalpha(uname,pw,name,imagepath);
	}catch(Exception e) {
		e.printStackTrace();
	}
}
	@Test(priority=7)
	public void InValidspaces_Data() {
	try {
		
		String uname=updatecategory.getJSONObject("InValidspaces").getString("uname");
		String pw=updatecategory.getJSONObject("InValidspaces").getString("pw");
		String name=updatecategory.getJSONObject("InValidspaces").getString("name");
		String imagepath=updatecategory.getJSONObject("InValidspaces").getString("imagepath");

	
		PO_Updatecategory obj=PageFactory.initElements(driver, PO_Updatecategory.class);
		obj.InValidspaces(uname,pw,name,imagepath);
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
