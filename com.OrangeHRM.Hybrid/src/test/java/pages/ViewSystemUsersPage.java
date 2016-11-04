package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ScreenshotUtility;




public class ViewSystemUsersPage {

	WebDriver driver;
	public ViewSystemUsersPage(WebDriver lDriver) {
		// TODO Auto-generated constructor stub
		this.driver=lDriver;
		
	}
	
   @FindBy(id="btnAdd") WebElement addButton;
   @FindBy(xpath="//a[@id='welcome']") WebElement welcomeAdminLink;
   @FindBy(id="searchSystemUser_userName") WebElement searchBox;
   @FindBy(id="searchBtn") WebElement searchButton;
   @FindBy(id="btnDelete") WebElement deleteButton;
   
  
   
  
   
 
   
   
   
   public void clickonAddButton() throws Exception
   {
	   
	 addButton.click();
	 Thread.sleep(3000);
	   
}
   
 
   
   public String  getApplicationTitle()
   {
	   return driver.getTitle();
   }
   
   public String getURL()
   {
	  return driver.getCurrentUrl(); 
   }
   
   public String waitforSuccessfullyAddedMessage()
   {
	   
	   
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='message success fadable']")));   
	   String message = el.getText();
	   ScreenshotUtility.saveScreenshot(driver, "Successfully Saved");
	   System.out.println(message);
	   return message;
   }
   
   public void clickonLogut()
   {
	   welcomeAdminLink.click();
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Logout']")));   
	   el.click();
   }
   
   public void searchUser(String userName)
   {
	   searchBox.sendKeys(userName);
	   searchButton.click();
   }
   
   public void selectFoundUserCheckbox(String userName)
   {
	   String checkboxXPath= "//td[contains(.,'"+userName+"')]//preceding::input[@type='checkbox'][1]";
	   
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   WebElement checkboxToClick = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(checkboxXPath)));   
	   checkboxToClick.click();
	   
	   
   }
   
   public void deleteUser()
   {
	   deleteButton.click();
	  
			   
       WebDriverWait wait = new WebDriverWait(driver, 10);
	   WebElement confirmDeleteButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dialogDeleteBtn")));   
	   confirmDeleteButton.click();
   }
   
   public String waitforSuccessfullyDeletedMessage()
   {
	   
	   
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='message success fadable']")));   
	   String message = el.getText();
	   ScreenshotUtility.saveScreenshot(driver, "Successfully Deleted");
	   System.out.println(message);
	   return message;
   }

}
