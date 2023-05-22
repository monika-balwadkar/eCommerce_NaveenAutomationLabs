package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.Footer;
import Resources.BaseClass;

public class Verify_Footer extends BaseClass {

	@Test
	public void footer() throws Exception {

		//This code checks all the links are click able or not,Count the no. of Links & print the link path
		System.out.println("Links Details:"+"\n");
		Footer obj = new Footer(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		obj.linktofooter().click();
		int count=obj.noOfLink().size(); 
		System.out.println("No. of Links on Footer is: "+count);
		System.out.println();
		for (int i = 0; i < obj.noOfLink().size(); i++) {

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
		}
		
	}
}
