package TestCases;

import java.time.Duration;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import PageObjectModel.ProductComparison;
import Resources.BaseClass;
import Resources.Constant;

public class Verify_ProductComparison extends BaseClass 
{

	@Test
	public void productComparison() throws InterruptedException
	{
		SoftAssert assertions =new SoftAssert();

		//Product Comparison and fetching basic product details from the table
		
		ProductComparison obj = new ProductComparison(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.searchItem().sendKeys(Constant.searchBox); // Search product: MacBook
		Thread.sleep(5000);
		obj.searchBT().click(); //Click on search button
		obj.compareBT().click(); // Click on compare button of 1st product
		obj.compareBT2().click(); //Click on compare button of 2nd product
		Thread.sleep(3000);
		obj.clickonCompareProduct().click(); //Product comparison link
		System.out.println("Comparision od Products:"+"\n");
		
		//For printing product details in console	
		System.out.println("1st Product Name: " + obj.productName().getText());
		System.out.println("2nd Product Name: " + obj.productName2().getText());
		System.out.println();
		System.out.println("1st Product Model: " + obj.productModel().getText());
		System.out.println("2nd Product Model: " + obj.productModel2().getText());
		System.out.println();
		System.out.println("1st Product Prize: " + obj.productPrize().getText());
		System.out.println("2nd Product Prize: " + obj.productPrize1().getText());
		System.out.println();
		System.out.println("1st Product Summary: " + obj.productSummary().getText());
		System.out.println("2nd Product Summary: " + obj.productSummary2().getText());
		
		String Q=obj.comaprisontext().getText();
		System.out.println(Q);
		Thread.sleep(2000);
		assertions.assertEquals(Q,Constant.expectedtextcomparison,"precast");
		assertions.assertAll();


	}
}