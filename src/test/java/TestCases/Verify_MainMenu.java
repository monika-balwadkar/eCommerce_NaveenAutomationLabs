package TestCases;

import java.time.Duration;
import org.testng.annotations.Test;

import PageObjectModel.MainMenu;
import Resources.BaseClass;
import Resources.CommonUtilities;


public class Verify_MainMenu extends BaseClass {

	@Test
	public static void verifyMainMenu() throws InterruptedException
	{
		MainMenu mp=new MainMenu(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("To perform MouseOver action on Menu"+"\n");
//Mouseover to Desktop
		System.out.println("MouseOver on: "+ mp.desktopMenuClick().getText());
		CommonUtilities.mouseOverHandle(mp.desktopMenuClick(),driver);
		mp.desktopShowAllClick().click();    //click on desktop :show all
		mp.desktopAddtoWishlistClick().click(); //added product to wishList
		
//Mouseover to Laptop
		System.out.println("MouseOver on: "+mp.laptopMenuClick().getText());
		CommonUtilities.mouseOverHandle(mp.laptopMenuClick(),driver);  
		mp.laptopShowAllClick().click();
		mp.laptopListViewClick().click();
		CommonUtilities.handleDropDown(mp.laptopSortByClick(),3);
		CommonUtilities.handleDropDown(mp.laptopShowByClick(),1);
		mp.laptopCompareAddClick().click();
		mp.laptopCompareProductClick().click();
		
//Mouseover to Component
		System.out.println("MouseOver on: "+mp.componentMenuClick().getText());
		CommonUtilities.mouseOverHandle(mp.componentMenuClick(),driver); 
		mp.componentOptionClick().click();
		mp.componentGridClick().click();
		
//Mouseover to Mp3Player
		System.out.println("MouseOver on: "+mp.mp3playerMenuClick().getText());
		CommonUtilities.mouseOverHandle(mp.mp3playerMenuClick(),driver);
		mp.mp3OptionClick().click();
		
		
		
	}
}
