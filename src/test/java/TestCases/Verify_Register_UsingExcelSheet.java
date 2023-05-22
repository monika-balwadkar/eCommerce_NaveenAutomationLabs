package TestCases;

import java.io.FileInputStream;

import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObjectModel.Register_UsingExcelSheetData;
import Resources.BaseClass;

public class Verify_Register_UsingExcelSheet extends BaseClass
{
	@Test
	public void registerUser() throws Exception
	{

		//Register new user, fetching data from excel
		System.out.println("Data access from Excel Sheet:"+"\n");
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\Naveen_Automation_Prj.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(1);
		String Firstname = cell.toString();
		System.out.println(Firstname);
		
		Cell cell1 = row.getCell(2);
		String Lastname = cell1.toString();
		System.out.println(Lastname);
		
		Cell cell2 = row.getCell(3);
		String Email = cell2.toString();
		System.out.println(Email);
		
		long phone= (long)(workbook.getSheetAt(0).getRow(1).getCell(4).getNumericCellValue());
		System.out.println(phone);	

		Cell cell3 = row.getCell(5);
		String Password = cell3.toString();
		System.out.println(Password);
		
		Register_UsingExcelSheetData obj = new Register_UsingExcelSheetData(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.navigateToMyAc().click();
		obj.navigateToRegister().click();
		obj.enterName().sendKeys(Firstname);
		obj.enterLastName().sendKeys(Lastname);
		obj.enterEmail().sendKeys(Email);
		obj.enterPhone().sendKeys(String.valueOf(phone));
		obj.enterPassword().sendKeys(Password);
		obj.enterConfirmPW().sendKeys(Password);
		obj.Checkagree().click();
		obj.clickContinue().click();
		
	}
}
