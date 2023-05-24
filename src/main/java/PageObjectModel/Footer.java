package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {

	public WebDriver driver;

	private By linktofooter = By.xpath("(//footer)[1]");
	private By noOfLink = By.xpath("(//footer//div[@class='row']//div//ul//li)//a");
		
	public Footer(WebDriver driver2)
	{
		this.driver=driver2;
	}
	
	public WebElement linktofooter()
	{
		return driver.findElement(linktofooter);
	}
	
	public List<WebElement> noOfLink() 
	{
		return driver.findElements(noOfLink);
	}
}
