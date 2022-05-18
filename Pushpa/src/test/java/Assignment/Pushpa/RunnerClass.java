package Assignment.Pushpa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class RunnerClass extends BaseClass {

	JavascriptExecutor js;
	String IMDBrelDate;
	String IMDBcountry;
	String WIKIrelDate;
	String WIKICountry;
	
	@Test(priority = 1)
	void imdb() throws Exception
	{
		driver = initilizeDriver();
		driver.get(prop.getProperty("IMDBurl"));
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		IMDB obj = new IMDB(driver);
		obj.searchBox().sendKeys(prop.getProperty("name"));
		obj.searchBox().submit();
		
		obj.movieName().click();
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", obj.releaseDate());
		IMDBrelDate = obj.releaseDate().getText();
		
		js.executeScript("arguments[0].scrollIntoView()", obj.country());
		IMDBcountry= obj.country().getText();
		
		driver.close();
		
	}
	
	@Test(priority = 2)
	void wiki() throws Exception
	{
		driver = initilizeDriver();
		driver.get(prop.getProperty("GoogleUrl"));
		driver.manage().timeouts().implicitlyWait(20 , TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		wiki obj = new wiki(driver);
		obj.searchBox().sendKeys(prop.getProperty("name"));
		obj.searchBox().submit();
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", obj.wikiLink());
		obj.wikiLink().click();
		js.executeScript("arguments[0].scrollIntoView()", obj.releaseDate());
		WIKIrelDate = obj.releaseDate().getText();
		
		js.executeScript("arguments[0].scrollIntoView()", obj.country());
		WIKICountry = obj.country().getText();
			
		driver.close();
	}
	
	
	@Test(priority = 3)
	void compareCountry()
	{
		Assert.assertEquals(IMDBcountry, WIKICountry);
	}
	@Test(priority = 4)
	void compareReleaseDate()
	{
		Assert.assertEquals(WIKIrelDate, IMDBrelDate);
	}
	
}
