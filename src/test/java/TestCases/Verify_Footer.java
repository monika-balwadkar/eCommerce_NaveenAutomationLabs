package TestCases;

import java.net.HttpURLConnection;

import java.net.URL;
import java.time.Duration;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.Footer;
import Resources.BaseClass;

public class Verify_Footer extends BaseClass 
{

	@Test
	public void footer() throws Exception 
	{

		//This code checks all the links are click able or not,Count the no. of Links & print the link path
		System.out.println("Links Details:"+"\n");
		Footer obj = new Footer(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		SoftAssert assertion = new SoftAssert();

		System.out.println("No. of Links is:"+ obj.noOfLink().size()+"\n");
		for(int k=0;k<obj.noOfLink().size();k++)
		{
			
			String url=obj.noOfLink().get(k).getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			
			System.out.println("Link Name: " + obj.noOfLink().get(k).getText().toUpperCase());
			System.out.println("Response code of Link is:"+ respCode);
			System.out.println("Url of Link is:"+ url);
			
			//To handle the assertion, response code should be less than 400
			assertion.assertTrue(respCode < 400, "The link with Text" + obj.noOfLink().get(k).getText() + " is broken with code" + respCode);
			obj.noOfLink().get(k).click();
			Thread.sleep(2000);
			System.out.println();
		 }
		 assertion.assertAll();
	}
				
}

