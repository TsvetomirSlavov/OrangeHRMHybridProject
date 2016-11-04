package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;




public class SaveSystemUserPage {

	WebDriver driver;
	public SaveSystemUserPage(WebDriver lDriver) {
		// TODO Auto-generated constructor stub
		this.driver=lDriver;
		
	}
	
	@FindBy(id="systemUser_employeeName_empName") WebElement empName;
	@FindBy(id="systemUser_userName") WebElement userName;
	@FindBy(id="systemUser_password") WebElement userPassword;
	@FindBy(id="systemUser_confirmPassword") WebElement confirmUserPassword; 
	@FindBy(id="btnSave") WebElement saveButton; 
 
  
   
   public void clickonSaveButton()
   {
	   
	 saveButton.click();
	   
}
   
 
   
   public String  getApplicationTitle()
   {
	   return driver.getTitle();
   }
   
   public String getURL()
   {
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return driver.getCurrentUrl(); 
   }
   
   public String setUserIDandPassword()
   {
	   empName.sendKeys("Brody Alan"); 
	   String userNameString = "balan"+System.currentTimeMillis();
	   userName.sendKeys(userNameString); 
	   userPassword.sendKeys("Computer123#"); 
	   confirmUserPassword.sendKeys("Computer123#"); 
	   return userNameString;
	   
   }
   
   

}
