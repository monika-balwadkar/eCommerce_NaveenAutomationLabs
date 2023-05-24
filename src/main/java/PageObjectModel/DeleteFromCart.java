package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteFromCart {

	public WebDriver driver;
	
	private By searchBox = By.xpath("//input[@name='search']");
	private By searchBT = By.xpath("(//button[@type='button'])[4]");
	private By clickOnSelectedItem = By.xpath("//a[normalize-space()='MacBook']");
	private By addToCart = By.xpath("//button[@id='button-cart']");
	private By fetchNotification = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	private By fetchATCText = By.xpath("//span[@id='cart-total']");
	private By ATCBt = By.xpath("(//button[@type='button'])[5]");
	private By clickViewCart = By.xpath("//strong[normalize-space()='View Cart']");
	private By removeFromCart = By.xpath("//button[@class='btn btn-danger']");
	private By fetchmsg1 = By.xpath("//div[@id='content']//h1");
	private By fetchmsg2 = By.xpath("//div[@id='content']//h1/following-sibling::p");
	private By errMsg= By.xpath("(//p[contains(text(),'Your shopping cart is empty!')])[2]");
	
	
	public DeleteFromCart(WebDriver driver2)
	{
		this.driver = driver2;
	}
	
	public WebElement searchBox()
	{
		return driver.findElement(searchBox);
	}
	
	public WebElement searchBT() 
	{
		return driver.findElement(searchBT);
	}
	
	public WebElement clickOnSelectedItem()
	{
		return driver.findElement(clickOnSelectedItem);
	}
	
	public WebElement addToCart() 
	{
		return driver.findElement(addToCart);
	}
	
	public WebElement fetchNotification()
	{
		return driver.findElement(fetchNotification);
	}
	
	public WebElement fetchATCText()
	{
		return driver.findElement(fetchATCText);
	}
	
	public WebElement ATCBt()
	{
		return driver.findElement(ATCBt);
	}
	
	public WebElement clickViewCart() 
	{
		return driver.findElement(clickViewCart);
	}
	
	public WebElement removeFromCart()
	{
		return driver.findElement(removeFromCart);
	}
	
	public WebElement fetchmsg1()
	{
		return driver.findElement(fetchmsg1);
	}
	
	public WebElement fetchmsg2() 
	{
		return driver.findElement(fetchmsg2);
	}
	public WebElement errMsgfCheck()
	{
		return driver.findElement(errMsg);
	}
}
