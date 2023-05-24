package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login
{
	public WebDriver driver;

	By my_acnt=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");
	By acnt_login=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login'])[1]");
	By acnt_email=By.xpath("//input[@id='input-email']");
	By acnt_password=By.xpath("//input[@id='input-password']");
	By acnt_login_btn=By.xpath("//input[@type='submit']");
	By logincheck = By.xpath("//h2[contains(text(),'My Account')]");
	By wishlistsuccesadd = By.xpath("//div[contains(text(),'Success: You have added')]");
	
	public Login(WebDriver driver) 
	{ 
		this.driver = driver;
	}
	
	public WebElement accountClick()
	{
		return driver.findElement(my_acnt);
	}
	
	public WebElement accountLoginClick()
	{
		return driver.findElement(acnt_login);
	}
	
	public WebElement accountEmailEnter()
	{
		return driver.findElement(acnt_email);
	}
	
	public WebElement accountPasswordEnter()
	{
		return driver.findElement(acnt_password);
	}
	
	public WebElement accountLoginBtnClick()
	{
		return driver.findElement(acnt_login_btn);
	}
	
	public WebElement logincheck()
	{
		return driver.findElement(logincheck);
	}
	
	public WebElement wishlistsuccesadd()
	{
		return driver.findElement(wishlistsuccesadd);
	}
}