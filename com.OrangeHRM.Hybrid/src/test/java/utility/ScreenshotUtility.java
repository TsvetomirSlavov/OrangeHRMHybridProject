package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	
	public static void saveScreenshot(WebDriver lDriver,String pageName)
	{
		TakesScreenshot ts = (TakesScreenshot)lDriver;
		File source ;
		source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source,new File("C:\\Qspider\\Local\\com.OrangeHRM.Hybrid\\Screenshots\\"+pageName+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Screenshot not taken");
		} 
		
		
	}

}
