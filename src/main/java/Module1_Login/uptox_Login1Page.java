package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class uptox_Login1Page 
{
	//declaration of variables globally in regular class	
	// use @Findby annotation
    @FindBy(xpath="//input[@name='userId']") private WebElement UN;
    @FindBy(xpath="//input[@name='password']") private WebElement PWD;
    @FindBy(xpath="//div[text()='Sign into Upstox']") private WebElement Sinbtn;
    
    //create an constructor pass webDriver and object as parameters
    //use initElements method of class pageFactory and pass object of webdirver and this keyword.
    public uptox_Login1Page(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    //utilize within method with access level public
    public void enteruptox_Login1PageUN(String username)
    {
    UN.sendKeys(username);	
    }
    
    public void enteruptox_Login1PagePWD(String password)
    {
    PWD.sendKeys(password);	
    }
    
    public void clickuptox_Login1PageSinbtn()
    {
    	Sinbtn.click();
    }
    
}
