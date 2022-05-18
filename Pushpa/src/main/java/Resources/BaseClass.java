package Resources;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	
	public  WebDriver initilizeDriver() throws Exception
	{
		prop = new Properties();
		FileReader obj = new FileReader("data.properties");
		prop.load(obj);
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		return driver;
	}
	

}
