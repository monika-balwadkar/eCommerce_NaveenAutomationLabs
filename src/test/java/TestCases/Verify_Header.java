package TestCases;

import java.time.Duration;


import org.testng.annotations.Test;

import PageObjectModel.AddToCart_Product;
import PageObjectModel.Header;
import PageObjectModel.MainMenu;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constant;

public class Verify_Header extends BaseClass {

	@Test
	public static void verifyHeader() throws InterruptedException
	{
		Header hpo=new Header(driver);
		AddToCart_Product apo=new AddToCart_Product(driver);
		MainMenu mpo = new MainMenu(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Perform the actions on Header Menu"+"\n");
//Currency
		hpo.currencyClick().click();
		hpo.currencyOptionSelect().click();
//PhoneNo
		hpo.phoneClick().click();
		hpo.phoneNameEnter().sendKeys(Constant.phone_name);
		hpo.phoneEmailEnter().sendKeys(Constant.phone_email);
		hpo.phoneEnquiryEnter().sendKeys(Constant.phone_enquiry);
		hpo.phoneSubmitClick().click();
//Account 
		hpo.accountClick().click();
		hpo.accountLoginClick().click();
		hpo.accountEmailEnter().sendKeys(Constant.account_email);
		hpo.accountPasswordEnter().sendKeys(Constant.account_password);
		hpo.accountLoginBtnClick().click();
//WishList
		hpo.wishlistClick().click();
		apo.searchEnter().sendKeys(Constant.search1);
		apo.searchBtnClick().click();
		mpo.desktopAddtoWishlistClick().click();
		hpo.wishlistToAddCart().click();
		
//Shopping Cart
		hpo.shoppingCartClick().click();
		hpo.shoppingCartQtyEnter().sendKeys(Constant.shop_cart_qty);
		hpo.shoppingCartRefreshClick().click();
//Checkout
		hpo.checkoutClick().click();
		hpo.checkoutEstimateShipTaxClick().click();
		CommonUtilities.handleDropDownByVisibleText(hpo.checkoutCountrySelect(),Constant.checkout_country);
		hpo.checkoutStateSelect().click();
		CommonUtilities.handleDropDownByVisibleText(hpo.checkoutStateSelect(),Constant.checkout_state);
		hpo.checkoutPincodeEnter().sendKeys(Constant.checkout_pincode);
		hpo.checkoutGetQuotesClick().click();
		hpo.checkoutGetQuotesPopupRadiobtnSelect().click();
		hpo.checkoutGetQuotesPopupApplyClick().click();
		Thread.sleep(3000);
	}
}
