package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.DeleteFromCart;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constant;

public class Verify_DeleteFromCart extends BaseClass 
{

	@Test
	public void deleteFromCart() throws Exception
	{

		DeleteFromCart obj = new DeleteFromCart(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Deleting product from Cart:"+"\n");
		//Delete from shopping cart		
		obj.searchBox().sendKeys(Constant.searchBox);
		obj.searchBT().click();
		obj.clickOnSelectedItem().click();
		obj.addToCart().click();
		System.out.println("Notification: " + obj.fetchNotification().getText());
		System.out.println("Cart Value: " + obj.fetchATCText().getText());
		obj.ATCBt().click();
		obj.clickViewCart().click();
		obj.removeFromCart().click();
		System.out.println("Message: " + obj.fetchmsg1().getText() + "\n" + obj.fetchmsg2().getText());
		String s= obj.errMsgfCheck().getText();
		CommonUtilities.handleAssertions(s,Constant.expectedErrMsg,"Expty list not there");
		
	}
}
