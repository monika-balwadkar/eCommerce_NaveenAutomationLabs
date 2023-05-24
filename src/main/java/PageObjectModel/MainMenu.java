package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu {
	public WebDriver driver;
//Desktop Xpath
	By desktop_menu=By.xpath("(//li[@class='dropdown'])[2]"); //desktop menu
	By show_all_desk=By.xpath("(//a[@class='see-all'])[1]"); //desktop see all
	By add_to_wishlist=By.xpath("(//i[@class='fa fa-heart'])[3]"); //desktop added to wishlist:cannon cam
	By WishList=By.xpath("//span[contains(text(),'Wish List (1)')]");
	
//Laptop Xpath
	By laptop_menu=By.xpath("(//li[@class='dropdown'])[3]"); //laptop menu
	By show_all_laptop=By.xpath("(//a[@class='see-all'])[2]");
	By list_view_laptop=By.xpath("//i[@class='fa fa-th-list']");
	By sort_by_laptop=By.xpath("//select[@id='input-sort']");
	By show_by_laptop=By.xpath("//select[@id='input-limit']");
	By compare_add_laptop=By.xpath("(//BUTTON[@TYPE='button'])[14]");
	By product_compare_laptop=By.xpath("//a[@id='compare-total']");
	By ProductComparison=By.xpath("//h1[contains(text(),'Product Comparison')]");
	
//Component Xpath
	By component_menu=By.xpath("(//li[@class='dropdown'])[4]");
	By component_option=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=25_28']");
	By component_grid=By.xpath("//i[@class='fa fa-th']");
//MP3Player Xpath
	By mp3player_menu=By.xpath("(//li[@class='dropdown'])[5]");
	By mp3_option=By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/category&path=34_56']");
	By mp3verify=By.xpath("//h2[contains(text(),'test 24')]");
	
	
	public MainMenu(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
//Desktop
	public WebElement desktopMenuClick()
	{
		return driver.findElement(desktop_menu);
	}
	public WebElement desktopShowAllClick()
	{
		return driver.findElement(show_all_desk);
	}
	public WebElement desktopAddtoWishlistClick()
	{
		return driver.findElement(add_to_wishlist);
	}
	public WebElement WishList()
	{
		return driver.findElement(WishList);
	}
///Laptop
	public WebElement laptopMenuClick()
	{
		return driver.findElement(laptop_menu);
	}
	public WebElement laptopShowAllClick()
	{
		return driver.findElement(show_all_laptop);
	}
	public WebElement laptopListViewClick()
	{
		return driver.findElement(list_view_laptop);
	}
	public WebElement laptopSortByClick()
	{
		return driver.findElement(sort_by_laptop);
	}
	public WebElement laptopShowByClick()
	{
		return driver.findElement(show_by_laptop);
	}
	public WebElement laptopCompareAddClick()
	{
		return driver.findElement(compare_add_laptop);
	}
	public WebElement laptopCompareProductClick()
	{
		return driver.findElement(product_compare_laptop);
	}
	public WebElement ProductComparison()
	{
		return driver.findElement(ProductComparison);
	}
//Component
	public WebElement componentMenuClick()
	{
		return driver.findElement(component_menu);
	}
	public WebElement componentOptionClick()
	{
		return driver.findElement(component_option);
	}
	public WebElement componentGridClick()
	{
		return driver.findElement(component_grid);
	}
//Mp3Player
	public WebElement mp3playerMenuClick()
	{
		return driver.findElement(mp3player_menu);
	}
	public WebElement mp3OptionClick()
	{
		return driver.findElement(mp3_option);
	}
	public WebElement mp3verify()
	{
		return driver.findElement(mp3verify);
	}
	
}