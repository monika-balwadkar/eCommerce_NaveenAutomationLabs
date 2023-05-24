package PageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductComparison {

	public WebDriver driver;
	
	private By searchItem = By.xpath("//input[@placeholder='Search']");
	private By searchBT = By.xpath("//span[@class='input-group-btn']");
	private By compareBT = By.xpath("(//button[@data-original-title='Compare this Product'])[1]");
	private By compareBT2 = By.xpath("(//button[@data-original-title='Compare this Product'])[2]");
	private By clickonCompareProduct = By.linkText("product comparison");
	private By productName = By.xpath("(//td[text()='Product']/following-sibling::td//a//strong)[1]");
	private By productName2 = By.xpath("(//td[text()='Product']/following-sibling::td//a//strong)[2]");
	private By productPrize = By.xpath("//td[text()='Price']/following-sibling::td");
	private By productPrize1 = By.xpath("//td[text()='Price']/following-sibling::td/following-sibling::td");
	private By productModel = By.xpath("//td[text()='Model']/following-sibling::td");
	private By productModel2 = By.xpath("//td[text()='Model']/following-sibling::td/following-sibling::td");
	private By productBrand = By.xpath("//td[text()='Brand']/following-sibling::td");
	private By productBrand2 = By.xpath("//td[text()='Brand']/following-sibling::td/following-sibling::td");
	private By productSummary = By.xpath("//td[text()='Summary']/following-sibling::td");
	private By productSummary2 = By.xpath("//td[text()='Summary']/following-sibling::td/following-sibling::td");
	private By comaprisontext=By.xpath("//h1[contains(text(),'Product Comparison')]");
	
	public ProductComparison(WebDriver driver2) 
	{
		this.driver = driver2;
	}

	public WebElement searchItem()
	
	{
		return driver.findElement(searchItem);
	}
	public WebElement comaprisontext() {
		return driver.findElement(comaprisontext);
	}
	
	public WebElement searchBT() 
	{
		return driver.findElement(searchBT);
	}
	
	public WebElement compareBT()
	{
		return driver.findElement(compareBT);
	}
	
	public WebElement compareBT2()
	{
		return driver.findElement(compareBT2);
	}
	
	public WebElement clickonCompareProduct() 
	{
		return driver.findElement(clickonCompareProduct);
	}
	
	public WebElement productName()
	{
		return driver.findElement(productName);
	}
	
	public WebElement productName2()
	{
		return driver.findElement(productName2);
	}
	
	public WebElement productPrize() 
	{
		return driver.findElement(productPrize);
	}
	
	public WebElement productPrize1()
	{
		return driver.findElement(productPrize1);
	}
	
	public WebElement productModel()
	{
		return driver.findElement(productModel);
	}
	
	public WebElement productModel2()
	{
		return driver.findElement(productModel2);
	}
	
	public WebElement productBrand() 
	{
		return driver.findElement(productBrand);
	}
	
	public WebElement productBrand2()
	{
		return driver.findElement(productBrand2);
	}
	
	public WebElement productSummary()
	{
		return driver.findElement(productSummary);
	}
	
	public WebElement productSummary2()
	{
		return driver.findElement(productSummary2);
	}
}