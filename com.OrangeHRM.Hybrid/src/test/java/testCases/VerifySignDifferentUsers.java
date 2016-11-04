package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.HomePageAdmin;
import utility.LoginUtil;
import utility.ScreenshotUtility;

public class VerifySignDifferentUsers {

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
		System.out.println(driver.getTitle());
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		ScreenshotUtility.saveScreenshot(driver, "LoginPage");
		
        loginpage.signIn(DataProviderFactory.getExcel().getData("UserIDpwd", 0, 0),DataProviderFactory.getExcel().getData("UserIDpwd", 0, 1));

        
        HomePageAdmin adminHomePage = PageFactory.initElements(driver, HomePageAdmin.class);
        
        Assert.assertEquals("Welcome Admin",adminHomePage.verifyWelcomeMessageforAdmin());
        Assert.assertEquals("Admin", adminHomePage.verifyAdminTab());
        ScreenshotUtility.saveScreenshot(driver, "AdminHomepage");
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//BrowserFactory.closeBrowser(driver);
	}
}
