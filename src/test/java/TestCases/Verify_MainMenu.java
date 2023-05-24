package TestCases;

import java.time.Duration;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.MainMenu;
import Resources.BaseClass;
import Resources.CommonUtilities;

public class Verify_MainMenu extends BaseClass {

	@Test
	public static void verifyMainMenu() throws InterruptedException 
	{
		MainMenu mp = new MainMenu(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("To perform MouseOver action on Menu" + "\n");
		SoftAssert assertion = new SoftAssert();
		
//Mouseover to Desktop:---------------------------
		System.out.println("MouseOver on: " + mp.desktopMenuClick().getText());
		CommonUtilities.mouseOverHandle(mp.desktopMenuClick(), driver);
		mp.desktopShowAllClick().click(); // click on desktop :show all
		mp.desktopAddtoWishlistClick().click(); // added product to wishList
		String actualtext = mp.WishList().getText();
		String expectedtext = "Wish List (1)";
		assertion.assertEquals(actualtext, expectedtext, "wishlist not added");

//Mouseover to Laptop:---------------------------
		System.out.println("MouseOver on: " + mp.laptopMenuClick().getText());
		CommonUtilities.mouseOverHandle(mp.laptopMenuClick(), driver);
		mp.laptopShowAllClick().click();
		mp.laptopListViewClick().click();
		CommonUtilities.handleDropDown(mp.laptopSortByClick(), 3);
		CommonUtilities.handleDropDown(mp.laptopShowByClick(), 1);
		mp.laptopCompareAddClick().click();
		mp.laptopCompareProductClick().click();
		assertion.assertEquals(mp.ProductComparison().getText(), "Product Comparison", "comparison failed");
		
// Mouseover to Component:---------------------------
		System.out.println("MouseOver on: " + mp.mp3playerMenuClick().getText());
		CommonUtilities.mouseOverHandle(mp.mp3playerMenuClick(), driver);
		mp.mp3OptionClick().click();
		assertion.assertEquals(mp.mp3verify().getText(), "test 24", "verify player failed");
		
		assertion.assertAll();
	}
}