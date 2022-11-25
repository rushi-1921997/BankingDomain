package Module1_Login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libraries.baseClass;
import Libraries.uitilityClass;

public class testClass extends baseClass
{
	uptox_Login1Page obj1;
	uptox_Login2Page obj2;
	uptox_Login3Page obj3;
	uptox_Login4Page obj4;
    Sheet sh;
    int TestCaseID;
    
@BeforeClass
public void openBrowser() throws IOException
{
	initializebrowser();
	
	 obj1 = new uptox_Login1Page(driver);
	 obj2 = new uptox_Login2Page(driver);
	 obj3 = new uptox_Login3Page(driver);
	 obj4 = new uptox_Login4Page(driver);
}
	
@BeforeMethod
public void login() throws EncryptedDocumentException, IOException
{
	obj1.enteruptox_Login1PageUN(uitilityClass.getDataFromPF("UN"));
	
	obj1.enteruptox_Login1PagePWD(uitilityClass.getDataFromPF("PWD"));
	
	obj1.clickuptox_Login1PageSinbtn();

	
	uptox_Login2Page obj2 = new uptox_Login2Page(driver);
	obj2.enteruptox_Login2PagePIN(uitilityClass.getDataFromPF("PIN"));
	
	uptox_Login3Page obj3 = new uptox_Login3Page(driver);
	obj3.clickuptox_Login3PageWelbtn();
}

@Test
public void VerifyUserID() throws EncryptedDocumentException, IOException
{
	TestCaseID =102;
    String actPN = obj4.verifyuptox_LoginPageUsrnm();
    String expPN = uitilityClass.getTD(0, 3);
    //String expPN = "abcd"; if we want to take ss
	Assert.assertEquals(actPN, expPN);
}

@AfterMethod    //ITestResult interface
public void logOut(ITestResult result) throws IOException
{
	if (result.getStatus()==ITestResult.FAILURE)
	{
		uitilityClass.screenShot(driver ,TestCaseID);
	}
}

@AfterClass
public void closeBrowser()
{
	 //driver.close();
	
	 obj1 = null;
     obj2= null;
	 obj3= null;
	 obj4= null;
	 driver= null;
	 sh= null;
}
}
