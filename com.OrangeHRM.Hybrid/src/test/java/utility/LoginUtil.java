package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginUtil {
	WebDriver driver;
	WebElement adminTab;
	
	
	
	public LoginUtil(WebDriver lDriver) {
		// TODO Auto-generated constructor stub
		this.driver=lDriver;
		
	}
	
   @FindBy(id="txtUsername") WebElement usernameTextBox;
   @FindBy(id="txtPassword") WebElement passwordTextBox;
   @FindBy(id="btnLogin") WebElement loginButton;
   
   
   public void  clickOnLoginButton()
   {
	   loginButton.click();
	   driver.manage().timeouts().implicitlyWait(3, TimeUnit.MILLISECONDS);
   }
   
 
  public void signIn(String userID, String password)
   {
	   usernameTextBox.sendKeys(userID);
	   passwordTextBox.sendKeys(password);
	   clickOnLoginButton();
	   
	   
		Boolean	adminTabisPresent = driver.findElements(By.xpath("//a[@id='menu_admin_viewAdminModule']/b[text()='Admin']")).size()>0;
		
	   
	   if (adminTabisPresent)
	   {
		   	  
		   
			   System.out.println("Admin Logged in Successfully");
		  
	   }   
	   
	   else if(!adminTabisPresent)
	   {
		   
		  
		   if(getURL().equals("https://enterprise-demo.orangehrmlive.com/dashboard"))
			   System.out.println(userID+"  Logged in Successfully");
		  
	   }  
		   
	   
   }
  
  public String  getApplicationTitle()
  {
	   return driver.getTitle();
  }
  
  public String getURL()
  {
	  return driver.getCurrentUrl(); 
  }
  
  public WebDriver returnDriver()
  {
	  return driver;
  }


}
