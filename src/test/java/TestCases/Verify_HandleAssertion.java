package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.HandleAssertion;
import Resources.BaseClass;
import Resources.CommonUtilities;

public class Verify_HandleAssertion extends BaseClass
{

	@Test
	public void verify_Assertion_Header() throws Exception 
	{

		//This code check all the header links are click able or not

		HandleAssertion obj = new HandleAssertion(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.clickoncurrency().click();
		System.out.println("To handle Assertion:"+"\n");
		try 
		{
			//To handle the Assertion, we are deliberately failing the script(we have replace €,by Q)
			CommonUtilities.handleAssertions(obj.currencyDropDown().getText(), "Q Euro", "It is not Working");
		} 
		catch (AssertionError exe) 
		{
			System.out.println("Currency Drop Down is not Clickable");
		}

		try 
		{
			CommonUtilities.handleAssertions(obj.clickphoneNo().getText(), "123456789", "it is not working");
		} 
		catch (AssertionError exe) 
		{
			System.out.println("soft assert fail");
		}
		Thread.sleep(5000);
		obj.clickmyAccount().click();

		try 
		{
			CommonUtilities.handleAssertions(obj.myAccountDropDown().getText(), "Register", "it is not working");
		}
		catch (AssertionError exe)
		{
			System.out.println("soft assert fail");
		}
		Thread.sleep(5000);
		obj.clickWishList().click();

		try 
		{
			CommonUtilities.handleAssertions(obj.pageText().getText(), "New Customer", "it is not working");
		} 
		catch (AssertionError exe) 
		{
			System.out.println("soft assert fail");
		}

		Thread.sleep(5000);
		obj.clickShoppingCart().click();

		try 
		{
			CommonUtilities.handleAssertions(obj.pageText2().getText(), "Shopping Cart", "it is not working");
		}
		catch (AssertionError exe) 
		{
			System.out.println("soft assert fail");
		}

		Thread.sleep(5000);
		obj.clickCheckout().click();

		try
		{
			CommonUtilities.handleAssertions(obj.pageText2().getText(), "Shopping Cart", "it is not working");
		}
		catch (AssertionError exe) 
		{
			System.out.println("soft assert fail");
		}

		
	}
}
