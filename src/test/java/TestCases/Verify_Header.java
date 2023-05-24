package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.AddToCart_Product;
import PageObjectModel.Header;
import PageObjectModel.MainMenu;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constant;

public class Verify_Header extends BaseClass 
{

	@Test
	public static void verifyHeader() throws InterruptedException
	{
		Header hpo = new Header(driver);
		AddToCart_Product apo = new AddToCart_Product(driver);
		MainMenu mpo = new MainMenu(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SoftAssert assertion = new SoftAssert();

// Currency:---------------------------
		hpo.currencyClick().click();
		hpo.currencyOptionSelect().click();
		hpo.currencyClick().click();
		Thread.sleep(4000);
		// Assertion: Verify currency is set to the selected option
		assertion.assertEquals(hpo.currencyOptionSelect().getText(), Constant.currencyoptionexpected,
				"Currency is not set to the selected option");

// phone:----------------------------------
		hpo.phoneClick().click();
		hpo.phoneNameEnter().sendKeys(Constant.phone_name);
		hpo.phoneEmailEnter().sendKeys(Constant.phone_email);
		hpo.phoneEnquiryEnter().sendKeys(Constant.phone_enquiry);
		hpo.phoneSubmitClick().click();
		// Assertion: Verify phone submission is successful
		assertion.assertEquals(hpo.isquerysuccess().getText(), Constant.expectquesrysucces, "Phone submission failed");

// Account:----------------------------
		hpo.accountClick().click();
		hpo.accountLoginClick().click();
		hpo.accountEmailEnter().sendKeys(Constant.account_email);
		hpo.accountPasswordEnter().sendKeys(Constant.account_password);
		hpo.accountLoginBtnClick().click();
		// Assertion: Verify account login is successful
		assertion.assertEquals(hpo.logincheck().getText(), Constant.loginsuccescheck, "Account login failed");

// Wishlist:---------------------------
		hpo.wishlistClick().click();
		apo.searchEnter().sendKeys(Constant.search1);
		apo.searchBtnClick().click();
		mpo.desktopAddtoWishlistClick().click();
		hpo.wishlistToAddCart().click(); 		
		// Assertion: Verify item is added to the list
		assertion.assertEquals(hpo.wishlistsuccesadd().getText().substring(0, 23), Constant.wishlistexpect,
				"Item is not added to the wishlist");

// Shopping Cart------------------------
		hpo.shoppingCartClick().click();
		hpo.shoppingCartQtyEnter().clear();
		hpo.shoppingCartQtyEnter().sendKeys("3");
		hpo.shoppingCartRefreshClick().click();
		// Assertion:Verify shopping cart is updated with the specified quantity
		assertion.assertEquals(hpo.cartcount().getAttribute("value"), "3", "Shopping cart quantity is incorrect");

// Checkout:---------------------------
		hpo.checkoutClick().click();
		hpo.checkoutEstimateShipTaxClick().click();
		CommonUtilities.handleDropDownByVisibleText(hpo.checkoutCountrySelect(), Constant.checkout_country);
		hpo.checkoutStateSelect().click();
		CommonUtilities.handleDropDownByVisibleText(hpo.checkoutStateSelect(), Constant.checkout_state);
		hpo.checkoutPincodeEnter().sendKeys(Constant.checkout_pincode);
		hpo.checkoutGetQuotesClick().click();
		hpo.checkoutGetQuotesPopupRadiobtnSelect().click();
		hpo.checkoutGetQuotesPopupApplyClick().click();
		Thread.sleep(4000);
		// Add assertions related to the checkout process as needed
		assertion.assertEquals(hpo.checkoutbuttonavailable().getText(), "Checkout");
		
		assertion.assertAll();
	}
}