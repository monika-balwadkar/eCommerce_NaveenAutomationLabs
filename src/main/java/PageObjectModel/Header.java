package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

	public WebDriver driver;
//Currency
	By currency=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[1]");
	By currency_option=By.xpath("(//button[@class='currency-select btn btn-link btn-block'])[2]");
	
//Phone
	By phone=By.xpath("//i[@class='fa fa-phone']");
	By ph_name=By.xpath("//input[@id='input-name']");
	By ph_email=By.xpath("//input[@id='input-email']");
	By ph_enquiry=By.xpath("//textarea[@id='input-enquiry']");
	By ph_submit=By.xpath("//input[@type='submit']");
    By isquerysuccess = By.xpath("//p[contains(text(),'Your enquiry has been successfully sent to the store owner!')]");
	
//Account
	By my_acnt=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");
	By acnt_login=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login'])[1]");
	By acnt_email=By.xpath("//input[@id='input-email']");
	By acnt_password=By.xpath("//input[@id='input-password']");
	By acnt_login_btn=By.xpath("//input[@type='submit']");
	 By logincheck = By.xpath("//h2[contains(text(),'My Account')]");
	 By wishlistsuccesadd = By.xpath("//div[contains(text(),'Success: You have added')]");

	
//WishList
	By wishlist=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");
	By wishlist_to_addcart=By.xpath("(//i[@class='fa fa-shopping-cart'])[4]");
	
//Shopping Cart
	By shopping_cart=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[5]");
	By shopping_cart_qty=By.xpath("(//input[@type='text'])[2]");
	By shopping_cart_refresh=By.xpath("(//i[@class='fa fa-refresh'])[1]");
	By cartcount=By.xpath("(//input[@type='text'])[2]");
	
//CheckOut
	By checkout=By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[6]");
	By checkout_estimateshiptax=By.xpath("(//a[@class='accordion-toggle'])[2]");
	By checkout_estimateshiptax_country=By.xpath("//select[@id='input-country']");
	By checkout_estimateshiptax_state=By.xpath("//select[@name='zone_id']");
	By checkout_estimateshiptax_pincode=By.xpath("//input[@id='input-postcode']");
	By checkout_estimateshiptax_getquotes=By.xpath("//button[@id='button-quote']");
	By checkout_estimateshiptax_getquotes_popup_radiobtn=By.xpath("//input[@type='radio']");
	By checkout_estimateshiptax_getquotes_popup_applybtn=By.xpath("//input[@id='button-shipping']");
	By checkoutbuttonavailable=By.xpath("//a[@class='btn btn-primary']");

	public Header(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
//Currency
	public WebElement currencyClick()
	{
		return driver.findElement(currency);
		
	}
	public WebElement currencyOptionSelect()
	{
		return driver.findElement(currency_option);
	}
//PhoneNo
	public WebElement phoneClick()
	{
		return driver.findElement(phone);
	}
	public WebElement phoneNameEnter()
	{
		return driver.findElement(ph_name);
	}
	public WebElement phoneEmailEnter()
	{
		return driver.findElement(ph_email);
	}
	public WebElement phoneEnquiryEnter()
	{
		return driver.findElement(ph_enquiry);
	}
	public WebElement phoneSubmitClick()
	{
		return driver.findElement(ph_submit);
	}
	
	public WebElement isquerysuccess()
	{
		return driver.findElement(isquerysuccess);
	}

//Account
	public WebElement accountClick()
	{
		return driver.findElement(my_acnt);
	}
	public WebElement accountLoginClick()
	{
		return driver.findElement(acnt_login);
	}
	public WebElement accountEmailEnter()
	{
		return driver.findElement(acnt_email);
	}
	public WebElement accountPasswordEnter()
	{
		return driver.findElement(acnt_password);
	}
	public WebElement accountLoginBtnClick()
	{
		return driver.findElement(acnt_login_btn);
	}
	public WebElement logincheck()
	{
		return driver.findElement(logincheck);
	}
	public WebElement wishlistsuccesadd()
	{
		return driver.findElement(wishlistsuccesadd);
	}
	
//WishList
	public WebElement wishlistClick()
	{
		return driver.findElement(wishlist);
	}
	public WebElement wishlistToAddCart()
	{
		return driver.findElement(wishlist_to_addcart);
	}
//ShoppingCart
	public WebElement shoppingCartClick()
	{
		return driver.findElement(shopping_cart);
	}
	public WebElement shoppingCartQtyEnter()
	{
		return driver.findElement(shopping_cart_qty);
	}
	public WebElement shoppingCartRefreshClick()
	{
		return driver.findElement(shopping_cart_refresh);
	}
	public WebElement cartcount()
	{
		return driver.findElement(cartcount);
	}
//Checkout
	public WebElement checkoutClick()
	{
		return driver.findElement(checkout);
	}
	public WebElement checkoutEstimateShipTaxClick()
	{
		return driver.findElement(checkout_estimateshiptax);
	}
	public WebElement checkoutCountrySelect()
	{
		return driver.findElement(checkout_estimateshiptax_country);
	}
	public WebElement checkoutStateSelect()
	{
		return driver.findElement(checkout_estimateshiptax_state);
	}
	public WebElement checkoutPincodeEnter()
	{
		return driver.findElement(checkout_estimateshiptax_pincode);
	}
	public WebElement checkoutGetQuotesClick()
	{
		return driver.findElement(checkout_estimateshiptax_getquotes);
	}
	public WebElement checkoutGetQuotesPopupRadiobtnSelect()
	{
		return driver.findElement(checkout_estimateshiptax_getquotes_popup_radiobtn);
	}
	public WebElement checkoutGetQuotesPopupApplyClick()
	{
		return driver.findElement(checkout_estimateshiptax_getquotes_popup_applybtn);
	}
	public WebElement checkoutbuttonavailable()
	{
		return driver.findElement(checkoutbuttonavailable);
	}
}