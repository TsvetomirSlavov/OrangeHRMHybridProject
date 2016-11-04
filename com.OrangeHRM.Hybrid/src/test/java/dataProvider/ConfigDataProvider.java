package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	public ConfigDataProvider() {
		// TODO Auto-generated constructor stub
		
		File src = new File("C:/Users/Soumen/workspace/com.orangeHRM.Hybrid/Configuration/config.properties");
		
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is "+e.getMessage());
		}
		
		
	}
	
	public String getApplicationURL()
	{
		 String url = pro.getProperty("url");
		 return url;
	}
	
	public String getChromePath()
	{
		String chromePath = pro.getProperty("chromePath");
		return chromePath;
	}
	
	public String getInternetExplorerPath()
	{
		String iePath = pro.getProperty("iePath");
		return iePath;
	}

}
