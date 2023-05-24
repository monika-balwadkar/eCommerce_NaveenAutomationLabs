package TestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import PageObjectModel.Login;
import Resources.BaseClass;
import Resources.Constant;



public class Verify_Login extends BaseClass
{
	SoftAssert assertion = new SoftAssert();
	
	@Test
	public void validlogin() throws IOException, InterruptedException
	{
		Login hpo=new Login(driver);
		hpo.accountClick().click();
		hpo.accountLoginClick().click();
		hpo.accountEmailEnter().sendKeys(Constant.account_email);
		hpo.accountPasswordEnter().sendKeys(Constant.account_password);
		hpo.accountLoginBtnClick().click();
		
		// Assertion: Verify account login is successful
		assertion.assertEquals(hpo.logincheck().getText(), Constant.loginsuccescheck, "Account login failed");
		assertion.assertAll();
	}
}