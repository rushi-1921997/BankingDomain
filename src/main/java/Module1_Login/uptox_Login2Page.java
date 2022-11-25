package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class uptox_Login2Page 
{
	//declaration of variables globally in regular class	
	@FindBy(xpath="//input[@name='yob']") private WebElement PIN;
	
	public uptox_Login2Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteruptox_Login2PagePIN(String PIN1)
	{
		PIN.sendKeys(PIN1);
	}
 
}
