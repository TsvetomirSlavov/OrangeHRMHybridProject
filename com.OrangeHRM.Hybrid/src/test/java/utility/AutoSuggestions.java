package utility;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import factory.BrowserFactory;

public class AutoSuggestions {
	public static void main(String[] args) {
		WebDriver driver = BrowserFactory.getBrowser("Chrome");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.id("gs_htif0")).sendKeys("selenium");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List <WebElement> allOptions = driver.findElements(By.xpath("//td/span[text()='selenium']"));
		
	for (int i = 0; i < allOptions.size(); i++) {
			String option = allOptions.get(i).getText();
			System.out.println(option);
		}
	}
}