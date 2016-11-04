package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageAdmin {

	WebDriver driver;
	public HomePageAdmin(WebDriver lDriver) {
		// TODO Auto-generated constructor stub
		this.driver=lDriver;
		
	}
	
   @FindBy(id="welcome") WebElement welcomeAdminMessage;
   @FindBy(xpath=".//*[@id='menu_admin_viewAdminModule']/b") WebElement adminTab;
 
   
   public String verifyWelcomeMessageforAdmin()
   {
	   return welcomeAdminMessage.getText();
   }
   
   public String verifyAdminTab()
   {
	   return adminTab.getText();
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
