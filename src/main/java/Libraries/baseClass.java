package Libraries;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass 
{
//base class cosists of madnatory code that run every time like open browser
//use extend keword to inherited base class
//declare globally
	public WebDriver driver;
	public void initializebrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/"); //fetching link data from PF is not working
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
}
