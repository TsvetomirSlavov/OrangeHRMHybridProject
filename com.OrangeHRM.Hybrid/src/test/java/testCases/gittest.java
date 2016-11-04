package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.AdminDashboard;



import utility.LoginUtil;

public class gittest {

	WebDriver driver; 
	@BeforeMethod
	public void setup()
	{
		driver = BrowserFactory.getBrowser("Chrome");
		driver.get(DataProviderFactory.getConfig().getApplicationURL());
	}
	@Test
	public void testSignin()
	{   
		LoginUtil loginpage = PageFactory.initElements(driver,LoginUtil.class);
		loginpage.signIn(DataProviderFactory.getExcel().getData("UserIDpwd", 0, 0),DataProviderFactory.getExcel().getData("UserIDpwd", 0, 1));
		
		AdminDashboard adminDashboard = PageFactory.initElements(loginpage.returnDriver(),AdminDashboard.class);
		

		adminDashboard.moveToAdminTab();
		
		

        
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//BrowserFactory.closeBrowser(driver);
	}
}
