package Assignment.Pushpa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDB {
	
	public WebDriver driver;
	
	public IMDB(WebDriver driver)
	{
		this.driver=driver;
	}

	By searchBox = By.xpath("//div[@class='sc-fodVxV cYLuAZ searchform__inputContainer']/div/input");
	By movieName = By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a");
	By releaseDate = By.xpath("//div[@data-testid='title-details-section']/ul/li[1]/div[1]/ul[1]/li[1]/a[1]");
	By country = By.xpath("//div[@data-testid='title-details-section']/ul/li[2]/div[1]/ul[1]/li[1]");
	
	public WebElement searchBox()
	{
		return driver.findElement(searchBox);
		
	}
	public WebElement movieName()
	{
		return driver.findElement(movieName);
		
	}
	public WebElement releaseDate()
	{
		return driver.findElement(releaseDate);
		
	}
	
	public WebElement country()
	{
		return driver.findElement(country);
		
	}

}
