package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
}
