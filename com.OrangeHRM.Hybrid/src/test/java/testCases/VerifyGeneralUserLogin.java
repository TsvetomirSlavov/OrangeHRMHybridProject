package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;




import utility.LoginUtil;

public class VerifyGeneralUserLogin {

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
		loginpage.signIn(DataProviderFactory.getExcel().getData("UserIDpwd", 1, 0),DataProviderFactory.getExcel().getData("UserIDpwd", 1, 1));
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//BrowserFactory.closeBrowser(driver);
	}
}
