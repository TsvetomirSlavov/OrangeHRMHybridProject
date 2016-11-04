package utility;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class GeneralUserLogin {
	WebDriver driver;
	
	
	
	public GeneralUserLogin(WebDriver lDriver) {
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
