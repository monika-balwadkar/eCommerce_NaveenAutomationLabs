package TestCases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.Footer;
import Resources.BaseClass;

public class Verify_Footer extends BaseClass {

	@Test
	public void footer() throws Exception {

		//This code checks all the links are click able or not,Count the no. of Links & print the link path
	//	System.out.println("Links Details:"+"\n");
		Footer obj = new Footer(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		

		SoftAssert footr = new SoftAssert();

		List<WebElement> li = driver.findElements(By.xpath("(//footer//div[@class='row']//div//ul//li)//a"));
		System.out.println("No. of Links is:"+ li.size());
		for(int k=0;k<li.size();k++)
		{
			
			
			String url=li.get(k).getAttribute("href");
			
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			   conn.setRequestMethod("HEAD");
			   conn.connect();

			   int respCode = conn.getResponseCode();

			   System.out.println(respCode);

			   footr.assertTrue(respCode < 400, "The link with Text" + li.get(k).getText() + " is broken with code" + respCode);

			  }

			  footr.assertAll();
		
		}
		
		
		/*for (int i = 0; i < obj.noOfLink().size(); i++) {

			System.out.println("Link Name: " + obj.noOfLink().get(i).getText().toUpperCase()+"   ");

			obj.noOfLink().get(i).click();

			if (obj.noOfLink().get(i).isEnabled()) {
				System.out.println("Link Clickable= " + obj.noOfLink().get(i).isEnabled());
			} else {
				System.out.println("Link not clickable= " + obj.noOfLink().get(i).isEnabled());
			}
			String getLinkPath= obj.noOfLink().get(i).getAttribute("href");
			System.out.println("Link path: "+ getLinkPath);
			System.out.println();
		}*/
		
		
	}

