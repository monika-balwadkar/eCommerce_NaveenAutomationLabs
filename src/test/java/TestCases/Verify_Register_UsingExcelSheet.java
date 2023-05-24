package TestCases;

import java.io.FileInputStream;

import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.Register_UsingExcelSheetData;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.Constant;

public class Verify_Register_UsingExcelSheet extends BaseClass
{
	public static String email;
	SoftAssert assertions = new SoftAssert();

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
		System.out.println(Firstname); //Firstname access from excel sheet
		
		Cell cell1 = row.getCell(2);
		String Lastname = cell1.toString();
		System.out.println(Lastname); //Lastname access from excel sheet
		
		long phone= (long)(workbook.getSheetAt(0).getRow(1).getCell(4).getNumericCellValue());
		System.out.println(phone);	//Mobile no. access from excel sheet

		Cell cell3 = row.getCell(5);
		String Password = cell3.toString();
		System.out.println(Password); //Password access from excel sheet
		
		Register_UsingExcelSheetData obj = new Register_UsingExcelSheetData(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		obj.navigateToMyAc().click();
		obj.navigateToRegister().click();
		obj.enterName().sendKeys(Firstname);
		obj.enterLastName().sendKeys(Lastname);
		email = CommonUtilities.generateemail(); //Random email generate

		obj.email().sendKeys(email);
		obj.enterPhone().sendKeys(String.valueOf(phone));
		obj.enterPassword().sendKeys(Password);
		obj.enterConfirmPW().sendKeys(Password);
		obj.Checkagree().click();
		obj.clickContinue().click();
		String P = obj.registervalidtext().getText();
		assertions.assertEquals(P, Constant.expectedtextregister, "ENTER INVALID DATA");
		assertions.assertAll();

	}
}