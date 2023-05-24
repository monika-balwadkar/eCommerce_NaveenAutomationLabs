package Resources;

import java.util.Arrays;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities
{

	public static WebDriver driver;
	
//Handle Product price :Add To cart test case
	public static double productPriceHandle(String price1)
	{
		String price =price1;
		String pr[]=price.split("\\s+");
		System.out.println(Arrays.toString(pr));
		String a=pr[0];
		System.out.println("Method:"+a);
		String removeDoller=a;
		String AfterRemoveDoller=removeDoller.replaceAll("[$]","");
		System.out.println("Before parseDouble:"+AfterRemoveDoller);
		double d=Double.parseDouble(AfterRemoveDoller);
		System.out.println("After parseDouble:="+d);
		return d;
	}
	
//Handle Assertion
	public static void handleAssertions(String actual, String expected, String message)
	{
		SoftAssert a = new SoftAssert();
		String ac = actual;
		String exp = expected;
		a.assertEquals(ac, exp, message);
		a.assertAll();
	}
	
//Handle Dropdown by Index
	public static void handleDropDown(WebElement ele,int index)
	{
		WebElement ele1=ele; 
		Select s=new Select(ele1);
		s.selectByIndex(index);
	}
	
//Handle Dropdown by Visible Text
	public static void handleDropDownByVisibleText(WebElement ele,String str)
	{
		WebElement ele1=ele; 
		Select s=new Select(ele1);
		s.selectByVisibleText(str);
	}

//Handle Moverover
	public static void mouseOverHandle(WebElement ele,WebDriver driver) throws InterruptedException
	{
		WebElement ele1=ele;
		Actions action1=new Actions(driver);
		Thread.sleep(2000);
		action1.moveToElement(ele1).perform();
	}

//To generate random email id
	public  static String generateemail()
	{
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";    //random email getSaltString()+"@gmail.com"
		StringBuilder salt = new StringBuilder();  //StringBuilder class is used for e-mail generate
		Random rnd = new Random();
		while (salt.length() < 10)           // length of the random string
		{ 
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String email = salt.toString()+"@gmail.com";
		System.out.println(email);
		return email;
	}	

}