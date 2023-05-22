package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleAssertion {

public WebDriver driver;
	
	private By clickoncurrency = By.xpath("//span[normalize-space()='Currency']");
	private By currencyDropDown = By.xpath("//button[@name='EUR']");
	private By clickphoneNo = By.xpath("//span[normalize-space()='123456789']");
	private By clickmyAccount = By.xpath("//span[normalize-space()='My Account']");
	private By myAccountDropDown = By.xpath("//a[normalize-space()='Register']");
	private By clickWishList = By.xpath("//span[normalize-space()='Wish List (0)']");
	private By pageText = By.xpath("//h2[normalize-space()='New Customer']");
	private By clickShoppingCart = By.xpath("//span[normalize-space()='Shopping Cart']");
	private By pageText2 = By.xpath("//h1[normalize-space()='Shopping Cart']");
	private By clickCheckout = By.xpath("//span[normalize-space()='Checkout']");
	
	public HandleAssertion(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement clickoncurrency() {
		return driver.findElement(clickoncurrency);
	}
	
	public WebElement currencyDropDown() {
		return driver.findElement(currencyDropDown);
	}
	
	public WebElement clickphoneNo() {
		return driver.findElement(clickphoneNo);
	}
	
	public WebElement clickmyAccount() {
		return driver.findElement(clickmyAccount);
	}
	
	public WebElement myAccountDropDown() {
		return driver.findElement(myAccountDropDown);
	}
	
	public WebElement clickWishList() {
		return driver.findElement(clickWishList);
	}
	
	public WebElement pageText() {
		return driver.findElement(pageText);
	}
	
	
	public WebElement clickShoppingCart() {
		return driver.findElement(clickShoppingCart);
	}
	
	public WebElement pageText2() {
		return driver.findElement(pageText2);
	}
	
	public WebElement clickCheckout() {
		return driver.findElement(clickCheckout);
	}
	
}
