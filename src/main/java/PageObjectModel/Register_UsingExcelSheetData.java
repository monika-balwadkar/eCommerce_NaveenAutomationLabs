package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register_UsingExcelSheetData {

	public WebDriver driver;

	private By navigateToMyAc = By.xpath("//span[normalize-space()='My Account']");
	private By navigateToRegister = By.xpath("(//a[normalize-space()='Register'])[1]");
	private By enterName = By.xpath("//input[@id='input-firstname']");
	private By enterLastName = By.xpath("//input[@id='input-lastname']");
	private By enterEmail = By.xpath("//input[@id='input-email']");
	private By enterPhone = By.xpath("//input[@id='input-telephone']");
	private By enterPassword = By.xpath("//input[@id='input-password']");
	private By enterConfirmPW = By.xpath("//input[@id='input-confirm']");
	private By Checkagree = By.xpath("//input[@name='agree']");
	private By clickContinue = By.xpath("//input[@value='Continue']");
	private By validtext=By.xpath("//p[contains(text(),'Congratulations! Your new account has been successfully created!')]");
	private By email = By.xpath("//input[@name='email']");

	public Register_UsingExcelSheetData(WebDriver driver2) 
	{
		this.driver=driver2;
	}

	public WebElement navigateToMyAc() 
	{
		return driver.findElement(navigateToMyAc);
	}

	public WebElement navigateToRegister() 
	{
		return driver.findElement(navigateToRegister);
	}

	public WebElement enterName()
	{
		return driver.findElement(enterName);
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}

	public WebElement enterLastName() 
	{
		return driver.findElement(enterLastName);
	}

	public WebElement enterEmail() 
	{
		return driver.findElement(enterEmail);
	}

	public WebElement enterPhone()
	{
		return driver.findElement(enterPhone);
	}

	public WebElement enterPassword()
	{
		return driver.findElement(enterPassword);
	}

	public WebElement enterConfirmPW() 
	{
		return driver.findElement(enterConfirmPW);
	}

	public WebElement Checkagree()
	{
		return driver.findElement(Checkagree);
	}

	public WebElement clickContinue() 
	{
		return driver.findElement(clickContinue);
	}
	
	public WebElement registervalidtext()
	{
		return driver.findElement(validtext);
	}


}