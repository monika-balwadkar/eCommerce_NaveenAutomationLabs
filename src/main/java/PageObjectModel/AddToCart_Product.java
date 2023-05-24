package PageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart_Product {

	public WebDriver driver;
	By search=By.xpath("//input[@name='search']");
	By searchBtn=By.xpath("//button[@class='btn btn-default btn-lg']");
	By addtocart=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[7]");
	By addtocartsamsung=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[8]");
	public By price=By.xpath("(//p[@class='price'])[1]");
	public By totalItemBtn=By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");
	public By expectedTotalPrice=By.xpath("(//td[@class='text-right'])[12]");
	
	public AddToCart_Product(WebDriver driver2)
	{
		this.driver=driver2;
	}
	public WebElement searchEnter()
	{
		return driver.findElement(search);
		
	}
	public WebElement searchBtnClick()
	{
		return driver.findElement(searchBtn);
	}
	public WebElement addtocartClick()
	{
		return driver.findElement(addtocart);
	}
	public WebElement addtocartClick1()
	{
		return driver.findElement(addtocartsamsung);
	}
	public WebElement priceCheck()
	{
		return driver.findElement(price);
	}
	public WebElement totalItemBtnClick()
	{
		return driver.findElement(totalItemBtn);
	}
	public WebElement expectedTotalPriceCheck()
	{
		return driver.findElement(expectedTotalPrice);
	}


}
