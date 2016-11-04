package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;




public class AdminDashboard {

	WebDriver driver;
	public AdminDashboard(WebDriver lDriver) {
		// TODO Auto-generated constructor stub
		this.driver=lDriver;
		
	}
	
   @FindBy(xpath="//a[@id='menu_admin_viewAdminModule']/b[text()='Admin']") WebElement adminTab;
   //@FindBy(id="menu_admin_UserManagement") WebElement userManagement;
   //@FindBy(id="btnAdd") WebElement addUserButton;
 
   
   
   
   public void moveToAdminTab()
   {
	   
	   Actions actions = new Actions(driver);
	   actions.moveToElement(adminTab).perform();
	   adminTab.click();
	   System.out.println(adminTab.getText());
	  // actions.moveToElement(userManagement);
	   
	   
	   
   }
   
 
   
   public String  getApplicationTitle()
   {
	   return driver.getTitle();
   }
   
   public String getURL()
   {
	  return driver.getCurrentUrl(); 
   }
   
   public void clickOnaddUserButton()
   {
	   //addUserButton.click();
   }

}
