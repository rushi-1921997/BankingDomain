package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class uptox_Login4Page 
{
    //declaration of variables globally in regular class	
	@FindBy(xpath="//span[text()='akshay d.']") private WebElement Usrnm;
	
	public uptox_Login4Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyuptox_LoginPageUsrnm() 
	{
		String actPN = Usrnm.getText();
		return actPN;
	}

}
