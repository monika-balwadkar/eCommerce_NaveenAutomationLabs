package Resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.extentManager.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public Properties prop;
	
	public void initializeDriver() throws IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
	
			
		}
		else
		{
			System.out.println("Browser is not accessible");
		}
	}
	
	 @BeforeTest
	 public void ExtentReport() 
	 {
		 ExtentManager.setup();
	 }
	 
	@BeforeMethod
	public void launchUrl() throws IOException
	{
		initializeDriver();
		String urlName=prop.getProperty("url");
		driver.manage().window().maximize();
		driver.get(urlName);
	}
	
	@AfterMethod
	public void driverclose() throws IOException
	{
		 
	  driver.quit();
	}

	@AfterTest
	public void endReport()
	 {
	     ExtentManager.endReport();
	 }
	
	 //Screenshot method is used when script is fails.
	 public static String screenShot(WebDriver driver,String filename)
	 {
		  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		  String destination = System.getProperty("user.dir")+"\\ScreenShot\\"+filename+"_"+dateName+".png";
		  File finalDestination= new File(destination);
		  try 
		  {
			  FileUtils.copyFile(source, finalDestination);
		  } 
		  catch (Exception e)
		  {
			  e.getMessage();
		  }
		  return destination;
	 }
}