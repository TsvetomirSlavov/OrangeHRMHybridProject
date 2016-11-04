package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver lDriver) {
		// TODO Auto-generated constructor stub
		this.driver=lDriver;
		
	}
	
   @FindBy(id="txtUsername") WebElement usernameTextBox;
   @FindBy(id="txtPassword") WebElement passwordTextBox;
   @FindBy(id="btnLogin") WebElement loginButton;
   
   
   public void clickOnLoginButton()
   {
	   loginButton.click();
   }
   
 
   
   public String  getApplicationTitle()
   {
	   return driver.getTitle();
   }
   
   public String getURL()
   {
	  return driver.getCurrentUrl(); 
   }
   
  

}
