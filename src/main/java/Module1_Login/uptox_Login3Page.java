package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class uptox_Login3Page 
{
	//declaration of variables globally in regular class	
	@FindBy(xpath="//button[@data-id='declineTour']") private WebElement Welbtn ;
	//div[text()='No, I�m good']"
	public uptox_Login3Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickuptox_Login3PageWelbtn()
	{
		Welbtn.click();
	}

}
