package Assignment.Pushpa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wiki {
	
public WebDriver driver;
	
	public wiki(WebDriver driver)
	{
		this.driver=driver;
	}

	By searchBox = By.xpath("//input[@class='gLFyf gsfi']");
	By wikiLink = By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[3]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/a/h3");
	By releaseDate = By.xpath("//table[@class='infobox vevent']/tbody/tr[12]/td/div/ul/li");
	By country = By.xpath("//table[@class='infobox vevent']/tbody/tr[14]/td");
	public WebElement searchBox()
	{
		return driver.findElement(searchBox);
		
	}
	public WebElement wikiLink()
	{
		return driver.findElement(wikiLink);
		
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
